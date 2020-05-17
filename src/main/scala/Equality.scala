object Equality extends App {

  case class User(name: String)

  trait Equal[T] {
    def apply(a: T, b: T): Boolean
  }

  implicit object NameEquality extends Equal[User] {
    override def apply(a: User, b: User): Boolean = a.name == b.name
  }

  object Equal {
    def apply[T](a: T, b: T)(implicit equal: Equal[T]): Boolean = equal(a, b)

  }

  println(Equal(User("A"), User("B")))

  implicit class Equality[T](v: T) {
    def ===(x: T)(implicit equal: Equal[T]) = equal(x, v)

    def !==(x: T)(implicit equal: Equal[T]) = !equal(x, v)
  }

  println(User("A") !== User("B"))
  /*
  userA.===(userB)
  user donn't have === so compiler will search if there is any implicit class with === method
  if found then compiler will check can it wrap User to this class
  Equality[User](userA).===(userB)(search implicit Equal[User])
  Equality[User](userA).===(userB)(NameEquality)


   */
}
