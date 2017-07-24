package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.Url

data class UrlEntity(@SerializedName(value = "type") val type: String,
                     @SerializedName(value = "url") val url: String) : Entity<Url> {

  override fun toModel(): Url {
    return Url(type, url)
  }
}
