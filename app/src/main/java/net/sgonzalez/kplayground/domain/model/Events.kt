package net.sgonzalez.kplayground.domain.model

data class Events(val available: Int,
                  val collectionURI: String,
                  val items: List<Item>,
                  val returned: Int) {

  data class Item(val resourceURI: String,
                  val name: String)
}
