* Why are some of my request headers missing?
* Why are retries and redirects not being captured discretely?
* Why are my encoded request/response bodies not appearing as plain text?

Please refer to [this section of the OkHttp documentation](https://square.github.io/okhttp/interceptors/). You can choose to use Chucker as either an application or network interceptor, depending on your requirements.

* Why Android < 21 is no longer supported?

In order to keep up with the changes in OkHttp we decided to bump its version in `4.x` release. Chucker `3.4.x` supports Android 16+ but its active development stopped and only bug fixes and minor improvements will land on [3.x branch](https://github.com/ChuckerTeam/chucker/tree/3.x) till March 2021.