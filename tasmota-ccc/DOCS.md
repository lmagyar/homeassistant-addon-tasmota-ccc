# Home Assistant Custom Add-on: Tasmota proxy and update add-on

Provides a basic proxy toward the Tasmota devices' admin interface. Device
information comes from the Tasmota integration and not from network scanning.

###TODO

## Installation

Follow these steps to get the add-on installed on your system:

1. Navigate in your Home Assistant frontend to **Settings** -> **Add-ons** ->
   **Add-on Store**.
2. In the **...** menu at the top right corner click **Repositories**, add
   `https://github.com/lmagyar/homeassistant-addon-tasmota-ccc` as repository.
3. Find the "Tasmota proxy and update add-on" add-on and click it. If it
   doesn't show up, wait until HA refreshes the information about the add-on, or
   click **Reload** in the **...** menu at the top right corner.
4. Click on the "INSTALL" button.

## How to use

1. Start the add-on.
2. Check the add-on log output to see the result.

In case the device informations are changed, restart the add-on. Currently no
auto-refresh is available.

###TODO

## Add-on Configuration

Currently there is no configuration needed.

**Note**: _Remember to restart the add-on when the configuration is changed._

Example add-on configuration:

```yaml
```

**Note**: _This is just an example, don't copy and paste it! Create your own!_

###TODO

### Option: `...`

###TODO

## Releases

Releases are based on [Semantic Versioning][semver], and use the format of
`MAJOR.MINOR.PATCH`. In a nutshell, the version will be incremented based on the
following:

- `MAJOR`: Incompatible or major changes.
- `MINOR`: Backwards-compatible new features and enhancements.
- `PATCH`: Backwards-compatible bugfixes and package updates.

## Support

Got questions?

You have several options to get them answered:

###TODO
<!--
- The [Home Assistant Community Add-ons Discord chat server][discord] for add-on
  support and feature requests.
- The [Home Assistant Discord chat server][discord-ha] for general Home
  Assistant discussions and questions.
- The Home Assistant [Community Forum][forum].
- Join the [Reddit subreddit][reddit] in [/r/homeassistant][reddit]
-->

You could also [open an issue here][issue] GitHub.

## Authors & contributors

The original setup of this repository is by [Laszlo Magyar][lmagyar].

For a full list of all authors and contributors, check [the contributor's
page][contributors].

## License

MIT License

Copyright (c) 2023-2023 Laszlo Magyar

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

[contributors]: https://github.com/lmagyar/homeassistant-addon-tasmota-ccc/graphs/contributors
[lmagyar]: https://github.com/lmagyar
[issue]: https://github.com/lmagyar/homeassistant-addon-tasmota-ccc/issues
[semver]: http://semver.org/spec/v2.0.0.html
<!--
[discord-ha]: https://discord.gg/###TODO
[discord]: https://discord.me/###TODO
[forum]: https://community.home-assistant.io/t/home-assistant-custom-add-on-tasmota-ccc/###TODO
[reddit]: https://reddit.com/r/###TODO
-->