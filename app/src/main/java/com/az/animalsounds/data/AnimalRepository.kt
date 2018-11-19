package com.az.animalsounds.data

import com.example.walleslivs.miki.R

class AnimalRepository {
    fun get():List<AnimalPicture> {
        return arrayOf(
                AnimalPicture(R.drawable.ko, R.raw.kosound),
                AnimalPicture(R.drawable.anka, R.raw.ankasound),
                AnimalPicture(R.drawable.baver, R.raw.baversound),
                AnimalPicture(R.drawable.kyckling, R.raw.kycklingsound),
                AnimalPicture(R.drawable.isbjorn, R.raw.isbjornsound),
                AnimalPicture(R.drawable.apa, R.raw.apasound),
                AnimalPicture(R.drawable.asna, R.raw.asnasound),
                AnimalPicture(R.drawable.elefant, R.raw.elefantsound),
                AnimalPicture(R.drawable.hund, R.raw.hundsound),
                AnimalPicture(R.drawable.hona, R.raw.honasound),
                AnimalPicture(R.drawable.katt, R.raw.kattsound),
                AnimalPicture(R.drawable.sal, R.raw.salsound),
                AnimalPicture(R.drawable.pingvin, R.raw.pingvinsound),
                AnimalPicture(R.drawable.zebra, R.raw.zebrasound),
                AnimalPicture(R.drawable.lejon, R.raw.lejonsound),
                AnimalPicture(R.drawable.gris, R.raw.grissound)

        ).toList()

    }

}