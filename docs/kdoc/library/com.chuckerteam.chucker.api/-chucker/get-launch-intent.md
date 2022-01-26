//[library](../../../index.md)/[com.chuckerteam.chucker.api](../index.md)/[Chucker](index.md)/[getLaunchIntent](get-launch-intent.md)

# getLaunchIntent

[androidJvm]\

@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)

fun [getLaunchIntent](get-launch-intent.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html)): [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)

Get an Intent to launch the Chucker UI directly.

#### Return

An Intent for the main Chucker Activity that can be started with [Context.startActivity](https://developer.android.com/reference/kotlin/android/content/Context.html#startactivity).

## Parameters

androidJvm

| | |
|---|---|
| context | An Android [Context](https://developer.android.com/reference/kotlin/android/content/Context.html). |
