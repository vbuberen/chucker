//[library](../../../index.md)/[com.chuckerteam.chucker.api](../index.md)/[ChuckerCollector](index.md)/[ChuckerCollector](-chucker-collector.md)

# ChuckerCollector

[androidJvm]\

@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)

fun [ChuckerCollector](-chucker-collector.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), showNotification: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, retentionPeriod: [RetentionManager.Period](../-retention-manager/-period/index.md) = RetentionManager.Period.ONE_WEEK)

## Parameters

androidJvm

| | |
|---|---|
| context | An Android Context |
| showNotification | Control whether a notification is shown while HTTP activity is recorded. |
| retentionPeriod | Set the retention period for HTTP transaction data captured by this collector. The default is one week. |
