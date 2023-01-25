        <tr>
            <td>
                <table>
                    <tr>
                        <td rowspan="2">
                            <img src={{ if eq .available "false" }}"tasmota_unavailable.png"{{ else }}"tasmota.png"{{ end }} alt="Tasmota" width="32" height="32">
                        </td>
                        <td>
                            {{ if eq .available "false" }}<p style="color:darkgrey">{{ else }}<a{{ if eq .configured "true" }} href="webui/{{ .id }}/"{{ end }}>{{ end }}<b>{{ .name }}</b>{{ if eq .available "false" }}</p>{{ else }}</a>{{ end }}
                        </td>
                    </tr>
                    <tr>
                        <td>
                            {{ .model }} | {{ .version }}{{ if not (eq .area "null") }} | {{ .area }}{{ end }}
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
