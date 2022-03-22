package com.leetcode.easy

import scala.annotation.tailrec

object HappyNumber extends App {

  def isHappy(n: Int): Boolean = {
    val numbersSet = scala.collection.mutable.HashSet[Int]()
    @tailrec
    def checkHappiness(n: Int): Boolean = {
      numbersSet.add(n)
      val res = squareAndAdd(n, 0)
      println(res)
      if (res == 1) true
      else if (numbersSet.contains(res.toInt)) false
      else {
        numbersSet.add(res.toInt)
        checkHappiness(res.toInt)
      }
    }

    checkHappiness(n)
  }

  @tailrec
  def squareAndAdd(num: Int, acc: Double): Double = {
    if (num == 0) acc
    else {
      squareAndAdd(num / 10, acc + Math.pow(num % 10, 2))
    }
  }

  println(isHappy(2))
  println(isHappy(19))
  println(isHappy(13))
}
