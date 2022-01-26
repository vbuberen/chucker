//[library](../../../index.md)/[com.chuckerteam.chucker.api](../index.md)/[BodyDecoder](index.md)/[decodeResponse](decode-response.md)

# decodeResponse

[androidJvm]\
abstract fun [decodeResponse](decode-response.md)(response: Response, body: ByteString): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?

Returns a text representation of [body](decode-response.md) that will be displayed in Chucker UI transaction, or null if [response](decode-response.md) cannot be handled by this decoder. [Body](decode-response.md) is no longer than [max content length](../-chucker-interceptor/-builder/max-content-length.md) and is guaranteed to be uncompressed even if [response](decode-response.md) has gzip or br header.
