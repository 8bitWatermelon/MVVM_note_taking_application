package com.example.cleanarchitectureapp.features.notesFeature.data.dataSource

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import com.example.cleanarchitectureapp.features.notesFeature.domain.module.Note

@Dao
interface INoteDao {
    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note Where id = :id")
    suspend fun getNotesByID(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}