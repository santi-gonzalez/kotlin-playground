package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.Stories

data class StoriesEntity(@SerializedName(value = "available") val available: Int,
                         @SerializedName(value = "collectionURI") val collectionURI: String,
                         @SerializedName(value = "items") val items: List<Item>,
                         @SerializedName(value = "returned") val returned: Int) : Entity<Stories> {

  override fun toModel(): Stories {
    return Stories(available, collectionURI, items.map { Stories.Item(it.resourceURI, it.name, it.type) }, returned)
  }

  data class Item(@SerializedName(value = "resourceURI") val resourceURI: String,
                  @SerializedName(value = "name") val name: String,
                  @SerializedName(value = "type") val type: String)
}
