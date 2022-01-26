//[library](../../../index.md)/[com.chuckerteam.chucker.api](../index.md)/[BodyDecoder](index.md)

# BodyDecoder

[androidJvm]\
interface [BodyDecoder](index.md)

Decodes HTTP request and response bodies to human–readable texts.

## Functions

| Name | Summary |
|---|---|
| [decodeRequest](decode-request.md) | [androidJvm]<br>abstract fun [decodeRequest](decode-request.md)(request: Request, body: ByteString): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Returns a text representation of [body](decode-request.md) that will be displayed in Chucker UI transaction, or null if [request](decode-request.md) cannot be handled by this decoder. [Body](decode-request.md) is no longer than [max content length](../-chucker-interceptor/-builder/max-content-length.md) and is guaranteed to be uncompressed even if [request](decode-request.md) has gzip or br header. |
| [decodeResponse](decode-response.md) | [androidJvm]<br>abstract fun [decodeResponse](decode-response.md)(response: Response, body: ByteString): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Returns a text representation of [body](decode-response.md) that will be displayed in Chucker UI transaction, or null if [response](decode-response.md) cannot be handled by this decoder. [Body](decode-response.md) is no longer than [max content length](../-chucker-interceptor/-builder/max-content-length.md) and is guaranteed to be uncompressed even if [response](decode-response.md) has gzip or br header. |
