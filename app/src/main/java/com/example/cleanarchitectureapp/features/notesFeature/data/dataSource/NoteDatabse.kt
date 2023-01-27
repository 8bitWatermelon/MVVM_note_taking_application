package com.example.cleanarchitectureapp.features.notesFeature.data.dataSource

import androidx.room.Database
import com.example.cleanarchitectureapp.features.notesFeature.domain.module.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase {
    abstract val INoteDao: INoteDao
}