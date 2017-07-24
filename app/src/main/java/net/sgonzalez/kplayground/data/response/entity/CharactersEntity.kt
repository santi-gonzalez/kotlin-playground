package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.Characters

data class CharactersEntity(@SerializedName(value = "available") val available: Int,
                            @SerializedName(value = "collectionURI") val collectionURI: String,
                            @SerializedName(value = "item") val item: List<Item>,
                            @SerializedName(value = "returned") val returned: Int) : Entity<Characters> {

  override fun toModel(): Characters {
    return Characters(available, collectionURI, item.map { Characters.Item(it.resourceURI, it.name, it.type) }, returned)
  }

  data class Item(@SerializedName(value = "resourceURI") val resourceURI: String,
                  @SerializedName(value = "name") val name: String,
                  @SerializedName(value = "type") val type: String)
}
