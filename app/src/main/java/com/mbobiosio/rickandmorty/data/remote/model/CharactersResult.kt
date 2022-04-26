package com.mbobiosio.rickandmorty.data.remote.model

import com.google.gson.annotations.SerializedName

data class CharactersResult(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<Character>
)
