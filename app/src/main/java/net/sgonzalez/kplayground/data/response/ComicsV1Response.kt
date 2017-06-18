package net.sgonzalez.kplayground.data.response

import com.google.gson.annotations.SerializedName

data class ComicsV1Response(@SerializedName(value = "code") val code: String,
                            @SerializedName(value = "status") val status: String)
