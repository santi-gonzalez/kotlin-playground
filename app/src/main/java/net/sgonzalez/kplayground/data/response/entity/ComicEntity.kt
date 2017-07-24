package net.sgonzalez.kplayground.data.response.entity

import com.google.gson.annotations.SerializedName
import net.sgonzalez.kplayground.domain.model.Characters
import net.sgonzalez.kplayground.domain.model.Comic
import net.sgonzalez.kplayground.domain.model.Creators
import net.sgonzalez.kplayground.domain.model.Events
import net.sgonzalez.kplayground.domain.model.Series
import net.sgonzalez.kplayground.domain.model.Stories
import net.sgonzalez.kplayground.domain.model.Thumbnail

data class ComicEntity(@SerializedName(value = "id") val id: String,
                       @SerializedName(value = "digitalId") val digitalId: Int?,
                       @SerializedName(value = "title") val title: String?,
                       @SerializedName(value = "issueNumber") val issueNumber: Int?,
                       @SerializedName(value = "variantDescription") val variantDescription: String?,
                       @SerializedName(value = "description") val description: String?,
                       @SerializedName(value = "modified") val modified: String?,
                       @SerializedName(value = "isbn") val isbn: String?,
                       @SerializedName(value = "upc") val upc: String?,
                       @SerializedName(value = "diamondCode") val diamondCode: String?,
                       @SerializedName(value = "ean") val ean: String?,
                       @SerializedName(value = "issn") val issn: String?,
                       @SerializedName(value = "format") val format: String?,
                       @SerializedName(value = "pageCount") val pageCount: Int?,
                       @SerializedName(value = "textObjects") val textObjects: List<TextObjectEntity>?,
                       @SerializedName(value = "resourceURI") val resourceURI: String?,
                       @SerializedName(value = "urls") val urls: List<UrlEntity>?,
                       @SerializedName(value = "series") val series: SeriesEntity?,
                       @SerializedName(value = "variants") val variants: List<VariantEntity>?,
                       @SerializedName(value = "collections") val collections: List<CollectionEntity>?,
                       @SerializedName(value = "collectedIssues") val collectedIssues: List<CollectedIssueEntity>?,
                       @SerializedName(value = "dates") val dates: List<DateEntity>?,
                       @SerializedName(value = "prices") val prices: List<PriceEntity>?,
                       @SerializedName(value = "thumbnail") val thumbnail: ThumbnailEntity?,
                       @SerializedName(value = "images") val images: List<ImageEntity>?,
                       @SerializedName(value = "creators") val creators: CreatorsEntity?,
                       @SerializedName(value = "characters") val characters: CharactersEntity?,
                       @SerializedName(value = "stories") val stories: StoriesEntity?,
                       @SerializedName(value = "events") val events: EventsEntity?) : Entity<Comic> {

  override fun toModel(): Comic {
    return Comic(id, digitalId ?: 0,
                 title ?: "",
                 issueNumber ?: 0,
                 variantDescription ?: "",
                 description ?: "",
                 modified ?: "",
                 isbn ?: "",
                 upc ?: "",
                 diamondCode ?: "",
                 ean ?: "",
                 issn ?: "",
                 format ?: "",
                 pageCount ?: 0,
                 textObjects?.map { it.toModel() } ?: listOf(),
                 resourceURI ?: "",
                 urls?.map { it.toModel() } ?: listOf(),
                 series?.toModel() ?: Series("", ""),
                 variants?.map { it.toModel() } ?: listOf(),
                 collections?.map { it.toModel() } ?: listOf(),
                 collectedIssues?.map { it.toModel() } ?: listOf(),
                 dates?.map { it.toModel() } ?: listOf(),
                 prices?.map { it.toModel() } ?: listOf(),
                 thumbnail?.toModel() ?: Thumbnail("", ""),
                 images?.map { it.toModel() } ?: listOf(),
                 creators?.toModel() ?: Creators(0, "", listOf(), 0),
                 characters?.toModel() ?: Characters(0, "", listOf(), 0),
                 stories?.toModel() ?: Stories(0, "", listOf(), 0),
                 events?.toModel() ?: Events(0, "", listOf(), 0))
  }
}
