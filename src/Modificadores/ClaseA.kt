package paquete1

import paquete2.ClaseC
class ClaseA() {
    val propiedadx = 25
    fun miFuncion(){
        val miObjetoB = ClaseB()
        miObjetoB.miFuncion()
        miObjetoB.propiedadx
        val miObjetoC = ClaseC()
        miObjetoC.propiedadx
        miObjetoC.miFuncion()
    }
}