//[library](../../../../index.md)/[com.chuckerteam.chucker.api](../../index.md)/[ChuckerInterceptor](../index.md)/[Builder](index.md)/[redactHeaders](redact-headers.md)

# redactHeaders

[androidJvm]\
fun [redactHeaders](redact-headers.md)(headerNames: [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;): [ChuckerInterceptor.Builder](index.md)

fun [redactHeaders](redact-headers.md)(vararg headerNames: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [ChuckerInterceptor.Builder](index.md)

Sets headers that will be redacted if their names match. They will be replaced with the ** symbols in the Chucker UI.
