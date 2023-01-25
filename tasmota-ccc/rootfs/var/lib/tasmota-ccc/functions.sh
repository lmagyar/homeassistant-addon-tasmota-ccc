#!/usr/bin/with-contenv bashio

function get_tasmota_devices() {

    local template=$(cat <<-EOTEMPLATE | tr '\n' ' '
    {
        "template": "
            {%- set data = namespace(devices=[]) %}
            {%- set devices = integration_entities('tasmota') |  map('device_id') | unique | list %}
            {%- for device in devices %}
            {%-   for connection in device_attr(device, 'connections') %}
            {%-     if connection[0] == 'mac' %}
            {%-       set data.devices = data.devices + [dict(
                          id = device,
                          available = (device | device_entities | length > 0 
                            and not is_state(device | device_entities | first, 'unavailable')),
                          url = device_attr(device, 'configuration_url'),
                          mac = connection[1],
                          name = device_attr(device, 'name'),
                          model = device_attr(device, 'model'),
                          version = device_attr(device, 'sw_version'),
                          area = area_name(device_attr(device, 'area_id'))
                        )] %}
            {%-     endif %}
            {%-   endfor %}
            {%- endfor %}
            {{ dict(result = 'ok', data = data.devices) | tojson }}
        "
    }
EOTEMPLATE
)

    bashio::api.supervisor POST /core/api/template "${template}"
}

function get_credentials() {
    local id=${1}

    jq -e ".devices[] | select(.id==\"${id}\")" /data/credentials.json
}

function delete_credentials() {
    local id=${1}

    if jq -e "del(.devices[] | select(.id==\"${1}\"))" /data/credentials.json > /data/credentials.json.tmp; then
        rm -f /data/credentials.json
        mv /data/credentials.json.tmp /data/credentials.json
    fi
}

function update_credentials() {
    local id=${1}
    local username=${2}
    local password=${3}

    if jq -e "del(.devices[] | select(.id==\"${1}\")) | .devices += [{\"id\": \"${id}\", \"username\": \"${username}\", \"password\": \"${password}\"}]" /data/credentials.json > /data/credentials.json.tmp; then
        rm -f /data/credentials.json
        mv /data/credentials.json.tmp /data/credentials.json
    fi
}
