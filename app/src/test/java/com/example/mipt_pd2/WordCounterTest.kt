package com.example.mipt_pd2

import junit.framework.TestCase.assertEquals
import org.junit.Test

class WordCounterTest {

    // Count words tests
    @Test
    fun countWords_emptyString_ReturnsZero() {
        val wordCounter = WordCounter()
        val result = wordCounter.countWords("")
        assertEquals(0, result)
    }

    @Test
    fun countWords_oneWord_ReturnsOne() {
        val wordCounter = WordCounter()
        val result = wordCounter.countWords("Hello")
        assertEquals(1, result)
    }

    @Test
    fun countWords_multipleSpaces_ReturnsZero() {
        val wordCounter = WordCounter()
        val result = wordCounter.countWords("   ")
        assertEquals(0, result)
    }

    @Test
    fun countWords_wordsWithMultipleSpaces_ReturnsTwo() {
        val wordCounter = WordCounter()
        val result = wordCounter.countWords("Hello   world")
        assertEquals(2, result)
    }

    @Test
    fun countWords_twoWords_ReturnsTwo() {
        val wordCounter = WordCounter()
        val result = wordCounter.countWords("Hello world")
        assertEquals(2, result)
    }

    @Test
    fun countWords_twoWordsWithPunctuation_ReturnsTwo() {
        val wordCounter = WordCounter()
        val result = wordCounter.countWords("Hello, world!")
        assertEquals(2, result)
    }

    @Test
    fun countWords_twoWordsWithPunctuationAndNewLines_ReturnsTwo() {
        val wordCounter = WordCounter()
        val result = wordCounter.countWords("Hello,\nworld!")
        assertEquals(2, result)
    }

    @Test
    fun countWords_twoWordsWithPunctuationAndTabs_ReturnsTwo() {
        val wordCounter = WordCounter()
        val result = wordCounter.countWords("Hello,\tworld!")
        assertEquals(2, result)
    }

    @Test
    fun countWords_twoWordsWithPunctuationAndSpaces_ReturnsTwo() {
        val wordCounter = WordCounter()
        val result = wordCounter.countWords("Hello, world!")
        assertEquals(2, result)
    }

    @Test
    fun countWords_twoWordsWithPunctuationAndSpacesAndNewLinesAndTabs_ReturnsTwo() {
        val wordCounter = WordCounter()
        val result = wordCounter.countWords("Hello,\n\tworld!")
        assertEquals(2, result)
    }

    // Count symbols tests
    @Test
    fun countSymbols_emptyString_ReturnsZero() {
        val wordCounter = WordCounter()
        val result = wordCounter.countSymbols("")
        assertEquals(0, result)
    }

    @Test
    fun countSymbols_oneSymbol_ReturnsOne() {
        val wordCounter = WordCounter()
        val result = wordCounter.countSymbols("!")
        assertEquals(1, result)
    }

    @Test
    fun countSymbols_SentenceWithTwoSymbols_ReturnsTwo() {
        val wordCounter = WordCounter()
        val result = wordCounter.countSymbols("Hello, world!")
        assertEquals(2, result)
    }

    @Test
    fun countSymbols_SentenceWithTwoSymbolsAndNewLines_ReturnsTwo() {
        val wordCounter = WordCounter()
        val result = wordCounter.countSymbols("Hello,\nworld!")
        assertEquals(2, result)
    }

    @Test
    fun countSymbols_SentenceWithTwoSymbolsAndTabs_ReturnsTwo() {
        val wordCounter = WordCounter()
        val result = wordCounter.countSymbols("Hello,\tworld!")
        assertEquals(2, result)
    }

    @Test
    fun countSymbols_SentenceWithTwoSymbolsAndSpacesAndNewLinesAndTabs_ReturnsTwo() {
        val wordCounter = WordCounter()
        val result = wordCounter.countSymbols("Hello,\n\tworld!")
        assertEquals(2, result)
    }
}