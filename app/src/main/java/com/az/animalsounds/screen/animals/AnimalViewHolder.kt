package com.az.animalsounds.screen.animals

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.az.animalsounds.data.AnimalPicture
import com.example.walleslivs.miki.R
import kotlinx.android.synthetic.main.animal_item.view.*

class AnimalViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    private val image: ImageButton = itemView.findViewById(R.id.imageButton)


    fun bind(animal:AnimalPicture){
        image.setImageResource(animal.image)

    }
    companion object {
        fun newInstance(parent:ViewGroup):AnimalViewHolder{
            return AnimalViewHolder(
                    LayoutInflater.from(parent.context).inflate(
                            R.layout.animal_item,
                            parent,
                            false
                    )
            );
        }
    }
}