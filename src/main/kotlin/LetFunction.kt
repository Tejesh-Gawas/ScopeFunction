/*
Scope Functions:
Function | Object Reference | Return Value
-----------------------------------------------
with     |   this           | Lambda result
let      |    it            | Lambda result
run      |   this           | Lambda result
apply    |   this           | Context object
also     |    it            | Context object
 */

/*fun main () {
    val Companyname: String? = null
//    println(Companyname!!.reversed())
//    println(Companyname.length)

    Companyname?.let {
        println(it.reversed())
        println(it.length)
    }
    }*/



fun main() {
    val CompanyName: String? = "SpringerNature"

    val savetheresult = CompanyName?.let {
        println(it.reversed())
        println(it.length)

    }
    println(savetheresult)
}
