package com.gl4.blocnote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun addButtonTouched(button:View){
        //Log.i("Emna","Coucou")
        val fullTextView = findViewById<TextView>(R.id.fullTextView)
        val userField = findViewById<TextView>(R.id.userField)
        val userInput = userField.text
        val existingText = fullTextView.text
        fullTextView.text = "$existingText\n$userInput"
        userField.text = null
    }
}