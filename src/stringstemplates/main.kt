package stringstemplates

fun main() {

    val price = 15.25
    val tax = 0.16

    val out = "La cantidad de $price despues de impuestos es: $${price * (1 + tax)}"
    println(out)

    val disclaimer = "la cantidad esta en \$MXN"
    println(disclaimer)

    val total = price.times(tax.plus(other:1))
    println(total.toFloat()





}