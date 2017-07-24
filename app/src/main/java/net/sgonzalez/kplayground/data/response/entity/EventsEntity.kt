package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.Events

data class EventsEntity(@SerializedName(value = "available") val available: Int,
                        @SerializedName(value = "collectionURI") val collectionURI: String,
                        @SerializedName(value = "items") val items: List<Item>,
                        @SerializedName(value = "returned") val returned: Int) : Entity<Events> {

  override fun toModel(): Events {
    return Events(available, collectionURI, items.map { Events.Item(it.resourceURI, it.name) }, returned)
  }

  data class Item(@SerializedName(value = "resourceURI") val resourceURI: String,
                  @SerializedName(value = "name") val name: String)
}
