package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.CollectedIssue

data class CollectedIssueEntity(@SerializedName(value = "resourceURI") val resourceURI: String,
                                @SerializedName(value = "name") val name: String) : Entity<CollectedIssue> {

  override fun toModel(): CollectedIssue {
    return CollectedIssue(resourceURI, name)
  }
}
