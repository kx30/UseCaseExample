package com.example.domain.entities

data class ResponseEntity<T>(
    val totalItems: Int,
    val items: List<T>
)