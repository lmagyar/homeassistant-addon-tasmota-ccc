location /webui/{{ .id }}/ {
    proxy_pass {{ .url }};
    proxy_pass_request_headers off;
    {{ if not (eq .encoded_credentials "null") }}proxy_set_header Authorization "Basic {{ .encoded_credentials }}";{{ end }}
}
