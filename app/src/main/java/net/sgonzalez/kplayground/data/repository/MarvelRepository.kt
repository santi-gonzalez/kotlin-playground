package net.sgonzalez.kplayground.data.repository

import net.sgonzalez.kplayground.domain.model.ComicModel

interface MarvelRepository : Repository {
  fun getComics(): List<ComicModel>
  fun getComic(comicId: String): String
}
