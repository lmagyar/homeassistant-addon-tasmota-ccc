        <tr>
            <td>
                <table>
                    <tr>
                        <td rowspan="2">
                            <img src="tasmota.png" alt="Tasmota" width="32" height="32">
                        </td>
                        <td>
                            <a href="webui/{{ .id }}/"><b>{{ .name }}</b></a>
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
