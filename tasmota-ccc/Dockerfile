ARG BUILD_FROM=ghcr.io/hassio-addons/base/amd64:17.2.5
# hadolint ignore=DL3006
FROM ${BUILD_FROM}

# Setup base
RUN \
    apk add --no-cache \
        nginx=1.26.3-r0 \
    \
    && mkdir -p /run/nginx

# Copy root filesystem
COPY rootfs /

# Environment variables
ENV \
    # Add-on log format
    LOG_FORMAT="{TIMESTAMP} {LEVEL}: {MESSAGE}" \
    LOG_TIMESTAMP="%Y/%m/%d %H:%M:%S"
