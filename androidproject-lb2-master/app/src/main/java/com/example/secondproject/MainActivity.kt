package com.example.secondproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animals = listOf( Dog("Rex"), Bird("Polly"), Fish("Nemo") )

        for (animal in animals) {
            println("${animal.name} says: ")
            animal.makeSound()

            if (animal is VoiceInterface) {
                println("Loud voice: ${animal.loudVoice()}, Quiet voice: ${animal.quietVoice()}")
            }

            if (!animal.isAlive) {
                println("${animal.name} is not alive.")
            }
        }
    }
}

