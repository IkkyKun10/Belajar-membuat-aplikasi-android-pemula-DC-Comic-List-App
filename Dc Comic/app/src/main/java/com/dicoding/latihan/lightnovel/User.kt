package com.dicoding.latihan.lightnovel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
    var name: String = "",
    var avatar: Int = 0,
    var description: String = "",
    var genreComic: String = ""
) : Parcelable