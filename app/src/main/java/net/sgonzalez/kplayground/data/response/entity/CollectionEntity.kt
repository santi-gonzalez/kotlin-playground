package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.Collection

data class CollectionEntity(@SerializedName(value = "resourceURI") val resourceURI: String,
                            @SerializedName(value = "name") val name: String) : Entity<Collection> {

  override fun toModel(): Collection {
    return Collection(resourceURI, name)
  }
}
