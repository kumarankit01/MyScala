/*package com.leetcode.easy

import scala.annotation.tailrec

/*

Test case
[to, t]
[to]
[""]
["flower","flow","flight"]
["dog","racecar","car"]
 */
object Leet14_LongestCommonPrefix extends App {
  def longestCommonPrefix(strs: Array[String]): String = {

    def check(b: Boolean, int: Int): Int = {
      if(b == false) int
      else{

        //check if iTh index is valid
        check(, int+1)
      }
    }
  }

  @tailrec
  private def f(strs: Array[String], acc: Int): Int = {
    var boolean = true
    while (boolean != false){
      for (i <- 0 to strs.length - 2 if !boolean) {
        boolean = boolean && (strs(i).size >= acc && strs(i + 1).size >= acc &&
          strs(i).charAt(acc) == strs(i + 1).charAt(acc))
      }
    }
  }

    if (boolean == false)
      acc
    else f(strs, acc + 1)

  def factorial(n: Int): Int = {
    @tailrec def factorialAcc(acc: Int, n: Int): Int = {
      if (n <= 1) acc
      else factorialAcc(n * acc, n - 1)
    }
    factorialAcc(1, n)
  }
  }*/

