import kotlin.math.pow

fun main() {

    fun inputInt(): Int {
        print("podaj wartość")
        var aAsString: String? = readLine()
        if (aAsString != null) {
            return aAsString.toInt()
        } else {
            return 0
        }
    }

    fun dodawanie() {
        var a = inputInt()
        var b = inputInt()

        println(a + b)
    }

    fun odejmowanie(){
        var a = inputInt()
        var b = inputInt()
        println(a-b)
    }

    fun mnozenie(){
        var a = inputInt()
        var b = inputInt()
        println(a*b)
    }

    fun dzielenie(){
        var a = inputInt()
        var b = inputInt()
        println(a/b)
    }

    fun potegowanie(){
        var a = inputInt()
        var b = inputInt()
        var result =  Math.pow(a.toDouble(), b.toDouble())
        println(result)
    }

    fun pierwiastkowanie() {
        var pierwiastkowana = inputInt().toFloat()
        var stopien = inputInt().toFloat()
        var wynik = pierwiastkowana.pow((1 / stopien))
        println(wynik)
    }

    print(
        """
        1 -> dodawanie 
        2 -> odejmowanie
        3 -> mnożenie 
        4 -> dzielenie 
        5 -> potęgowanie
        6 -> pierwiastkowanie
        : 
    """.trimIndent()
    )

    var choiceAsString: String? = readLine()
    var choice = choiceAsString?.toInt()

    when (choice) {
        1 -> dodawanie()
        2 -> odejmowanie()
        3 -> mnozenie()
        4 -> dzielenie()
        5 -> potegowanie()
        6 -> pierwiastkowanie()
    }
}

