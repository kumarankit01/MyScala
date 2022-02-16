package com.leetcode.random

object GoodPair extends App {
  def numIdenticalPairs(nums: Array[Int]): Int = {
    val myMap = scala.collection.mutable.Map[Int, Int]()
    var goodPair = 0
    nums.map(i =>
      myMap += (i -> (myMap.get(i).getOrElse(0) + 1))
    )
    for ((_, v) <- myMap) {
      goodPair = goodPair + (v * (v - 1)) / 2
    }
    println(goodPair)
    goodPair
  }

  numIdenticalPairs(Array(1, 1, 1, 1))
  numIdenticalPairs(Array(1, 2, 3, 1, 1, 3))
  numIdenticalPairs(Array(1, 2, 3))

}
