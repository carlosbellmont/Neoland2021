package com.cbellmont.neoland2021.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RegisteredUser(var email : String) {
    @PrimaryKey(autoGenerate = false)
    var id : Int = 0
}