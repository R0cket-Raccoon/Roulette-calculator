package com.example.casino.number

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.annotation.StringRes
sealed class Data
data class ButtonNumberData(
    @DrawableRes val drawableResourceId: Int,
     val idResourceId: String
): Data()
data class QuantityData(
    @DrawableRes val drawableResourceId:Int,
    val idResourceId: String,
    var stringResourceId:Int,
): Data()
