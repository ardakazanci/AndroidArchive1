package com.mbobiosio.rickandmorty.data.locale.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mbobiosio.rickandmorty.domain.model.Character

@Entity(tableName = "character")
data class CharacterEntity(
    val gender: String,
    @PrimaryKey val id: Int,
    val image: String,
    val location: String,
    val name: String,
    val origin: String,
    val species: String,
    val status: String
) {
    fun toCharacter() = Character(
        gender = gender,
        id = id,
        image = image,
        location = location,
        name = name,
        origin = origin,
        species = species,
        status = status
    )
}
