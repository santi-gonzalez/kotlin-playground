package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.Series

data class SeriesEntity(@SerializedName(value = "resourceURI") val resourceURI: String,
                        @SerializedName(value = "name") val name: String) : Entity<Series> {

  override fun toModel(): Series {
    return Series(resourceURI, name)
  }
}
