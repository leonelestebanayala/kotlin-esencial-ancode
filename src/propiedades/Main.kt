package propiedades

fun main() {
    val miRetangulo = Rectangulo(2.1, 3.2)
    miRetangulo.alto = 22.9
    val area = miRetangulo.alto * miRetangulo.ancho
    println(miRetangulo.esCuadrado)

}