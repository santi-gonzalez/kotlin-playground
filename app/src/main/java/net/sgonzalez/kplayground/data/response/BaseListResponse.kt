package net.sgonzalez.kplayground.data.response

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.data.response.entity.Entity

data class BaseListResponse<out E : Entity<*>>(@SerializedName(value = "code") val code: String,
                                               @SerializedName(value = "status") val status: String,
                                               @SerializedName(value = "copyright") val copyright: String,
                                               @SerializedName(value = "attributionText") val attributionText: String,
                                               @SerializedName(value = "attributionHTML") val attributionHTML: String,
                                               @SerializedName(value = "etag") val etag: String,
                                               @SerializedName(value = "data") val data: DataList<E>) : Response {

  data class DataList<out E>(@SerializedName(value = "offset") val offset: Int,
                             @SerializedName(value = "limit") val limit: Int,
                             @SerializedName(value = "total") val total: Int,
                             @SerializedName(value = "count") val count: Int,
                             @SerializedName(value = "results") val results: List<E>)
}
