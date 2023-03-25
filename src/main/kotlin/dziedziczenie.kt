import java.awt.Color

fun main(){

    var cat = Cat("Franek", "Pink")
    cat.identify()
}

open class Animal{

    constructor(name: String){ this.name = name }
    var name: String
    open fun identify() {
        println("My name is $name")
    }
}

open class Cat: Animal{
    constructor(name: String, color: String): super(name) {this.name = name; this.color = color}

    var color: String

    override fun identify(){
        super.identify()
        println("My color is $color")
    }

}

class Lion: Animal("") {
    var age = 0
}