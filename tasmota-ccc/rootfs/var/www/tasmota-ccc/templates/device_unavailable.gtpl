        <tr>
            <td>
                <table>
                    <tr>
                        <td rowspan="2">
                            <img src="tasmota_unavailable.png" alt="Tasmota" width="32" height="32">
                        </td>
                        <td>
                            <p style="color:darkgrey"><b>{{ .name }}</b></p>
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
