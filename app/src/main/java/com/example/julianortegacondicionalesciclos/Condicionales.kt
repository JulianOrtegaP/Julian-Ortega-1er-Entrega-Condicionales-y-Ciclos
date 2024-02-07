package com.example.julianortegacondicionalesciclos

// Condicionales

    fun main() {

        // Condicionales IF - IF ELSE - ELSE

        val a: Int = 3
        val b: Int = 3

        if(a<b){
            println("a es mayor que b")

        }else if(b>a){

            println("b es mayor que a")
        }else{

            println("a y b son iguales")
        }



        // WHEN

        val answer = when {

            a<b -> "a es mayor que b."
            b>a -> "b es mayor que a"
            else -> "a y b son iguales."
        }

        println(answer)


    }










