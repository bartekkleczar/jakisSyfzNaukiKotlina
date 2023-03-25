fun main(){

    var odpowiedzi = arrayOf("00", "1", "2", "3", "4", "5", "6", "7", "8")
    var condition = true
    var kolko = Player(sign = "O")
    var krzyz = Player(sign = "X")
    var i = 0
    var wygrany = ""
    fun checkWin(array: Array<String> = odpowiedzi, sign: String): String {
        if(array[0] == sign && array[1] == sign && array[2] == sign) {condition = false; return sign}
        else if(array[3] == sign && array[4] == sign && array[5] == sign) {condition = false; wygrany = sign; return sign}
        else if(array[6] == sign && array[7] == sign && array[8] == sign) {condition = false; wygrany = sign; return sign}
        else if(array[0] == sign && array[3] == sign && array[6] == sign) {condition = false; wygrany = sign; return sign}
        else if(array[1] == sign && array[4] == sign && array[7] == sign) {condition = false; wygrany = sign; return sign}
        else if(array[2] == sign && array[5] == sign && array[8] == sign) {condition = false; wygrany = sign; return sign}
        else if(array[0] == sign && array[4] == sign && array[8] == sign) {condition = false; wygrany = sign; return sign}
        else if(array[2] == sign && array[4] == sign && array[6] == sign) {condition = false; wygrany = sign; return sign}
        else {return "dupa"}
    }

    fun druk(){
        println("""
            ${odpowiedzi[0]} | ${odpowiedzi[1]} | ${odpowiedzi[2]}
            ${odpowiedzi[3]} | ${odpowiedzi[4]} | ${odpowiedzi[5]}
            ${odpowiedzi[6]} | ${odpowiedzi[7]} | ${odpowiedzi[8]}
        """)
    }

    while(condition == true) {
        if (i % 2 == 0) {
            var choose = inputInt("${kolko.sign} podaj pole które chcesz wybać: ")
            if (odpowiedzi[choose] == "O" || odpowiedzi[choose] == "X") {
                println("Nie"); continue
            } else {
                odpowiedzi[choose] = kolko.sign
            }

            druk()
            checkWin(sign = kolko.sign)
            if (condition == false) {
                println("$wygrany wygrywa"); break
            }

            i++
        }

        if (i % 2 != 0) {
            var choose = inputInt("${krzyz.sign} podaj pole które chcesz wybać: ")
            if (odpowiedzi[choose] == "O" || odpowiedzi[choose] == "X") {
                println("Nie"); continue
            } else {
                odpowiedzi[choose] = krzyz.sign
            }

            druk()
            checkWin(sign = krzyz.sign)
            if (condition == false) {
                println("$wygrany wygrywa"); break
            }

            i++ } } }

class Player(sign: String){
    var sign = sign
}