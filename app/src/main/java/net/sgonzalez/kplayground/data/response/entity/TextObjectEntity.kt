package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.TextObject

data class TextObjectEntity(@SerializedName(value = "type") val type: String,
                            @SerializedName(value = "language") val language: String,
                            @SerializedName(value = "text") val text: String) : Entity<TextObject> {

  override fun toModel(): TextObject {
    return TextObject(type, language, text)
  }
}
