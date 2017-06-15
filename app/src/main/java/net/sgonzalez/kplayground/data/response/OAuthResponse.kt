package net.sgonzalez.kplayground.data.response

import com.google.gson.annotations.SerializedName

data class OAuthResponse(@SerializedName(value = "token_type") val tokenType: String,
                         @SerializedName(value = "access_token") val accessToken: String)