package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.Price

data class PriceEntity(@SerializedName(value = "type") val type: String,
                       @SerializedName(value = "price") val price: Number) : Entity<Price> {

  override fun toModel(): Price {
    return Price(type, price)
  }
}
