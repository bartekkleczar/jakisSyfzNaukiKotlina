import kotlin.random.Random

fun main(){

    var from = 0
    var until = 0
    fun selectRange(){
        from = inputInt("Podaj zakres od: ")
        until = inputInt("Podaj zakres do: ")
    }
    fun game() {

        var losowa = (Random.nextInt(from, until))
        println(losowa)
        var proby = 0
        var status = true

        while (status == true) {

            var zgadywana = inputInt(text = "Podaj zgadywaną liczbę: ")
            if(zgadywana !in from..until) {
                println("Podana liczba nie mieści się w zakresnie $from do $until")
                continue
            }
            proby++
            if (losowa == zgadywana) {
                println("Udało ci się zgadnąć losową liczbę ($losowa) za $proby. probą")
                var choice = inputInt(text =
                """
            Zagraj jeszcze raz      -> Kliknij 1
            Zmień zakres i zagraj   -> Kliknij 2
            Wyjdź z gry             -> Kliknij dowolną liczbę
                """)
                when (choice){
                    1 -> game()
                    2 -> {selectRange(); game()}
                    else -> {status = false; break}

                }
            } else {
                if (losowa > zgadywana) {
                    println("Wylosowana liczba jest większa od tej którą podałeś")
                } else {
                    println("Wylosowana liczba jest mniejsza od tej którą podałeś")
                }
            }
        }
    }
    selectRange()
    game()
    }
