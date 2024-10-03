package eu.tutorials.kotlinbasics

fun main()
{
    val fruitList = mutableListOf("Mango", "Graps", "Banana", "Kiwi", "Apple")
    println(fruitList)

    fruitList.add("Guava")
    println(fruitList)

    fruitList.remove("Kiwi")
    println(fruitList)

    val hasFruit = fruitList.contains("Banana")
    if(hasFruit)
    {
        println("Banana Found")
    }
    else
    {
        println("Banana not found")
    }
}