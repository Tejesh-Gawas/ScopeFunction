class Company2 {
    var name: String = "Springer Nature"
    var location: String = "Pune"
}

fun main() {
    val company: Company2? = null

     company?.run {
        println(this.name)
        println(this.location)

        "Springer Nature is journal publishing company in science,research and technology"
    }


}