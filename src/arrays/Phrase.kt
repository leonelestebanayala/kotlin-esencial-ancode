package arrays

fun main() {

    val greetings = arrayOf("Hola", "Hi", "Te doy la bienvenida", "Buenos dias", "Hello")

    val introductions = arrayOf("mi nombre es", "puedes llamarme", "usualmente me llaman", "yo soy")

    val names = arrayOf("Leo", "Leonel", "Leito", "Leon")


    val randIndexGreeting = (Math.random() * greetings.size).toInt()

    val randIndexIntroductions = (Math.random() * introductions.size).toInt()

    val randIndexNames = (Math.random() * names.size).toInt()


    val phrase = "${greetings[randIndexGreeting]} ${introductions[randIndexIntroductions]} ${names[randIndexNames]}"


    println(phrase)
}