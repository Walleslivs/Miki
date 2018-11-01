package com.example.walleslivs.miki

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

//shooo
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ko.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            ko.startAnimation(animation)
        }
    }
}

