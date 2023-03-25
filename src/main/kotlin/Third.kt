import java.util.Scanner

fun main(args: Array<String>)
{
    fun trapezManualInput() {
        print("Podaj pierwszą podstawę trapezu: ")
        var aAsStr: String? = readLine()
        var a = aAsStr?.toInt()

        print("Podaj drugą podstawę trapezu: ")
        var bAsStr: String? = readLine()
        var b = bAsStr?.toInt()

        print("Podaj wysokość trapezu: ")
        var hAsStr: String? = readLine()
        var h = hAsStr?.toInt()

        if (a != null && b != null && h != null) {
            var sum: Int = ((a + b) * h) / 2
            println(sum)
        }
    }
    fun trapezFunction(podstawaA: Int, podstawaB: Int, wysokoscH: Int ): Int {
        var poleTrapezu = ((podstawaA + podstawaB) * wysokoscH) / 2
        return poleTrapezu
    }
    println(trapezFunction(13, 14, 7))
}