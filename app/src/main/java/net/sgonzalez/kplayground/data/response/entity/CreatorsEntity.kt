package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.Creators

data class CreatorsEntity(@SerializedName(value = "available") val available: Int,
                          @SerializedName(value = "collectionURI") val collectionURI: String,
                          @SerializedName(value = "items") val items: List<Item>,
                          @SerializedName(value = "returned") val returned: Int) : Entity<Creators> {

  override fun toModel(): Creators {
    return Creators(available, collectionURI, items.map { Creators.Item(it.resourceURI, it.name, it.role) }, returned)
  }

  data class Item(@SerializedName(value = "resourceURI") val resourceURI: String,
                  @SerializedName(value = "name") val name: String,
                  @SerializedName(value = "role") val role: String)
}
