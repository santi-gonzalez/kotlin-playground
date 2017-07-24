package net.sgonzalez.kplayground.domain.model

data class Stories(val available: Int,
                   val collectionURI: String,
                   val items: List<Item>,
                   val returned: Int) : Model {

  data class Item(val resourceURI: String,
                  val name: String,
                  val type: String)
}
