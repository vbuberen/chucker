Development of Chucker happens in the [`develop`](https://github.com/ChuckerTeam/chucker/tree/develop) branch. Every push to `develop` will trigger a publishing of a `SNAPSHOT` artifact for the upcoming version. You can get those snapshots artifacts directly from Sonatype with:

```gradle
repositories {
    maven { url "https://oss.sonatype.org/content/repositories/snapshots/" }
}
dependencies {
  debugImplementation "com.github.chuckerteam.chucker:library:3.4.1-SNAPSHOT"
  releaseImplementation "com.github.chuckerteam.chucker:library-no-op:3.4.1-SNAPSHOT"
}
```