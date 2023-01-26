package funciones

import java.time.LocalDateTime

fun main() {
    println("comienzo la ejecución del programa")
    mostrarFecha()
    saludar("Leo")
    felicitarCumple("Leo", 30)
    Hi()
}

fun mostrarFecha() {
    val fechaLocal = LocalDateTime.now()
    println("La fecha actual es $fechaLocal")
}

fun saludar(nombre: String) {
    println("Hola, $nombre")

}
fun felicitarCumple(nombre: String, edad: Int) {
    println("Felicidades, $nombre, cumples $edad años")
}
fun Hi(nombre: String = "Amigo") {
    println("Hi, $nombre")

}