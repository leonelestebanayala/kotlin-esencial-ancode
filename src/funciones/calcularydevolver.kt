package funciones

fun main() {
    areaRectangulo(5.5, 6.5)

}

fun areaRectangulo(base: Double, altura: Double) {
    var area = base * altura
    println("El area del rectangulo es ${area.toInt()}")
}
