package paymentChannel



object A {
  def test = {
    println(s" ${Thread.currentThread().getId}. sleeping")
    Thread.sleep(100)
    println(s" ${Thread.currentThread().getId}. Awake")
  }
}

object Test extends App {
  for (i <- 1 to 100) {
    val thread = new Thread {
      override def run {
        A.test
      }
    }
    thread.start
  }
}