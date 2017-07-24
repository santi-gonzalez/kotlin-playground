package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.Thumbnail

data class ThumbnailEntity(@SerializedName(value = "path") val path: String,
                           @SerializedName(value = "extension") val extension: String) : Entity<Thumbnail> {

  override fun toModel(): Thumbnail {
    return Thumbnail(path, extension)
  }
}
