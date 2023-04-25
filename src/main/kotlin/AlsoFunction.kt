fun main() {
    val numberList : MutableList<Int> = mutableListOf(1,3,5)

    //Some other code...

   val duplicateList= numberList.also {
        println("list elements are : $it")
        it.add(7)
        println("list element after adding: $it")
        it.remove(1)
       println("list element after remove: $it")
    }

    println("OriginalList : $numberList")
    println("DuplicatedList: $duplicateList")
}