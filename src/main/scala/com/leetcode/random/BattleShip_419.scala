package com.leetcode.random

object BattleShip_419 extends App {
  def countBattleships(board: Array[Array[Char]]): Int = {
    var isHorizontal: Boolean = true
    val rows = board.length
    val col = board(0).length
    var counter = 0
    for (c <- 0 until col if isHorizontal) {
      for (r <- 0 until rows if isHorizontal) {
        if (board(r)(c) == 'X') {
          if (r < rows - 1 && board(r + 1)(c) == 'X') isHorizontal = false
        }
      }
    }

    var r = 0
    var c = 0
    if (isHorizontal) {
      while (r < rows) {
        while (c < col) {
          if (board(r)(c) == 'X') {
            while (c < col && board(r)(c) == 'X') c += 1
            counter += 1
          } else {
            c += 1
          }
        }
        r += 1
        c = 0
      }

    } else { //placed vertically

      while (c < col) {
        while (r < rows) {
          if (board(r)(c) == 'X') {
            while (r < rows && board(r)(c) == 'X') {
              r += 1
            }
            counter += 1
          } else {
            r += 1
          }

        }
        r = 0
        c += 1
      }
    }
    println(counter)
    counter
  }

  def countBattleshipsNew(board: Array[Array[Char]]): Int = {
    var shipCounter = 0
    for (i <- 0 until board.length; j <- 0 until board(i).length) {
      val isShip = board(i)(j) == 'X'

      val noShipAbove = i == 0 || board(i - 1)(j) != 'X'
      val noShipLeft = j == 0 || board(i)(j - 1) != 'X'
      if (isShip && noShipAbove && noShipLeft) shipCounter += 1
    }
    shipCounter
  }
  //["X",".",".","X"],[".",".",".","X"],[".",".",".","X"]

  /*

  [
  [".","X",".",".","X"],
  [".","X",".",".","X"],
  [".",".",".",".","X"],
  ["X",".","X","X","."],
  ["X",".",".",".","X"]
  ]
   */
  countBattleships(Array(Array("X", ".", ".", "X"), Array(".", ".", ".", "X"), Array(".", ".", ".", "X")).map(_.map(_.toCharArray.head)))
  countBattleships(Array(Array('X')))
  countBattleships(Array(Array('.')))
}
