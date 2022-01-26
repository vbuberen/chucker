//[library](../../../../index.md)/[com.chuckerteam.chucker.api](../../index.md)/[ChuckerInterceptor](../index.md)/[Builder](index.md)

# Builder

[androidJvm]\
class [Builder](index.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html))

Assembles a new [ChuckerInterceptor](../index.md).

## Parameters

androidJvm

| | |
|---|---|
| context | An Android [Context](https://developer.android.com/reference/kotlin/android/content/Context.html). |

## Constructors

| | |
|---|---|
| [Builder](-builder.md) | [androidJvm]<br>fun [Builder](-builder.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html)) |

## Functions

| Name | Summary |
|---|---|
| [addBodyDecoder](add-body-decoder.md) | [androidJvm]<br>fun [addBodyDecoder](add-body-decoder.md)(decoder: [BodyDecoder](../../-body-decoder/index.md)): [ChuckerInterceptor.Builder](index.md)<br>Adds a [decoder](add-body-decoder.md) into Chucker's processing pipeline. Decoders are applied in an order they were added in. Request and response bodies are set to the first non–null value returned by any of the decoders. |
| [alwaysReadResponseBody](always-read-response-body.md) | [androidJvm]<br>fun [alwaysReadResponseBody](always-read-response-body.md)(enable: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [ChuckerInterceptor.Builder](index.md)<br>If set to true[ChuckerInterceptor](../index.md) will read full content of response bodies even in case of parsing errors or closing the response body without reading it. |
| [build](build.md) | [androidJvm]<br>fun [build](build.md)(): [ChuckerInterceptor](../index.md)<br>Creates a new [ChuckerInterceptor](../index.md) instance with values defined in this builder. |
| [collector](collector.md) | [androidJvm]<br>fun [collector](collector.md)(collector: [ChuckerCollector](../../-chucker-collector/index.md)): [ChuckerInterceptor.Builder](index.md)<br>Sets the [ChuckerCollector](../../-chucker-collector/index.md) to customize data retention. |
| [createShortcut](create-shortcut.md) | [androidJvm]<br>fun [createShortcut](create-shortcut.md)(enable: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [ChuckerInterceptor.Builder](index.md)<br>If set to true, [ChuckerInterceptor](../index.md) will create a shortcut for your app to access list of transaction in Chucker. |
| [maxContentLength](max-content-length.md) | [androidJvm]<br>fun [maxContentLength](max-content-length.md)(length: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [ChuckerInterceptor.Builder](index.md)<br>Sets the maximum length for requests and responses content before their truncation. |
| [redactHeaders](redact-headers.md) | [androidJvm]<br>fun [redactHeaders](redact-headers.md)(vararg headerNames: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [ChuckerInterceptor.Builder](index.md)<br>fun [redactHeaders](redact-headers.md)(headerNames: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;): [ChuckerInterceptor.Builder](index.md)<br>Sets headers that will be redacted if their names match. They will be replaced with the ** symbols in the Chucker UI. |
