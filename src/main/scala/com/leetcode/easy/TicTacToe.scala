package com.leetcode.easy

object TicTacToe extends App {
  def tictactoe(moves: Array[Array[Int]]): String = {
    val arr = Array.ofDim[String](3, 3)
    val played = moves.length
    // Fill board
    for (i <- 0 until played by 2) {
      val r = moves(i)(0)
      val c = moves(i)(1)
      arr(r)(c) = "A"
    }
    for (i <- 1 until played by 2) {
      val r = moves(i)(0)
      val c = moves(i)(1)
      arr(r)(c) = "B"
    }

    def check: Option[String] = {
      var winner: Option[String] = None
      //check row & col
      for (i <- 0 to 2) {
        if (winner.isEmpty && arr(i)(0) == arr(i)(1) && arr(i)(1) == arr(i)(2) && arr(i)(2) != null)
          winner = Some(arr(i)(0))
        if (winner.isEmpty && arr(0)(i) == arr(1)(i) && arr(1)(i) == arr(2)(i) && arr(2)(i) != null)
          winner = Some(arr(0)(i))
      }
      //check diagonal
      if (winner.isEmpty && arr(0)(0) == arr(1)(1) && arr(1)(1) == arr(2)(2) && arr(1)(1) != null)
        winner = Some(arr(1)(1))
      if (winner.isEmpty && arr(0)(2) == arr(1)(1) && arr(1)(1) == arr(2)(0) && arr(1)(1) != null)
        winner = Some(arr(1)(1))

      winner
    }

    check match {
      case Some(v) => v //A,B
      case None if played == 9 => "Draw"
      case _ => "Pending"
    }
  }

  val test = Array.ofDim[Int](2, 2)
  println(tictactoe(Array(Array(0, 0), Array(1, 0), Array(1, 1), Array(1, 2), Array(2, 2))))
  println(tictactoe(Array(Array(0, 0), Array(1, 1), Array(0, 1), Array(0, 2), Array(1, 0), Array(2, 0))))
  println(tictactoe(Array(Array(0, 0), Array(1, 1), Array(0, 1), Array(0, 2), Array(1, 0))))
  println(tictactoe(Array(Array(0, 0), Array(1, 1), Array(2, 0), Array(1, 0), Array(1, 2), Array(2, 1), Array(0, 1), Array(0, 2), Array(2, 2))))
  println(tictactoe(Array(Array(1, 2), Array(2, 1), Array(0, 0), Array(0, 1), Array(2, 0), Array(0, 2), Array(2, 2), Array(1, 1))))
  println(tictactoe(Array(Array(0, 0))))
}
