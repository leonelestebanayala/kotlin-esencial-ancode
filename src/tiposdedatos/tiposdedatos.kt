package tiposdedatos

fun main() {

    // Byte -128 - 127

    val age = 20
    val newAge: Byte = 127

    // Int
    // 2 mil millones
    val productId = 2_147_483_747

    // val productId3: Int = 2_147_483 _748

    // long
    // 9 trillones

    val userId: Long = 9_223_372_036_854_775_807
    val userId2 = 9_223_372_036_854_775_807L

    val myDouble = 2.1234
    val myFloat = 2.1235F

    println(myDouble)
    println(myFloat)


    val leoId = false
    val natiId = true

    println(leoId and natiId)
    println(leoId or natiId)
    println(leoId.not())


}