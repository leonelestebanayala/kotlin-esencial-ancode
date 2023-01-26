package funciones

import kotlin.math.ceil

fun main() {
    val area = calcularAreaRectangulo(0.5, 3.5 )
    println(area)
}

fun calcularNumeroDeBaldosas(anchoEstancia: Double, largoEstancia: Double, anchoBaldosa: Double, largoBaldosa: Double): Int{
    fun comprobarDimensiones(ancho: Double, largo:Double) {
        if(ancho <= 0 || largo <= 0) {
            throw IllegalAccessException("No se puede realizar el calculo. Las dimensiones deben ser mayor que cero")
        }
    }
    comprobarDimensiones(anchoBaldosa, largoBaldosa)
    comprobarDimensiones(anchoEstancia, largoEstancia)
    val areaEstancia = calcularAreaRectangulo(anchoEstancia, largoEstancia)
    val areaBaldosa = calcularAreaRectangulo(anchoBaldosa, largoBaldosa)
    return ceil(areaEstancia / areaBaldosa).toInt()

}
fun calcularAreaRectangulo(ancho: Double, largo:Double): Double {
    return ancho * largo
}
