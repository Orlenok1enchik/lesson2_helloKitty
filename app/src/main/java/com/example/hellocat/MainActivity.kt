package com.example.hellocat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private  lateinit var helloTextView: TextView

    private lateinit var editText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloTextView = findViewById(R.id.textView)

        var imageButton: ImageButton = findViewById(R.id.imageButton)

        imageButton.setOnClickListener{
            if (editText.text.isEmpty()){
                helloTextView.text = "hello kitty!";
            } else {
                helloTextView.text = "Привет, " + editText.text ;
            }
        }
    }

    fun onClick(view: View) {}
}