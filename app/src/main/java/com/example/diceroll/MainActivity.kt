package com.example.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        displayText(roll())

        rollButton.setOnClickListener {
            displayText(roll())
        }
    }

    // Return a random number between 1-6
    private fun roll(): Int {
        return (1..6).random()
    }

    // Display the rolled dice value on the screen
    private fun displayText(value: Int) {
        val rollText: TextView = findViewById(R.id.textview)
        val diceImage: ImageView = findViewById(R.id.imageView)

        rollText.text = value.toString()

        when (rollText.text) {
            "1" -> diceImage.setImageResource(R.drawable.dice_1)
            "2" -> diceImage.setImageResource(R.drawable.dice_2)
            "3" -> diceImage.setImageResource(R.drawable.dice_3)
            "4" -> diceImage.setImageResource(R.drawable.dice_4)
            "5" -> diceImage.setImageResource(R.drawable.dice_5)
            "6" -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}