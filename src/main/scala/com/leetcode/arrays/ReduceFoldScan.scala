package com.leetcode.arrays

object ReduceFoldScan extends App {
  val abc = List("A", "B", "C")

  def add(res: String, x: String) = {
    println(s"op: $res + $x = ${res + x}")
    res + x
  }

  abc.reduceLeft(add)
  // op: A + B = AB
  // op: AB + C = ABC    // accumulates value AB in *first* operator arg `res`
  // res: String = ABC

  abc.foldLeft("z")(add) // with start value "z"
  // op: z + A = zA      // initial extra operation
  // op: zA + B = zAB
  // op: zAB + C = zABC
  // res: String = zABC

  abc.scanLeft("z")(add)
  // op: z + A = zA      // same operations as foldLeft above...
  // op: zA + B = zAB
  // op: zAB + C = zABC
  // res: List[String] = List(z, zA, zAB, zABC) // maps intermediate results
}
