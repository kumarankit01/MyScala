import scala.collection.mutable

object Test extends App {
  implicit val normalOrder: Ordering[Int] = Ordering.fromLessThan(_ < _)
  val l = List(1, 2, 334, 6, 7, 82, 33)
  //l.sorted foreach println

  val t = mutable.TreeMap.empty[Int, String]
  t.put(1, "asdhwq")
  t.put(22, "asdhwq")
  t.put(454, "asdhwq")
  t.put(112, "asdhwq")
  t.put(346, "asdhwq")
  t.put(1657, "asdhwq")

  t.keys foreach println
  //t.sortedMapFactory.keys foreach print
}
