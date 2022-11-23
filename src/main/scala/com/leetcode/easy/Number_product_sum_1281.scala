package com.leetcode.easy

object Number_product_sum_1281 extends App {
  def subtractProductAndSum(n: Int): Int = {

    val num = n.toString.map(_.asDigit)
    num.product - num.sum

  }

  println(subtractProductAndSum(1111))
}
