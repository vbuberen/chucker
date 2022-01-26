//[library](../../index.md)/[com.chuckerteam.chucker.api](index.md)

# Package com.chuckerteam.chucker.api

## Types

| Name | Summary |
|---|---|
| [BodyDecoder](-body-decoder/index.md) | [androidJvm]<br>interface [BodyDecoder](-body-decoder/index.md)<br>Decodes HTTP request and response bodies to human–readable texts. |
| [Chucker](-chucker/index.md) | [androidJvm]<br>object [Chucker](-chucker/index.md)<br>Chucker methods and utilities to interact with the library. |
| [ChuckerCollector](-chucker-collector/index.md) | [androidJvm]<br>class [ChuckerCollector](-chucker-collector/index.md)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), showNotification: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), retentionPeriod: [RetentionManager.Period](-retention-manager/-period/index.md))<br>The collector responsible of collecting data from a [ChuckerInterceptor](-chucker-interceptor/index.md) and storing it/displaying push notification. You need to instantiate one of those and provide it to |
| [ChuckerInterceptor](-chucker-interceptor/index.md) | [androidJvm]<br>class [ChuckerInterceptor](-chucker-interceptor/index.md) : Interceptor<br>An OkHttp Interceptor which persists and displays HTTP activity in your application for later inspection. |
| [RetentionManager](-retention-manager/index.md) | [androidJvm]<br>class [RetentionManager](-retention-manager/index.md)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), retentionPeriod: [RetentionManager.Period](-retention-manager/-period/index.md))<br>Class responsible of holding the logic for the retention of your HTTP transactions. You can customize how long data should be stored here. |
