package com.leetcode.easy

object AddString extends App {
  def addStrings(num1: String, num2: String): String = {
    def tailRec(num1: String, num2: String, acc: String, carry: Int): String = {
      if (num1.length == 0 && num2.length == 0 && carry == 0) acc
      else {
        val a = num1.lastOption.getOrElse('0').asDigit
        val b = num2.lastOption.getOrElse('0').asDigit
        val sum = a + b + carry
        val n = sum % 10
        val c = sum / 10
        tailRec(num1.take(num1.length - 1), num2.take(num2.length - 1), n.toString + acc, c)

      }
    }

    tailRec(num1, num2, "", 0)
  }
}
