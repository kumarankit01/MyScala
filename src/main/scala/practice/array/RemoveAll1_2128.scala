package practice.array

object RemoveAll1_2128 extends App {
  def removeOnes(grid: Array[Array[Int]]): Boolean = {
    var canRemove = true
    val r = grid.length
    val c = grid(0).length
    //iterate over  col and make all zero
    for (col <- 0 until c) {
      if (grid(0)(col) != 0) {
        //flip column
        for (row <- 0 until r) {
          //println(i + " " + j)
          grid(row)(col) = if (grid(row)(col) == 0) 1 else 0
        }
      }
    }

    //iterate over rows and see if all 0 or all 1s (which can be flipped)
    for (row <- 0 until r if canRemove) {
      if (grid(row).contains(0) && grid(row).contains(1)) canRemove = false
    }
    canRemove
  }

  removeOnes(Array(Array(0)))
  removeOnes(Array(Array(1)))
  removeOnes(Array(Array(1, 0), Array(0, 1)))
  removeOnes(Array(Array(0, 1, 0), Array(1, 0, 1), Array(0, 1, 0)))
  removeOnes(Array(Array(1, 1, 0), Array(0, 0, 0), Array(0, 0, 0)))
}
