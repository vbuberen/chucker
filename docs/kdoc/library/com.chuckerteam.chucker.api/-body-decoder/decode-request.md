//[library](../../../index.md)/[com.chuckerteam.chucker.api](../index.md)/[BodyDecoder](index.md)/[decodeRequest](decode-request.md)

# decodeRequest

[androidJvm]\
abstract fun [decodeRequest](decode-request.md)(request: Request, body: ByteString): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?

Returns a text representation of [body](decode-request.md) that will be displayed in Chucker UI transaction, or null if [request](decode-request.md) cannot be handled by this decoder. [Body](decode-request.md) is no longer than [max content length](../-chucker-interceptor/-builder/max-content-length.md) and is guaranteed to be uncompressed even if [request](decode-request.md) has gzip or br header.
