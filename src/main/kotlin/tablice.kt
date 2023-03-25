import inputInt

fun main(){

    var array: Array<Any> = arrayOf(1, 2, 3, "4", '5')
    var array2 = arrayOf<Int>(1, 2, 3, 4, 5)

    var arra3 = intArrayOf(1, 2, 3, 4, 5)

    var array4 = IntArray(2)

    var array5 = Array(size = 5, init = {i -> i})

    //println("Index 0: " + array5[0])
    //println("Index 0: " + array5.get(0))

    array5[4] = 100
    array5.set(index = 0, value = 22)

   //println("size:" + array5.size)

    for(i in array5) println(i)
}