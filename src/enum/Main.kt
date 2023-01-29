package enum

fun main() {
    val colorSamon =  Color.SALMON.hex
    println(DiasDeLaSemana.LUNES.ordinal)
    for (dia in DiasDeLaSemana.values()){
        println(dia.name)
    }
    println(DiasDeLaSemana.valueOf("LUNES"))
    println(DiasDeLaSemana.LUNES < DiasDeLaSemana.MARTES)
}