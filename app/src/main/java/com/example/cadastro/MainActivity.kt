package com.example.cadastro

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val spinnerUf: Spinner = findViewById(R.id.ufS)

        val ufs = resources.getStringArray(R.array.ufsList)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, ufs)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinnerUf.adapter = adapter

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}