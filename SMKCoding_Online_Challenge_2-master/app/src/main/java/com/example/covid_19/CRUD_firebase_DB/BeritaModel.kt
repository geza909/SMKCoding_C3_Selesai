package com.example.covid_19.CRUD_firebase_DB

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "berita")
data class BeritaModel(
    val id :String?,
    val judul : String,
    val isi : String
    //@PrimaryKey var key: String

){
    constructor() : this("","","")
}
