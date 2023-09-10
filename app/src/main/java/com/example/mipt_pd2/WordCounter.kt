package com.example.mipt_pd2

class WordCounter {
    fun countWords(text: String): Int {
        val regex = "\\b\\w+\\b".toRegex()
        return regex.findAll(text).count()
    }

    fun countSymbols(text: String): Int {
        val punctuationChars = setOf('.', ',', '!', '?', ';', ':')
        return text.count { char -> char in punctuationChars }
    }
}