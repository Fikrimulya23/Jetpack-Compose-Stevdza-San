package com.fikrimulya.tutorialstevdza_san.tutorial.LazyColumn.Repositories

import com.fikrimulya.tutorialstevdza_san.tutorial.LazyColumn.Models.LazyColumnModel

class LazyColumnRepository {
    fun getAllData(): List<LazyColumnModel> {
        return listOf<LazyColumnModel>(
            LazyColumnModel(
                id = 1,
                firstName = "Ridho",
                lastName = "Alrafi",
                age = 24,
            ),
            LazyColumnModel(
                id = 2,
                firstName = "Aulia",
                lastName = "Ahmad Nabil",
                age = 23,
            ),
            LazyColumnModel(
                id = 3,
                firstName = "Asbiq",
                lastName = "Al Alawi",
                age = 23,
            ),
            LazyColumnModel(
                id = 4,
                firstName = "Pandi",
                lastName = "Barep",
                age = 24,
            ),
            LazyColumnModel(
                id = 5,
                firstName = "Fikri",
                lastName = "Mulya",
                age = 24,
            ),
            LazyColumnModel(
                id = 6,
                firstName = "Ridho",
                lastName = "Alrafi",
                age = 24,
            ),
            LazyColumnModel(
                id = 7,
                firstName = "Aulia",
                lastName = "Ahmad Nabil",
                age = 23,
            ),
            LazyColumnModel(
                id = 8,
                firstName = "Asbiq",
                lastName = "Al Alawi",
                age = 23,
            ),
            LazyColumnModel(
                id = 9,
                firstName = "Pandi",
                lastName = "Barep",
                age = 24,
            ),
            LazyColumnModel(
                id = 10,
                firstName = "Fikri",
                lastName = "Mulya",
                age = 24,
            ),
        )
    }
}