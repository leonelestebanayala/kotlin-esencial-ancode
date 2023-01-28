package claseanidada

fun main() {
    val miJuego = Juego()
    val miMarcador = miJuego.Marcador()
    miMarcador.incrementar(20)
    miMarcador.decrementar(5)
    println("La puntuación de mi Juego es ${miJuego.puntuacion}")
}
