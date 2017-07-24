package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.ComicModel

data class ComicEntity(@SerializedName(value = "id") val id: String,
                       @SerializedName(value = "digitalId") val digitalId: Int?,
                       @SerializedName(value = "title") val title: String?,
                       @SerializedName(value = "issueNumber") val issueNumber: Int?,
                       @SerializedName(value = "variantDescription") val variantDescription: String?,
                       @SerializedName(value = "description") val description: String?,
                       @SerializedName(value = "modified") val modified: String?,
                       @SerializedName(value = "isbn") val isbn: String?,
                       @SerializedName(value = "upc") val upc: String?,
                       @SerializedName(value = "diamondCode") val diamondCode: String?,
                       @SerializedName(value = "ean") val ean: String?,
                       @SerializedName(value = "issn") val issn: String?,
                       @SerializedName(value = "format") val format: String?,
                       @SerializedName(value = "pageCount") val pageCount: Int?) : Entity<ComicModel> {

  override fun toModel(): ComicModel {
    return ComicModel(id,
                      digitalId ?: 0,
                      title ?: "",
                      issueNumber ?: 0,
                      variantDescription ?: "",
                      description ?: "",
                      modified ?: "",
                      isbn ?: "",
                      upc ?: "",
                      diamondCode ?: "",
                      ean ?: "",
                      issn ?: "",
                      format ?: "",
                      pageCount ?: 0)
  }
}
