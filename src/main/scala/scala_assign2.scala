package assignment

object Sc {

  def main(args: Array[String]) = {
    val obj = new Abc
    val myList = List(10,20,30,40)
    println("String interpolation")
    for(index <- 0 until myList.length) {
      println(s"$index = ${myList(index)}")
    }

    println()
    println("Maximum Value")
    var maxValue: Int = myList(0)
    for(index <- 1 until myList.length if myList(index) > maxValue) {
      maxValue = myList(index)
    }
    println(maxValue)


    val index1 = myList.length
    val num = 5
    val mul = obj.productOfNumber(num)
    val sum = obj.sumOfDigits(mul)
    println()
    println("Product of number and sum of digits")
    println(mul)
    println(sum)
    println()
    println("Fibonacci")
    println(obj fibonacci(num))

  }
}

class Abc {
  def productOfNumber(num: Int): Int = {
    if(num == 1)
      num
    else
      num * productOfNumber(num - 1)
  }

  def sumOfDigits(mul: Int): Int = {
    if(mul == 0)
      mul
    else
      mul % 10 + sumOfDigits(mul / 10)
  }

  def fibonacci(num: Int): Int = {
    if(num == 0)
      0
    else if(num == 1)
      1
    else
      (fibonacci(num - 1) + fibonacci(num - 2))
  }



}
