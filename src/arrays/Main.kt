package arrays

fun main() {
    val myArray = arrayOf(1, "hola", 2.5F, 1000L, 'c', true)

    println(myArray[1])

    myArray[1] = "adios"
    println(myArray[1])

    val emptyArray = emptyArray<Int>()

    val emByteArray = byteArrayOf(1, 2, 3)

    val myIntArray = intArrayOf(4,5,6,7,8)

    val arrayInt = IntArray(size = 5)


    // 0, 1, 2
    val arrayInt2 = IntArray(size = 5, {  i: Int -> i })
    arrayInt2.forEach {
        println(it)
    }

    arrayInt2[0] = 1
    arrayInt2[1] = 2
    arrayInt2[2] = 3
    arrayInt2[3] = 4

    val arrayBoolean = BooleanArray(3) {
        println(it)
        true
    }

    arrayBoolean.forEach {
        println(it)

    }


}




