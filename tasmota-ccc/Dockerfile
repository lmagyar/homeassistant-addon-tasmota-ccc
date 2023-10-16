ARG BUILD_FROM=ghcr.io/hassio-addons/base/amd64:14.2.2
# hadolint ignore=DL3006
FROM ${BUILD_FROM}

# Setup base
RUN \
    apk add --no-cache \
        nginx=1.24.0-r7 \
    \
    && mkdir -p /run/nginx

# Copy root filesystem
COPY rootfs /
