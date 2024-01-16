ARG BUILD_FROM=ghcr.io/hassio-addons/base/amd64:15.0.5
# hadolint ignore=DL3006
FROM ${BUILD_FROM}

# Setup base
RUN \
    apk add --no-cache \
        nginx=1.24.0-r14 \
    \
    && mkdir -p /run/nginx

# Copy root filesystem
COPY rootfs /
