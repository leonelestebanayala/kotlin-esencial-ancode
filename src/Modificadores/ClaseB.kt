package paquete1
open class ClaseB {
    val propiedadx = 25
    fun miFuncion(){
        val miVariable = propiedadx * 2
    }
    fun miOtraFuncion () {
        miFuncion()
        funcionDePrimerNivel()
    }
}
fun funcionDePrimerNivel() {
    val miObjeto = ClaseB()
    miObjeto.miOtraFuncion()
}
private class claseD: ClaseB() {
    fun unaFuncion() {
        val unaVariable = propiedadx
        miFuncion()
    }
}