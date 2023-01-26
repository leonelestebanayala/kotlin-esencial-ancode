package funciones

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val area = areaDelCirculo(2.5)
    println("El area de un circulo de 2.5 de radio es $area")

}
fun bienvenida(nombre: String) {
    println("Hola, $nombre")
}

fun areaDelCirculo(diametro: Double): Double {
    val radio = diametro / 2
    return PI * radio.pow(2)
}