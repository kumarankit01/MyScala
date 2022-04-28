package com.leetcode.easy

object DefangIPaddr_1108 extends App {
  def defangIPaddr(address: String): String = {
    val sb = new StringBuilder()
    address.map {
      _ match {
        case '.' => sb.append("[.]")
        case c => sb.append(c)

      }
    }
    sb.toString()
  }

  defangIPaddr("1.1.1.1".replace(".", "[.]"))
}
