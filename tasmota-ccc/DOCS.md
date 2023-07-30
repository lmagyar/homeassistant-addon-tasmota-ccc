# Home Assistant Custom Add-on: Tasmota proxy and update add-on

Provides a basic proxy toward the Tasmota devices' admin interface. Device
information comes from the Tasmota integration and not from network scanning.

## Installation

Follow these steps to get the add-on installed on your system:

1. Navigate in your Home Assistant frontend to **Settings** -> **Add-ons** ->
   **Add-on Store**.
2. In the **...** menu at the top right corner click **Repositories**, add
   `https://github.com/lmagyar/homeassistant-addon-tasmota-ccc` as repository.
3. Find the "Tasmota proxy and update" add-on and click it. If it doesn't show
   up, wait until HA refreshes the information about the add-on, or click
   **Check for updates** in the **...** menu at the top right corner.
4. Click on the "INSTALL" button.

## How to use

1. Start the add-on.
2. Check the add-on log output to see the result.

In case the device informations are changed, restart the add-on. Currently no
auto-refresh is available.

## Add-on Configuration

Currently there is no configuration needed.

## Support

Got questions?

You have several options to get them answered:

- The [Home Assistant Discord chat server][discord].
- The Home Assistant [Community Forum][forum].
- Join the [Reddit subreddit][reddit] in [/r/homeassistant][reddit]

You could also [open an issue here][issue] on GitHub.

[discord]: https://discord.gg/c5DvZ4e
[forum]: https://community.home-assistant.io/t/home-assistant-custom-add-on-tasmota-ccc/123456
[issue]: https://github.com/lmagyar/homeassistant-addon-tasmota-ccc/issues
[reddit]: https://reddit.com/r/homeassistant
