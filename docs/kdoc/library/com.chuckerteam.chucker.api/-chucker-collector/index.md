//[library](../../../index.md)/[com.chuckerteam.chucker.api](../index.md)/[ChuckerCollector](index.md)

# ChuckerCollector

[androidJvm]\
class [ChuckerCollector](index.md)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), showNotification: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), retentionPeriod: [RetentionManager.Period](../-retention-manager/-period/index.md))

The collector responsible of collecting data from a [ChuckerInterceptor](../-chucker-interceptor/index.md) and storing it/displaying push notification. You need to instantiate one of those and provide it to

## Parameters

androidJvm

| | |
|---|---|
| context | An Android Context |
| showNotification | Control whether a notification is shown while HTTP activity is recorded. |
| retentionPeriod | Set the retention period for HTTP transaction data captured by this collector. The default is one week. |

## Constructors

| | |
|---|---|
| [ChuckerCollector](-chucker-collector.md) | [androidJvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [ChuckerCollector](-chucker-collector.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), showNotification: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, retentionPeriod: [RetentionManager.Period](../-retention-manager/-period/index.md) = RetentionManager.Period.ONE_WEEK) |

## Properties

| Name | Summary |
|---|---|
| [showNotification](show-notification.md) | [androidJvm]<br>var [showNotification](show-notification.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true |
