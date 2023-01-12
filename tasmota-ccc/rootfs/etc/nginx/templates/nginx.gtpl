user root;
pid /var/run/nginx.pid;
worker_processes  1;

error_log /dev/stdout debug;

events {
    worker_connections 512;
}

http {
    include /etc/nginx/includes/mime.types;

    server {
        listen {{ .interface }}:{{ .port }} default_server;
        server_name hassio.local;

        allow  172.30.32.2;
        deny   all;
        # access_log /dev/stdout combined;

        include /etc/nginx/locations/*.conf;

    }
}
