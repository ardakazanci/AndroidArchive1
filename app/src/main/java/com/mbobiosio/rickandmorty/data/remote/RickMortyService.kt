package com.mbobiosio.rickandmorty.data.remote

import com.mbobiosio.rickandmorty.data.remote.model.CharactersResult
import retrofit2.http.GET
import retrofit2.http.Query

interface RickMortyService {
    @GET("character/")
    suspend fun getCharacters(
        @Query("page")
        page: Int
    ): CharactersResult

    @GET("character/")
    suspend fun getCharactersByName(
        @Query("page")
        page: Int,
        @Query("name")
        characterName: String
    ): CharactersResult
}
