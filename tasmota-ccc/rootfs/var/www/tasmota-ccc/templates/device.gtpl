        <tr>
            <td>
                <table>
                    <tr>
                        <td rowspan="2">
                            <img src={{ if eq .available "false" }}"tasmota_unavailable.png"{{ else }}"tasmota.png"{{ end }} alt="Tasmota" width="32" height="32">
                        </td>
                        <td>
                            <a{{ if eq .credentials_configured "true" }} href="webui/{{ .id }}/"{{ end }}><b>{{ .name }}</b></a>
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
