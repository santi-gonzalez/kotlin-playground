package net.sgonzalez.kplayground.domain.model

import com.google.gson.annotations.SerializedName

data class UserModel(@SerializedName(value = "id_str") val idStr: String)
