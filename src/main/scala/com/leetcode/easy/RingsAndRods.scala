package com.leetcode.easy

object RingsAndRods extends App {
  def countPoints(rings: String): Int = {
    val list = rings.grouped(2).toList
    var count = 0
    val withRings: Map[String, List[(String, String)]] = list.map(s => (s.init, s.tail)).groupBy(_._2)
    withRings.values.map { x => if (x.map(_._1).distinct.size == 3) count += 1 }
    count
  }

  countPoints(rings = "G4")
}
