fun main(){
    var i = 0

    /*while(i < 10 || true){
        if(i >= 10) break
        println("i: $i")
        i++
    }*/

    var j = 0
    while(j < 20){
        j++
        if(j % 2 == 1){
            continue
        }
        println("j: $j")
    }
}