package com.az.animalsounds.screen.animals

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.walleslivs.miki.R

class InformationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        val txt_informationtext : TextView = findViewById(R.id.txt_informationtext)
    }
}
