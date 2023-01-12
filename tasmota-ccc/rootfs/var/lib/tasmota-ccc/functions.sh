#!/usr/bin/with-contenv bashio

function get_tasmota_devices() {

    local template=$(cat <<-EOTEMPLATE | tr '\n' ' '
    {
        "template": "
            {%- set data = namespace(devices=[]) %}
            {%- set devices = states | map(attribute='entity_id') | map('device_id') | unique | reject('eq', None) | list %}
            {%- for device in devices %}
            {%-   if is_device_attr(device, 'manufacturer', 'Tasmota') %}
            {%-     for connection in device_attr(device, 'connections') %}
            {%-       if connection[0] == 'mac' %}
            {%-         set data.devices = data.devices + [dict(
                                id = device,
                                url = device_attr(device, 'configuration_url'),
                                mac = connection[1],
                                name = device_attr(device, 'name'),
                                model = device_attr(device, 'model'),
                                version = device_attr(device, 'sw_version'),
                                available = (not is_state(device_entities(device)[0], 'unavailable')),
                                area = area_name(device_attr(device, 'area_id'))
                            )] %}
            {%-       endif %}
            {%-     endfor %}
            {%-   endif %}
            {%- endfor %}
            {{ dict(result = 'ok', data = data.devices) | tojson }}
        "
    }
EOTEMPLATE
)

    bashio::api.supervisor POST /core/api/template "${template}"
}
