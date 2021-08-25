package com.leetcode.easy

import scala.annotation.tailrec

object Leet20_ValidParentheses extends App {

  import scala.collection.mutable.Stack

  def isValid(s: String): Boolean = {
    var brackets = Stack[Char]()

    @tailrec
    def isBalanced(i: Int = 0, acc: Boolean = true): Boolean = {
      if (i == s.length || acc == false) acc
      else {
        val char: Char = s.charAt(i)
        char match {
          case ')' | '}' | ']' if brackets.isEmpty => isBalanced(i + 1, acc && false)
          case ')' | '}' | ']' if !brackets.isEmpty =>
            val popped = brackets.pop()
            if (s.charAt(i) == ')' && popped == '(' ||
              s.charAt(i) == '}' && popped == '{' ||
              s.charAt(i) == ']' && popped == '[') {
              isBalanced(i + 1, acc && true)
            } else isBalanced(i + 1, acc && false)
          case _ =>
            brackets.push(char)
            isBalanced(i + 1, acc && true)

        }
      }
    }

    isBalanced() && brackets.isEmpty
  }

  println(isValid("("))
  println(isValid("()"))
  println(isValid("[}"))
  println(isValid("(){}[]"))
  println(isValid("(){}[]["))
}
