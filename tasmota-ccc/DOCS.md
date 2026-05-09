# Home Assistant Custom App: Tasmota proxy and update app

Provides a basic proxy toward the Tasmota devices' admin interface. Device
information comes from the Tasmota integration and not from network scanning.

## Installation

Follow these steps to get the app installed on your system:

1. In Home Assistant, go to **Settings** > **Apps** > **Install app**.
2. In the **...** menu at the top right corner click **Repositories**, add
   `https://github.com/lmagyar/homeassistant-addon-tasmota-ccc` as repository.
3. Find the "Tasmota proxy and update" app and click it. If it doesn't show
   up, wait until HA refreshes the information about the app, or click
   **Check for updates** in the **...** menu at the top right corner.
4. Click on the "INSTALL" button.

## How to use

1. Start the app.
2. Check the app log output to see the result.

In case the device informations are changed, restart the app. Currently no
auto-refresh is available.

## App Configuration

Currently there is no configuration needed.

## Support

Got questions?

You have several options to get them answered:

- The [Home Assistant Discord chat server][discord].
- The Home Assistant [Community Forum][forum].
- Join the [Reddit subreddit][reddit] in [/r/homeassistant][reddit]

You could also [open an issue here][issue] on GitHub.

[discord]: https://www.home-assistant.io/join-chat
[forum]: https://community.home-assistant.io/t/home-assistant-custom-add-on-tasmota-ccc/123456
[issue]: https://github.com/lmagyar/homeassistant-addon-tasmota-ccc/issues
[reddit]: https://reddit.com/r/homeassistant
