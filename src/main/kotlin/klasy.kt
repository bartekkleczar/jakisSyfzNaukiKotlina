fun main(){
    var p1 = Person("Bartek", 26)
    p1.age -= 50
    p1.name = "Dupa"
    p1.identify()
}

class Person{

    constructor(name: String, age:Int){
        this.name = name
        this.age = age
    }

    var name: String
        get() { return field.uppercase() }

    var age: Int
        get() = field
        set(value){
            if (value <= 0){field = 0}; else field = value
        }



    fun identify(){
        println("Imię: $name, wiek: $age")
    }
}