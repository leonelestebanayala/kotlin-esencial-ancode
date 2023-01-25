package conversióndatos

fun main() {
    val productLowStock: Byte = 20
    val productStock: Int = productLowStock.toInt()
    println(productStock)

    val numberString = 1
    val numberByte: Byte = numberString.toByte()
    print("El numero en byte es: $numberByte")

    val numberDouble = numberString.toDouble()
    println("El numero en Double es: $numberDouble")
}



