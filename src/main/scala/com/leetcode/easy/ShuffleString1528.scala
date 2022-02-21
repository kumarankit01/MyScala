package com.leetcode.easy

object ShuffleString1528 extends App {
  def restoreString(s: String, indices: Array[Int]): String = {
    var ordered = new Array[Char](s.length)
    for (i <- 0 to indices.length - 1) {
      ordered(indices(i)) = s.charAt(i)
    }
    ordered.mkString
  }

  def restoreStringAlt(s: String, indices: Array[Int]): String = {
   val x =  s.zip(indices).sortBy(_._2).map(_._1).mkString
    println(x)
    "test"
  }

  restoreStringAlt("codeleet", Array(4, 5, 6, 7, 0, 2, 1, 3))
}
