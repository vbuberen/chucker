Chucker is distributed through [Maven Central](https://search.maven.org/artifact/com.github.chuckerteam.chucker/library). To use it you need to add the following **Gradle dependency** to your `build.gradle` file of you android app module (NOT the root file).

Please note that you should add both the `library` and the the `library-no-op` variant to isolate Chucker from release builds as follows:

```groovy
dependencies {
  debugImplementation "com.github.chuckerteam.chucker:library:3.4.0"
  releaseImplementation "com.github.chuckerteam.chucker:library-no-op:3.4.0"
}
```

To start using Chucker, just plug it a new `ChuckerInterceptor` to your OkHttp Client Builder:

```kotlin
val client = OkHttpClient.Builder()
                .addInterceptor(ChuckerInterceptor(context))
                .build()
```

**That's it!** 🎉 Chucker will now record all HTTP interactions made by your OkHttp client.

Historically, Chucker was distributed through JitPack.
You can find older version of Chucker here: [![JitPack](https://jitpack.io/v/ChuckerTeam/chucker.svg)](https://jitpack.io/#ChuckerTeam/chucker).
