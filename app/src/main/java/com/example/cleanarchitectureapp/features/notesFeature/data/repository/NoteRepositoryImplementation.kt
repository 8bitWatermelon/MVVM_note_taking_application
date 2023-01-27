package com.example.cleanarchitectureapp.features.notesFeature.data.repository

import com.example.cleanarchitectureapp.features.notesFeature.data.dataSource.INoteDao
import com.example.cleanarchitectureapp.features.notesFeature.domain.module.Note
import com.example.cleanarchitectureapp.features.notesFeature.domain.repository.INoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImplementation(
    private val dao: INoteDao
) : INoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNotesByID(id: Int): Note? {
        return dao.getNotesByID(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }

}