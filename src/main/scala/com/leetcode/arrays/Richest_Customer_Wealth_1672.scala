package com.leetcode.arrays

object Richest_Customer_Wealth_1672 extends App {
  def maximumWealth(accounts: Array[Array[Int]]): Int = {
    accounts.map(_.foldLeft(0)(_ + _)).max
  }

  println(maximumWealth(Array(Array(1, 1, 9), Array(4))))
}
