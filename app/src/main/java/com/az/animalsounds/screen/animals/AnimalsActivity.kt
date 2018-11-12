package com.az.animalsounds.screen.animals

import android.arch.lifecycle.Observer
import android.media.MediaPlayer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import com.az.animalsounds.utils.AudioPlayer
import com.example.walleslivs.miki.R
import kotlinx.android.synthetic.main.activity_main.*

//hghgh
class AnimalsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProviders
                .of(this)
                .get(AnimalsViewModel::class.java)

        viewModel.playsoundLiveData.observe(this, Observer {
            it?.let { MediaPlayer.create(this, it).start() }
        })

        ko.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            ko.startAnimation(animation)
            viewModel.playsound(R.raw.kosound)
        }
        anka.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            anka.startAnimation(animation)
            viewModel.playsound(R.raw.ankasound)
        }
        gris.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            gris.startAnimation(animation)
            viewModel.playsound(R.raw.grissound)
        }
        asna.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            asna.startAnimation(animation)
            viewModel.playsound(R.raw.asnasound)
        }
        apa.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            apa.startAnimation(animation)
            viewModel.playsound(R.raw.apasound)
        }
        baver.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            baver.startAnimation(animation)
            viewModel.playsound(R.raw.baversound)
        }
        elefant.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            elefant.startAnimation(animation)
            viewModel.playsound(R.raw.elefantsound)
        }
        hona.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            hona.startAnimation(animation)
            viewModel.playsound(R.raw.honasound)
        }
        hund.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            hund.startAnimation(animation)
            viewModel.playsound(R.raw.hundsound)
        }
        isbjorn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            isbjorn.startAnimation(animation)
            viewModel.playsound(R.raw.isbjornsound)
        }
        katt.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            katt.startAnimation(animation)
            viewModel.playsound(R.raw.kattsound)
        }
        kyckling.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            kyckling.startAnimation(animation)
            viewModel.playsound(R.raw.kycklingsound)
        }
        lejon.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            lejon.startAnimation(animation)
            viewModel.playsound(R.raw.lejonsound)
        }
        pingvin.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            pingvin.startAnimation(animation)
            viewModel.playsound(R.raw.pingvinsound)
        }
        sal.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            sal.startAnimation(animation)
            viewModel.playsound(R.raw.salsound)
        }
        zebra.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            zebra.startAnimation(animation)
            viewModel.playsound(R.raw.zebrasound)

        }
    }
}



