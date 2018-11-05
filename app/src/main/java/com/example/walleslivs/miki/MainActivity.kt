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
        anka.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            anka.startAnimation(animation)
        }
        gris.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            gris.startAnimation(animation)
        }
        asna.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            asna.startAnimation(animation)
        }
        apa.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            apa.startAnimation(animation)
        }
        baver.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            baver.startAnimation(animation)
        }
        elefant.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            elefant.startAnimation(animation)
        }
        hona.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            hona.startAnimation(animation)
        }
        hund.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            hund.startAnimation(animation)
        }
        isbjorn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            isbjorn.startAnimation(animation)
        }
        katt.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            katt.startAnimation(animation)
        }
        kyckling.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            kyckling.startAnimation(animation)
        }
        lejon.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            lejon.startAnimation(animation)
        }
        pingvin.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            pingvin.startAnimation(animation)
        }
        sal.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            sal.startAnimation(animation)
        }
        zebra.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            zebra.startAnimation(animation)

            }
    }
}

