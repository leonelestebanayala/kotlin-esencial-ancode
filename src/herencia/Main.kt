package herencia

fun main() {
    val miPerro = Perro(5)
    miPerro.dormir()
    miPerro.ladrar()
    miPerro.comer()

    val miGato = Gato(8)
    println("miGato es un animal de tipo ${miGato.tipo} que tiene ${miGato.edad} años")
    miGato.comer()
}