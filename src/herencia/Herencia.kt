package herencia

open class Animal(val edad: Int, val tipo: TipoDeAnimal) {
    init {
        println("Inicializacion en Animal")
    }
    fun dormir() {
        println("Estoy durmiendo")
    }
    open fun comer() {
        println("Estoy comiendo")
    }
}
class Gato(edad: Int): Animal(edad, TipoDeAnimal.VERTEBRADO){
    init {
        println("Inicializacion en Gato")
    }
    fun maullar(){
        println("Miau")
    }

    override fun comer() {
        println("Estoy comiendo sardinas")
    }
}
class Perro(edad: Int): Animal(edad, TipoDeAnimal.VERTEBRADO){
    fun ladrar(){
        println("Guau")
    }
}
class Ave(edad: Int): Animal(edad, TipoDeAnimal.VERTEBRADO){
    fun volar(){
        println("Estoy volando")
    }
}