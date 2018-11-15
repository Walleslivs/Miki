package com.az.animalsounds.screen.animals

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModel
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import com.example.walleslivs.miki.R
//jj
class AnimalsViewModel: ViewModel() {

    val playsoundLiveData = MutableLiveData<Int>()

    fun playsound(resId: Int){
        playsoundLiveData.postValue(resId)
    }

}