package com.example.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the roll button in the layout
        val rollButton: Button = findViewById(R.id.button)

        // Display the initial dice roll result
        rollDice()

        // Set a click listener for the roll button
        rollButton.setOnClickListener {
            // Show a short toast indicating that the dice has been rolled
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()

            // Update and display the new dice roll result
            rollDice()
        }
    }

    // Display the rolled dice value on the screen and update the dice image accordingly
    private fun rollDice() {
        // Find the text view and image view in the layout
        val rollText: TextView = findViewById(R.id.textview)
        val diceImage: ImageView = findViewById(R.id.imageView)

        // Set the text view to display the current dice value
        rollText.text = (1..6).random().toString()

        // Set the image view to display the corresponding dice image
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
