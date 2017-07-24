package net.sgonzalez.kplayground.data.response.entity

interface Entity<out Model> {
  fun toModel(): Model
}
