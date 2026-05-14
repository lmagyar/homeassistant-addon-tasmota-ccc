ARG BUILD_FROM=ghcr.io/hassio-addons/base/amd64:20.1.1
# hadolint ignore=DL3006
FROM ${BUILD_FROM}

# Setup base
RUN \
    apk add --no-cache \
        nginx=1.28.3-r1 \
    \
    && mkdir -p /run/nginx

# Copy root filesystem
COPY rootfs /

# Environment variables
ENV \
    # App log format
    LOG_FORMAT="{TIMESTAMP} {LEVEL}: {MESSAGE}" \
    LOG_TIMESTAMP="%Y/%m/%d %H:%M:%S"
