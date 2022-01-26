//[library](../../../index.md)/[com.chuckerteam.chucker.api](../index.md)/[ChuckerInterceptor](index.md)

# ChuckerInterceptor

[androidJvm]\
class [ChuckerInterceptor](index.md) : Interceptor

An OkHttp Interceptor which persists and displays HTTP activity in your application for later inspection.

## Constructors

| | |
|---|---|
| [ChuckerInterceptor](-chucker-interceptor.md) | [androidJvm]<br>fun [ChuckerInterceptor](-chucker-interceptor.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html))<br>An OkHttp Interceptor which persists and displays HTTP activity in your application for later inspection. |

## Types

| Name | Summary |
|---|---|
| [Builder](-builder/index.md) | [androidJvm]<br>class [Builder](-builder/index.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html))<br>Assembles a new [ChuckerInterceptor](index.md). |

## Functions

| Name | Summary |
|---|---|
| [intercept](intercept.md) | [androidJvm]<br>open override fun [intercept](intercept.md)(chain: Interceptor.Chain): Response |
| [redactHeader](redact-header.md) | [androidJvm]<br>fun [redactHeader](redact-header.md)(vararg headerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Adds [headerName](redact-header.md) into headersToRedact |
