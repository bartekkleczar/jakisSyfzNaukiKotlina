fun inputInt(text: String = ""): Int {
    print(text)
    var aAsString: String? = readLine()
    if (aAsString != null) {
        return aAsString.toInt()
    } else {
        return 0
    }
}

fun inputDouble(text: String = ""): Double {
    print(text)
    var aAsString: String? = readLine()
    if (aAsString != null) {
        return aAsString.toDouble()
    } else {
        return 0.00
    }
}
