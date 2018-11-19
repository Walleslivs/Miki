package com.az.animalsounds.screen.animals

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.az.animalsounds.data.AnimalPicture
import com.example.walleslivs.miki.R

class AnimalViewHolder(itemView: View, viewModel: AnimalsViewModel):RecyclerView.ViewHolder(itemView) {

    private val image: ImageButton = itemView.findViewById(R.id.imageButton)
    private lateinit var animal: AnimalPicture

    init {
        image.setOnClickListener {
            viewModel.playsound(animal.sound)
        }
    }

    fun bind(animal:AnimalPicture){
        this.animal = animal
        image.setImageResource(animal.image)

    }
    companion object {
        fun newInstance(parent: ViewGroup, viewModel: AnimalsViewModel):AnimalViewHolder{
            return AnimalViewHolder(
                    LayoutInflater.from(parent.context).inflate(
                            R.layout.animal_item,
                            parent,
                            false
                    ),
                    viewModel
            );
        }
    }
}