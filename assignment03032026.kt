fun main() {
    val numbers = listOf(1,3,2,4,5,6,8,10,9,7,7)
    val words = listOf("car","van","bus","truck")
    val numbers2 = listOf(-5, 3, 0, -2, 7, 10, -1)
    
    sumOfEven(numbers)
    maxOfList(numbers)
    fizzBuzz()
	countVowels("Hello Kotlin World")
    removeDuplicates(numbers)
    reversedList(words)
    getFactorial(4)
    sumOfPositive(numbers2)
    guessTheNumber()
	patternPrint()
}

fun cube(num: Double): Double {
    return num * num * num
}


fun sumOfEven(nums : List<Int>){
    val evenNums = nums.filter {it % 2 ==0}
    println("Sum of even numbers : ${evenNums.sum()}")
}


fun maxOfList(nums : List<Int>){
    val sortedNums = nums.sorted()
    println("Max of numbers : ${sortedNums[sortedNums.size-1]}")
}


fun fizzBuzz(){
    for(i in 1..50){
       
        if(i % 3 == 0 && i % 5 == 0){
             println("$i Fizzbuzz")
        }
        else if(i % 3 ==0){
            println("$i Fizz")
        }
        else if(i % 5 ==0){
            println("$i Buzz")
        }
        else{
             println("$i")
        }
    }
}


 fun countVowels( text : String ){
        val count = text.lowercase().count {it in "aeiou"}
        println("Number of vowels: $count")
    }
 
 
 fun removeDuplicates(nums : List<Int>){
     val newList = nums.distinct()
     println("List without duplicates: $newList")
 }
 
 
 fun reversedList(words : List<String>){
     
     val reversedList = mutableListOf<String>()
     
     for(i in words.size-1 downTo 0){
         reversedList.add(words[i])
     }
     
     println("Reversed list: $reversedList")
 }
 
 
 fun getFactorial(num : Int){
     var factorial = 1
     for (i in 1..num){
         factorial *= i
     }
     println("Factorial of $num is $factorial")
 }
 
 
 fun sumOfPositive(nums : List<Int>){
     
    val positiveNums = nums.filter {it > 0}
    println("Sum of positive numbers: ${positiveNums.sum()}")
 }
 
 
 fun guessTheNumber() {
   val secretNumber = (1..10).random()
    var guess: Int?

    println("Guess a number between 1 and 10:")

    do {
        print("Your guess: ")
        val input = readLine()
        guess = input?.toIntOrNull()

        if (guess == null) {
            println("Please enter a valid number!")
        } else if (guess != secretNumber) {
            println("Not correct, try again.")
        }
    } while (guess != secretNumber)

    println("Congratulations! You guessed it!")
}


fun patternPrint(){
    for( i in 1..5){
        for(j in 1..i){
            print("*")
        }
      println("")
    }
}