package constructor
import Enum.Color
fun main() {
    val miIphone = iOs(50, 40, 1550.50)

    val celulares = miIphone.obtenerGanancia()
    println( "La ganancia fue $celulares")

    val colorSALMON =  Color.SALMON.hex
    val colorDORADO =  Color.GOLDEN.hex
    val colorPLATEADO = Color.SILVER.hex
    val colorROJO =  Color.RED.hex
    val colorVERDE =  Color.GREEN.hex
    val colorAZUL =  Color.BLUE.hex
}
