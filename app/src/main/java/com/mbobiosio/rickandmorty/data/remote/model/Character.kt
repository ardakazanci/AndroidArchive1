package com.mbobiosio.rickandmorty.data.remote.model

import com.google.gson.annotations.SerializedName
import com.mbobiosio.rickandmorty.data.locale.entity.CharacterEntity

data class Character(
    @SerializedName("created")
    val created: String,
    @SerializedName("episode")
    val episode: List<String>,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("location")
    val location: Location,
    @SerializedName("name")
    val name: String,
    @SerializedName("origin")
    val origin: Origin,
    @SerializedName("species")
    val species: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
) {
    fun toCharacterEntity() = CharacterEntity(
        gender = gender,
        id = id,
        image = image,
        location = location.name,
        name = name,
        origin = origin.name,
        species = species,
        status = status
    )
}
