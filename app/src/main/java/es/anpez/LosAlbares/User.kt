package es.anpez.LosAlbares

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(var nombre: String, var edad: Int): Parcelable
