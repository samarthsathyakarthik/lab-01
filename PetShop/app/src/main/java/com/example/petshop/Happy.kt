package com.example.petshop

class Happy(date: String) : Mood(date) {
    override fun feel(): String {
        return "Feeling happy!"
    }
}