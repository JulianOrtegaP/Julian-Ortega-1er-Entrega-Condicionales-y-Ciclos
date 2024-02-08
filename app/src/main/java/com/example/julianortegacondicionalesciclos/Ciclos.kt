package com.example.julianortegacondicionalesciclos

fun main(){

    // For loop

    val fruits = listOf("Apple", "Banana", "Orange")

    for (fruit in fruits) {

        println(fruit)
    }


    // Index loop

    val items = listOf("apple", "banana", "kiwifruit")

    for (index in items.indices) {

        println("item at $index is ${items[1]}")
    }

    // Loop in Range

    for (i in 1..5) {
        println(i)
    }

    val items2 = listOf("apple", "banana", "kiwifruit")


    var index2 = 0

    while (index2 < items.size) {
        println("item at $index2 is ${items[1]}")
        index2++
    }




    }