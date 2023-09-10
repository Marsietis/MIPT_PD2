package com.example.mipt_pd2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set options for the spinner
        val spinner = findViewById<Spinner>(R.id.selectCountMethod)
        val adapter = ArrayAdapter.createFromResource(this, R.array.spinner_options, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        val button = findViewById<Button>(R.id.countButton)
        val resultText = findViewById<TextView>(R.id.result)

        button.setOnClickListener {
            val text = findViewById<EditText>(R.id.txtInput).text.toString().trim()

            if (text.isEmpty()) {
                Toast.makeText(this, getString(R.string.text_box_is_empty), Toast.LENGTH_SHORT)
                    .show()
                resultText.text = getString(R.string.text_box_is_empty)
            } else {
                val wordCounter = WordCounter()
                val selectedOption = spinner.selectedItem.toString()

                if (selectedOption == "Words") {
                    resultText.text = wordCounter.countWords(text).toString()
                }
                if (selectedOption == "Symbols") {
                    resultText.text = wordCounter.countSymbols(text).toString()
                }
            }
        }
    }
}