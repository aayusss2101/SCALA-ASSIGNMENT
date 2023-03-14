package com.learn.scala

import java.text.DecimalFormat
import scala.math.BigDecimal.RoundingMode

object Assignment1{

  /**
   * Round number to 3 decimal points
   * @param x number
   * @return rounded off number
   */
  def roundOff(x:Double):BigDecimal={
    BigDecimal(x).setScale(3,RoundingMode.HALF_UP)
  }

  def main(args: Array[String]): Unit = {
    try{

      println("Enter Number: ")

      // Taking input in form of double
      val num=scala.io.StdIn.readDouble()

      // Rounding number
      val roundNum=roundOff(num)

      // Finding index of bucket
      val idx=(roundNum/0.05).toInt

      // Finding the nearest 0.05 multiple lower than the number
      val lowerBound=roundOff(idx*0.05)

      // Finding the upper bound
      val upperBound=lowerBound+0.049

      println(s"$lowerBound - $upperBound")

    }catch {

      // Catching NumberFormatException if input is invalid
      case _:NumberFormatException=>println("Invalid Input")
    }
  }
}
