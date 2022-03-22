package practice.array

object ListData extends App {

  def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case n :: rest => n + sum(rest)
  }

  def listToString(list: List[String]): String = list match {
    case s :: rest  => s + " " + listToString(rest)
    case Nil => ""
  }



  println(listToString(List("a", "b", "c")))
  println(sum(List(1, 2, 3)))
}
