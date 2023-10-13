package com.example.secondproject

open class Animal(val name: String) {
    var isAlive = true

    open fun makeSound() {}

    fun die() {
        isAlive = false
    }
}
