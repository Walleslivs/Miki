package com.az.animalsounds.screen.animals

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.az.animalsounds.data.AnimalPicture

class AnimalAdapter : RecyclerView.Adapter<AnimalViewHolder>() {

    private var animals:List<AnimalPicture> = ArrayList();

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): AnimalViewHolder {
        return AnimalViewHolder.newInstance(parent)
    }
    override fun onBindViewHolder(animalViewHolder: AnimalViewHolder, position: Int) {
        animalViewHolder.bind(animals[position])
    }

    override fun getItemCount(): Int {
        return animals.size
    }

    fun setAnimals(animals:List<AnimalPicture>){
        this.animals = animals
        notifyDataSetChanged()
    }
}