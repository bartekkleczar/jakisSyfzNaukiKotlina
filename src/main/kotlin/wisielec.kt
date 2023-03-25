fun main() {
    print(": ")
    var word: String = readLine().toString().lowercase()
    var sizeOfWord = word.length
    var condition = true
    var goodAnswers = 0
    var badAnswers = 0
    var cyfry = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9")
    while(condition == true){
        print("Podaj literę: ")
        var letter: String = readLine().toString().lowercase()
        if(letter.trim() == ""|| letter in cyfry){ println("You must input letter"); continue }
        if(letter.length > 2 && letter == word) { println("You answered correct word, you won"); break }
        else if(letter.length > 2  ){println("Please input one letter or whole correct word"); continue}
        if(letter in word.lowercase()){goodAnswers++
            if(sizeOfWord-goodAnswers == 0){ println("You won word correct word is $word")
                condition = false; break}
            else{
            println("Good letter, you have to answer ${sizeOfWord-goodAnswers} letters more")
            var letterNowIndex: Int = word.indexOf(letter)
                cosNaPotrzebe(word = word, letter = letter, index = letterNowIndex)
                println("")
            }}
        else{
            if(badAnswers == word.length*2){println("You loose"); condition = false; break}
            else { badAnswers++
            println("Bad letter, you have to answer ${sizeOfWord - goodAnswers} letters")
        }}

    }
}

fun cosNaPotrzebe(word: String, letter: String, index: Int){
    var j = 0
    for(i in word){

        if(j == index){
            print(letter)
        }
        else print("_")

        j++
    }
}
