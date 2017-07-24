package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.Date

data class DateEntity(@SerializedName(value = "type") val type: String,
                      @SerializedName(value = "date") val date: String) : Entity<Date> {

  override fun toModel(): Date {
    return Date(type, date)
  }
}
