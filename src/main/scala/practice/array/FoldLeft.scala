package practice.array

object FoldLeft extends App {
  val a = List(1, 2, 1, 2, 3, 3, 4, 4, 4, 5, 6, 7, 6, 7, 7, 8)
  val b = a.sorted
  println(b)

  case class Node(value: Int, count: Int)

  println(
    b.foldLeft(List[Node]()) {
      (a, b) =>
        a match {
          case Nil => Node(b, 1) :: Nil
          case head :: tail if (head.value == b) => Node(b, head.count + 1) :: tail
          case head :: tail if (head.value != b) => Node(b, 1) :: head :: tail
        }
    })
}
