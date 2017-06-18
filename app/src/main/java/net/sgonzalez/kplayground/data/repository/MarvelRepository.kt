package net.sgonzalez.kplayground.data.repository

import net.sgonzalez.kplayground.data.response.ComicsV1Response

interface MarvelRepository : Repository {
  fun getComics(): ComicsV1Response
  fun getComic(comicId: String): String
}
