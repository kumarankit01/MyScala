package com.leetcode.arrays

object Manipulation extends App {
  def checkRecord(s: String): Boolean = {
    s.filter(_ =="A").size < 2 && s.toSeq.sliding(3).map(arr => arr.forall(_=="L")).reduce(_ && _)
  }
  println(checkRecord("PPALLP"))
  println(checkRecord("PPALLL"))
}
