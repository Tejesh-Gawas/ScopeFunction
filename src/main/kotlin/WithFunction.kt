class Company {
    var name: String = "Springer Nature"
    var location: String = "Pune"

}

fun main() {
    val company = Company()

    //println(company.name)
    // println(company.location)

   val bio :String = with(company) {
      println(this.name)
      println(this.location)
       "Springer Nature is journal publishing company in science,research and technology"

    }
    println(bio)
}