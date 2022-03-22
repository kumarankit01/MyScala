package com.leetcode.easy

object ScoreOfParentheses_856 extends App {

  def scoreOfParentheses(s: String): Int = {
    var stack = scala.collection.mutable.Stack[String]()
    var result = 0
    for (i <- 0 until s.length) {
      s.charAt(i) match {
        case '(' => stack.push("(")
        case ')' => {
          val allNumbers = stack.popWhile(s => s != "(")
          if (allNumbers.isEmpty) {
            stack.pop()
            stack.push(1.toString)
          }
          else {
            val sum = allNumbers.map(_.toInt).sum
            stack.pop()
            stack.push((sum * 2).toString)
          }
        }
      }
    }

    while (!stack.isEmpty) result = result + stack.pop().toInt
    result
  }

  def scoreOfParenthesesNew(s: String): Int = s.foldLeft(List[Int](0)) {
    case (stack, '(') => 0 :: stack
    case (0 :: next :: tail, ')') => (1 + next) :: tail
    case (head :: next :: tail, ')') => (head * 2 + next) :: tail
    case _ => ??? // can only happen if input is non-balanced.
  }.head

  println(scoreOfParenthesesNew("()"))
  println(scoreOfParentheses("()()"))
  println(scoreOfParentheses("(()()())"))
  println(scoreOfParentheses("((()))(())"))
  println(scoreOfParentheses("(((())))"))
  println(scoreOfParentheses("((()()))(())"))
}

/**
 * scoreOfParentheses("()") //1
 * scoreOfParentheses("()()") //1 + 1
 * scoreOfParentheses("(()()())") //1 + 1
 * scoreOfParentheses("(()())") //1 + 1 //  ( 1 ,  1 ) * 2
 * scoreOfParentheses("((()))") //2*(2 * 1)
 * scoreOfParentheses("((()))(())") //2 * (2 * (1)) + 2 * 1
 * scoreOfParentheses("((()()))(())") //2 * (2 * (1 +1 )) + 2 * 1 //
 */