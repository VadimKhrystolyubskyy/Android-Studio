package com.example.secondproject

class Dog(name: String) : Animal(name), VoiceInterface {
    override fun makeSound() {
        println("Bark")
    }

    override fun loudVoice(): String {
        return "BARK!"
    }

    override fun quietVoice(): String {
        return "bark"
    }
}

