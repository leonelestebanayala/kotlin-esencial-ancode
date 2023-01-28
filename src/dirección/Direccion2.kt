package dirección

fun main() {
    val miDireccion = Direccion("Reconquista", 297, 1888, "Florencio Varela")
    println(miDireccion.toString())
    val miDireccion2 = Direccion("Reconquista", 297, 1888, "Florencio Varela")
    println("¿Es mi dirección igual a mi direccion 2? ${miDireccion.equals(miDireccion2)}")
    val miDireccion3 = miDireccion.copy(numero = 33)
    println(miDireccion3.toString())

}