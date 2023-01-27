package constructor
class iOs(var stock: Int, var ventas: Int, var precio: Double) {
    constructor(Iphone: iOs) : this(Iphone.stock, Iphone.ventas, Iphone.precio)
    init {
        if(ventas < 0 || precio <0) {
            throw IllegalAccessException("Iphone es una mierda")
        }
    }
    fun obtenerGanancia() = ventas * precio
}
