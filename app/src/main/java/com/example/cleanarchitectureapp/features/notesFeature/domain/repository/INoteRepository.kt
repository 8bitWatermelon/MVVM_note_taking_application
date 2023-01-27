package com.example.cleanarchitectureapp.features.notesFeature.domain.repository

import com.example.cleanarchitectureapp.features.notesFeature.domain.module.Note
import kotlinx.coroutines.flow.Flow

interface INoteRepository {
    fun getNotes(): Flow<List<Note>>
    suspend fun getNotesByID(id: Int): Note?
    suspend fun insertNote(note: Note)
    suspend fun deleteNote(note: Note)
}