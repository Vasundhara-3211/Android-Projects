package eu.tutorials.kotlinbasics
/*
/* data class CoffeeDetails(
    val sugarCountInt : Int,
    val name : String,
    val size : String,
    val creamAmount : Int
)
*/


fun main()
{
 /* Integer Data Type
    val number1 = 1
    number1 = 2

    var myAge = 22
    myAge = 23
    println(myAge)
 */


/*Byte Data Type
    var number : Byte = 120
    var num2 : Short = 31112
    println(num2)
    num2 = 3612
    println(num2)
    println(number)

 */


/*Double & Float Data Type
    var pi = 3.14f
    println(pi)

    pi = 3.1415926535f
    println(pi)

 */


/* UShort Data Type
    var age : UShort = 22u
    println(age)

 */


/* Boolean Data Type
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    println(myTrue || myFalse)
 true
    println(myTrue && myFalse)
 false
    println(!myTrue)
 false

 */


/* Char & UniCode Table and String Data Type
    val myChar = '\u00B0'
    println(myChar)

    var firstName = "Vasundhara"
    var lastName = "Patil"

    name = "Very Long Paragraph can stored in String"
    println(firstName + " "+ lastName)

 */


/* if else statements by taking user input
    var age = 0
    println("Please enter your age as a whole number")
    var enteredValue = readln()
    age = enteredValue.toInt()
    age = readln().toInt()
    if(age in 18..39)
    {
        println("You can go to the club")
    }
    else if(age >= 40){
        println("You are too old to go club")
    }
    else
    {
        println("You are too young to go club")
    }

 */


/*while loop by taking user input
    var count = 0
    while(count < 3)
    {
        println("count is $count")
        count++
    }
    println("Loop is done!")

    var userInput = readln()
    while(userInput == "1")
    {
        println("while loop executed")
        userInput = readln()
        break
    }
    println("Loop is done")

 */


/* Make Coffee for User... Program
    println("Enter Number 1")
    val num1 = readln()
    val num1Int = num1.toInt()
    println("Enter Number 2")
    val num2 = readln()
    val num2Int = num2.toInt()

  //val myResult = add(num1Int, num2Int)
    val myResult = divide(num1Int, num2Int)
    println("The Result is $myResult")

 */


/*    Creating an object/instance of the class Dog
    var daisy = Dog("daisy", "dwarf poodle", 5)

    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} year old")
    println("A year has passed")
    daisy.age = 6
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} year old")

 */


    /* Another Class and it's instance
    var myBook = Book()
    println("${myBook.title}, ${myBook.author}, ${myBook.yearPublished}")
    var customBook = Book("Ekigai", "vedant", 2018)
    println("${customBook.title}, ${customBook.author}, ${customBook.yearPublished}")

     */


//    val coffeeForDenis = CoffeeDetails(2, "Denis", "xxl", 0)
//    makeCoffee(coffeeForDenis)




    // listOf() is a Immutable list- you can not add items after the initialization
   // val shoppingList = listOf("Processor", "RAM", "Graphic Card", "SSD")

    //mutableListOf() is a mutable list - you can add items later and modify
    val shoppingList = mutableListOf("Processor", "RAM", "Graphic Card RTX 3060", "SSD")
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphic Card RTX 3060")
    shoppingList.add("Graphic Card RTX 4090")
//    println(shoppingList)
    shoppingList.removeAt(2)
//    println(shoppingList)
    shoppingList.removeAt(1)
//    println(shoppingList)
    shoppingList.add(2, "RAM")
//    println(shoppingList)
    shoppingList[3] = "Graphic Card RTX 5050"
//    println(shoppingList)
//    println(shoppingList[0])

    // we can also use set method for removing element at particular index and modify it with another element at the same time
    shoppingList.set(1, "Water Cooling")
    println(shoppingList)

    // the contain method is used for checking the element is present in the list or not
    val hasRAM = shoppingList.contains("RAM")
    if(hasRAM)
    {
        println("Has RAM in the list")
    }
    else{
        println("No RAM in the list")
    }

    // for loop
//    for(item in shoppingList)
//    {
//        println(item)
//        if(item == "RAM")
//        {
//            shoppingList.removeLast()
//            break
//        }
//    }
    println(shoppingList.size)
    for(index in 0 until shoppingList.size)
    {
//        println(item)
        println("Item ${shoppingList[index]} is at index ${index}")

    }
    









}







/*
/*
fun add(num1Int : Int, num2Int : Int) : Int
{
    val result = num1Int+num2Int
    return result
}


fun divide(num1 : Int, num2:Int) : Double{
    val result = num1 / num2.toDouble()
    return result
}

 */

//fun askCoffeeDetails()
//{
//    // Calling makeCoffee() function
//    println("Who is this coffee for?")
//    val name = readln()
//    println("How many pieces of sugar do you want?")
//    val sugarCount = readln()
//    val sugarCountInt = sugarCount.toInt()
//    makeCoffee(sugarCountInt, name)
//
//    makeCoffee(sugarCount = 1, "Jimmy")
//    makeCoffee(sugarCount = 2, "Denis")
//    makeCoffee(sugarCount = 0)
//    makeCoffee(sugarCount = -5)
//}

//Defining makeCoffee() function
fun makeCoffee(coffeeDetails: CoffeeDetails)
{
//    println("Buy beans")
//    println("Grind beans")
//    println("Heat water to 90 deg.C")
//    println("Add water")
//    println("Push hot water through the grinded beans")
//    println("Now you can enjoy Coffee")

//    println("Coffee with $sugarCount spoons of sugar")
    if(coffeeDetails.sugarCountInt == 0)
    {
        println("Coffee with no sugar for ${coffeeDetails.name} and cream: ${coffeeDetails.creamAmount}")
    }
    else if(coffeeDetails.sugarCountInt == 1)
    {
        println("Coffee with ${coffeeDetails.sugarCountInt} spoon of sugar for ${coffeeDetails.name} and cream: ${coffeeDetails.creamAmount}")
    }
    else
    {
        println("Coffee with ${coffeeDetails.sugarCountInt} spoons of sugar for ${coffeeDetails.name} and cream: ${coffeeDetails.creamAmount}")
    }

}
*/


 */

fun main()
{
    /* What is the working of map keyword
    var list = listOf(1,2 ,3)
    var dubbled = list.map { it * 2 }
    println(dubbled)

     */


    /* What is the working of copy method
    val blueRoseVase = Vase("Blue", "Rose")
    val redRoseVase = blueRoseVase.copy("Red")
    println(blueRoseVase)
    println(redRoseVase)

     */


    /* What is the working of let and nullable
    val name : String? = "Vasu"      // String? it is a nullable String
    name ?.let {                     // ?. is a safe call and let is working with safe calls for executing the block {}.
        println(it.toUpperCase())    // it is the non null value of name.
    }

     */


    /*code for handle any error using try and catch block
    var number : Int
    println("Enter any number")
    try {
        number = readln().toInt()
        println("User entered : $number")
    }
    catch (e : Exception)
    {
        println("Error ${e.message}")
    }
    finally {
        number = 0
    }

     */


}

//data class Vase(val color: String, val design: String)