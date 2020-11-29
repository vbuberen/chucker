Chucker simplifies the inspection of **HTTP(S) requests/responses**, and **Throwables** fired by your Android App. Chucker works as an **OkHttp Interceptor** persisting all those events inside your application, and providing a UI for inspecting and sharing their content.

Apps using Chucker will display a **push notification** showing a summary of ongoing HTTP activity and Throwables. Tapping on the notification launches the full Chucker UI. Apps can optionally suppress the notification, and launch the Chucker UI directly from within their own interface.

| HTTP Calls | Throwables |
| --- | --- |
| ![Chucker HTTP transactions](assets/chucker-http.gif) | ![Chucker errors](assets/chucker-error.gif) |

## Features 🧰

Don't forget to check the [changelog](CHANGELOG.md) to have a look at all the changes in the latest version of Chucker.

* Compatible with **OkHTTP 4**
* **API >= 16** compatible
* Easy to integrate (just 2 gradle `implementation` lines).
* Works **out of the box**, no customization needed.
* **Empty release artifact** 🧼 (no traces of Chucker in your final APK).
* Support for body text search with **highlighting** 🕵️‍♂️
* Support for showing **images** in HTTP Responses 🖼

### Multi-Window 🚪

The main Chucker activity is launched in its own task, allowing it to be displayed alongside the host app UI using Android 7.x multi-window support.

![Multi-Window](assets/chucker-multiwindow.gif)

### Throwables (Deprected) ☄️

#### Warning: This functionality will be unavailable in 4.x release. Details in [this issue](https://github.com/ChuckerTeam/chucker/issues/321#issuecomment-626138370)

Chucker can also collect and display **Throwables** of your application. To inform Chucker that a `Throwable` was fired you need to call the `onError` method of the `ChuckerCollector` (you need to retain an instance of your collector):

```kotlin
try {
    // Do something risky
} catch (IOException exception) {
    chuckerCollector.onError("TAG", exception)
}
```

### Redact-Header 👮‍♂️

**Warning** The data generated and stored when using Chucker may contain sensitive information such as Authorization or Cookie headers, and the contents of request and response bodies.

It is intended for **use during development**, and not in release builds or other production deployments.

You can redact headers that contain sensitive information by calling `redactHeader(String)` on the `ChuckerInterceptor`.

```kotlin
interceptor.redactHeader("Auth-Token", "User-Session");
```
