package practice.random

object Palindrom extends App {

  val test = "abcba"

  def isPalindrom(s: String): Boolean = {
    val array = s.toCharArray
    var i = 0
    var j = array.length - 1
    var isPalindrom = true
    while (i < j && isPalindrom) {
//      println(array(i) +"  "+array(j))
      if (array(i) == array(j)) {
        i += 1
        j -= 1
      } else {
        isPalindrom = false
      }
    }
    isPalindrom
  }
  println(isPalindrom("abcba"))
  println(isPalindrom("abc"))
  println(isPalindrom("aa"))
}
