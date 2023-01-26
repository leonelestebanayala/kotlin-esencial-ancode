package controldeflujo

fun main() {
    val mes = "junio"
    var numeroDeDias = when(mes) {
        "enero", "marzo", "mayo", "julio", "agosto", "octubre", "diciembre" -> 31
        "febrero", -> 28
        "abril", "junio", "septieembre", "novimbre" -> 30
        else -> -1

    }
    println ("El mes $mes tiene $numeroDeDias dias")

    val edad = 16

    when (edad) {
        in 0..15 -> println ("Es un niño")
        in 13..18 -> println("Es un adolescente")
        !in 0..130 -> println ("Edad incorrecta")
        else -> println("Es un adulto")

    }
}