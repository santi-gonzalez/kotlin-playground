package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.Image

data class ImageEntity(@SerializedName(value = "path") val path: String,
                       @SerializedName(value = "extension") val extension: String) : Entity<Image> {

  override fun toModel(): Image {
    return Image(path, extension)
  }
}
