fun main(){
    var hello = {println("Hello")}; hello()

    var add: (Int, Int) -> Int = {a, b -> a + b}; println(add(1, 4))

    var add2 = fun(a: Int, b: Int): Int {return a + b}; println(add2(7, 1))

    var sub = {a: Int, b: Int -> a - b }; println(sub(5, 3))

    println("---")

    var arr = listOf(1, 2, 3, 4)

    var function = {a: Int -> println(a * a)}
    arr.forEach(function)


}
