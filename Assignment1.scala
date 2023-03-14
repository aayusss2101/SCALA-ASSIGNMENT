package com.learn.scala

import java.text.DecimalFormat

object Assignment1{

  def main(args: Array[String]): Unit = {
    try{

      println("Enter Number: ")

      // Taking input in form of double
      val num=scala.io.StdIn.readDouble()

      // Finding the nearest 0.05 multiple lower than the number
      val lowerBound=BigDecimal(num/0.05).setScale(0, BigDecimal.RoundingMode.FLOOR).toDouble*0.05

      // Finding the upper bound
      val upperBound=lowerBound+0.049

      // Formatter for printing
      val formatter=new DecimalFormat("#.###")

      println(s"${formatter.format(lowerBound)} - ${formatter.format(upperBound)}")

    }catch {

      // Catching NumberFormatException if input is invalid
      case _:NumberFormatException=>println("Invalid Input")
    }
  }
}