package com.example.a195410029_bagasaditia_diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {

//            Pakai ini bisa
//            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
//            toast.show()

//            Ini adalah versi 1 baris dari code diatas
//            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()

//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "6"

            rollDice()

        }
        rollDice()

    }

    private fun rollDice() {
//        Membuat dadu baru dengan objek 6 sisi dan mengacaknya
        val dice = Dice(6)
        val diceRoll = dice.roll()

//        Memperbarui tampilan dengan dice roll

//        kode dadu menggunakan teks {
//        val resultTextView: TextView = findViewById(R.id.textView)
//        resultTextView.text = diceRoll.toString()
//    }
        val diceImage: ImageView = findViewById(R.id.imageView)
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}