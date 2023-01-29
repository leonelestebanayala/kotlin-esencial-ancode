package Interfaces

interface Reproductor {
    fun play(cancion: String){
        println("Reproduciendo cancion $cancion")
    }
    fun stop()
    fun pause()
}