//[library](../../../../index.md)/[com.chuckerteam.chucker.api](../../index.md)/[ChuckerInterceptor](../index.md)/[Builder](index.md)/[addBodyDecoder](add-body-decoder.md)

# addBodyDecoder

[androidJvm]\
fun [addBodyDecoder](add-body-decoder.md)(decoder: [BodyDecoder](../../-body-decoder/index.md)): [ChuckerInterceptor.Builder](index.md)

Adds a [decoder](add-body-decoder.md) into Chucker's processing pipeline. Decoders are applied in an order they were added in. Request and response bodies are set to the first non–null value returned by any of the decoders.
