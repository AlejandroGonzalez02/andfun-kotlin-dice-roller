/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }
    private fun rollDice(){

        // TODO (03) In rollDice get a Random int between 1 and 6
        // TODO (04) In rollDice use findViewById to get a reference to the TextView
        // and assign it to an inmutable variable called resultText
        // TODO (05) In rollDice set the random value that you got above as the
        //        // text of the TextView


        val randomInt = Random.nextInt(6)+1
        val draxableResource= when (randomInt){
        1 -> R.drawable.Dado1
        2 -> R.drawable.Dado2
        3 -> R.drawable.Dado3
        4 -> R.drawable.Dado4
        5 -> R.drawable.Dado5
        else -> R.drawable.Dado6
        }

        val diceimage: ImageView = findViewById(R.id.imaxes)
        diceimage.setImageResource(draxableResource)
    }
}

