package com.example.cadastro

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

        val ufs = resources.getStringArray(R.array.ufsList)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, ufs)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        amb.ufS.adapter = adapter


        amb.clearBt.setOnClickListener {
            with(amb) {
                nameEt.text.clear()
                emailEt.text.clear()
                phoneEt.text.clear()
                cityEt.text.clear()

                emailCb.isChecked = false
                genderRG.clearCheck()

                ufS.setSelection(0)
            }

            Toast.makeText(this@MainActivity, "Formulário limpo com sucesso", Toast.LENGTH_SHORT).show()
        }




    }
}