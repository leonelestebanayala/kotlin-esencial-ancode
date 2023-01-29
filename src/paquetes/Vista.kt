package com.mparrastia.vista

import com.mparrastia.control.obtenerFechaDeUltimaActualizacion

class Vista(val boton: BotonCuadrado) {
    fun dibujar(){
        obtenerFechaDeUltimaActualizacion()

    }
}