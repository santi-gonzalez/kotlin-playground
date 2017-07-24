package net.sgonzalez.kplayground.data.repository

import net.sgonzalez.kplayground.domain.model.Comic

interface MarvelRepository : Repository {
  fun getComics(): List<Comic>
  fun getComic(comicId: String): String
}
