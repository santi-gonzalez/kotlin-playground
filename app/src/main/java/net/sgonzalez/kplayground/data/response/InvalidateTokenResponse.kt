package net.sgonzalez.kplayground.data.response

import com.google.gson.annotations.SerializedName

data class InvalidateTokenResponse(@SerializedName(value = "access_token") val accessToken: String)