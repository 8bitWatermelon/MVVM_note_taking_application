package com.example.cleanarchitectureapp.features.notesFeature.domain.utilities

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
