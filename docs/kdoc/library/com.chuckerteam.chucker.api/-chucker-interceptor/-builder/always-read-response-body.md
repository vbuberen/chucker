//[library](../../../../index.md)/[com.chuckerteam.chucker.api](../../index.md)/[ChuckerInterceptor](../index.md)/[Builder](index.md)/[alwaysReadResponseBody](always-read-response-body.md)

# alwaysReadResponseBody

[androidJvm]\
fun [alwaysReadResponseBody](always-read-response-body.md)(enable: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [ChuckerInterceptor.Builder](index.md)

If set to true[ChuckerInterceptor](../index.md) will read full content of response bodies even in case of parsing errors or closing the response body without reading it.

Warning: enabling this feature may potentially cause different behaviour from the production application.
