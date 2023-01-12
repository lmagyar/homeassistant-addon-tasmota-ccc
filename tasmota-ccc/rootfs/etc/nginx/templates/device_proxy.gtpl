location /webui/{{ .id }}/ {
    proxy_pass {{ .url }};
}
