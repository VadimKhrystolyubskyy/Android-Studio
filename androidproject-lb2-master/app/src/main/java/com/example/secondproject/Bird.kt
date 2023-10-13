package com.example.secondproject

class Bird(name: String) : Animal(name), VoiceInterface {
    override fun makeSound() {
        println("Tweet")
    }

    override fun loudVoice(): String {
        return "TWEET!"
    }

    override fun quietVoice(): String {
        return "tweet"
    }
}

