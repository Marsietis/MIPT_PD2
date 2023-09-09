package com.example.mipt_pd2

class WordCounter {
    fun countWords(text: String): Int {
        return text.split(" ").size
    }
}