package com.dicoding.picodiploma.exploreindonesia

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Wisata(
    val wisataSrc : Int,
    val wisataTitle : String,
    val wisataSubTitle : String,
    val wisataUri : String,
    val wisataDesc : String
) : Parcelable