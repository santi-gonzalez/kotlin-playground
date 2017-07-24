package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.Variant

data class VariantEntity(@SerializedName(value = "resourceUri") val resourceUri: String,
                         @SerializedName(value = "name") val name: String) : Entity<Variant> {

  override fun toModel(): Variant {
    return Variant(resourceUri, name)
  }
}
