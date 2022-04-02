package com.leetcode.easy

object IslandPerimeter extends App {

  def getSurroundingLand(i: Int, j: Int, grid: Array[Array[Int]]): Int = {
    var totalLand = 0
    if (j + 1 < grid(i).length && grid(i)(j + 1) == 1) totalLand += 1 //row
    if (j - 1 >= 0 && grid(i)(j - 1) == 1) totalLand += 1 //row
    if (i + 1 < grid.length && grid(i + 1)(j) == 1) totalLand += 1 //col
    if (i - 1 >= 0 && grid(i - 1)(j) == 1) totalLand += 1 //col
    totalLand
  }

  def islandPerimeter(grid: Array[Array[Int]]): Int = {
    var perimeter = 0
    val land = 1
    for (i <- grid.indices) {
      for (j <- grid(i).indices) {
        if (grid(i)(j) == land) {
          perimeter += 4 - getSurroundingLand(i, j, grid)
        }
      }
    }
    perimeter
  }

  println(islandPerimeter(Array(Array(1))))
  println(islandPerimeter(Array(Array(1, 0))))
  println(islandPerimeter(Array(Array(0, 1, 0, 0), Array(1, 1, 1, 0), Array(0, 1, 0, 0), Array(1, 1, 0, 0))))

  /**
   * 00  01  02
   * 10  11  12
   * 20  21  22
   */
}
