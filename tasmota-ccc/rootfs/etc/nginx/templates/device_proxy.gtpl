location /webui/{{ .id }}/ {
    proxy_pass {{ .url }};
    proxy_pass_request_headers off;
    {{ if not (eq .credentials "null") }}proxy_set_header Authorization "Basic {{ .credentials }}";{{ end }}
}
