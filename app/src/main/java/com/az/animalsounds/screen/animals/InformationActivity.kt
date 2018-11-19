package com.az.animalsounds.screen.animals

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.example.walleslivs.miki.R

/* sho*/ 
class InformationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        val txt_informationtext: TextView = findViewById(R.id.txt_informationtext)
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, InformationActivity::class.java))
        }
    }
}
