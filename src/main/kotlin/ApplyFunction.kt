class Person {
    var name : String = ""
    var age : Int = 0
}

fun main() {

    //person.name = "Tejesh"
    //person.age = 23

    val person = Person().apply {
        this.name = "Tejesh"
        this.age = 23

    }

    with(person){
        println(this.name)
        println(this.age)
    }

}