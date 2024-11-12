ARG BUILD_FROM=ghcr.io/hassio-addons/base/amd64:16.3.6
# hadolint ignore=DL3006
FROM ${BUILD_FROM}

# Setup base
RUN \
    apk add --no-cache \
        nginx=1.26.2-r0 \
    \
    && mkdir -p /run/nginx

# Copy root filesystem
COPY rootfs /
