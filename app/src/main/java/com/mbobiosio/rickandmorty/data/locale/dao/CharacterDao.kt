package com.mbobiosio.rickandmorty.data.locale.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mbobiosio.rickandmorty.data.locale.entity.CharacterEntity

@Dao
interface CharacterDao {

    @Query("Select * from character where name LIKE '%' || :characterName || '%'")
    fun getCharactersByName(characterName: String): PagingSource<Int, CharacterEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharacters(characters: List<CharacterEntity>)

    @Query("DELETE FROM character")
    suspend fun deleteCharacters()
}
