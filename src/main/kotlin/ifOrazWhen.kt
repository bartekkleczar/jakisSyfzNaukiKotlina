fun main(){

    //val res = if (x >= 0) "Dodatnia" else "Ujemna"
    //println(res)

    var x = 1

    val res = when {
        x > 0 -> "Dodatnia"
        x == 0 -> "Równa 0"
        else -> "Liczba ujemna"
    }

    println(res)

    when (x){
        1 -> println("Jeden")
        2 -> println("Dwa")
        else -> println("Dupa")
    }
}