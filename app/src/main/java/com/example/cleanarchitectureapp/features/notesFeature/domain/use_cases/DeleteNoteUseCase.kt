package com.example.cleanarchitectureapp.features.notesFeature.domain.use_cases

import com.example.cleanarchitectureapp.features.notesFeature.domain.module.Note
import com.example.cleanarchitectureapp.features.notesFeature.domain.repository.INoteRepository

class DeleteNoteUseCase(
    private val repository: INoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}