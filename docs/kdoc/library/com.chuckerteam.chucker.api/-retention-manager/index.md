//[library](../../../index.md)/[com.chuckerteam.chucker.api](../index.md)/[RetentionManager](index.md)

# RetentionManager

[androidJvm]\
class [RetentionManager](index.md)@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)constructor(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), retentionPeriod: [RetentionManager.Period](-period/index.md))

Class responsible of holding the logic for the retention of your HTTP transactions. You can customize how long data should be stored here.

## Parameters

androidJvm

| | |
|---|---|
| context | An Android Context |
| retentionPeriod | A [Period](-period/index.md) to specify the retention of data. Default 1 week. |

## Constructors

| | |
|---|---|
| [RetentionManager](-retention-manager.md) | [androidJvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [RetentionManager](-retention-manager.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), retentionPeriod: [RetentionManager.Period](-period/index.md) = Period.ONE_WEEK) |

## Types

| Name | Summary |
|---|---|
| [Period](-period/index.md) | [androidJvm]<br>enum [Period](-period/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[RetentionManager.Period](-period/index.md)&gt; |
