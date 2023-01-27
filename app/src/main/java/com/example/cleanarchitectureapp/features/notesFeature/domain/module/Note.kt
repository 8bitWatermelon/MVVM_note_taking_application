package com.example.cleanarchitectureapp.features.notesFeature.domain.module

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.compose.ui.graphics.Color
import com.example.cleanarchitectureapp.ui.theme.*


@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors: List<Color> = listOf(RedOrange, RedPink, LightGreen, BabyBlue, Violet)
    }
}
