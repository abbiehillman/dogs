package com.example.dogs

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Item(
    var message:  String,
    var status: Boolean
): Parcelable