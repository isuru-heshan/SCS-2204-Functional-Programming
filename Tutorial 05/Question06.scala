object Question06 {
  // function for get fibonacci value
  def fibonacci(n: Int): Int = n match {
    case 0           => 0
    case x if x == 1 => 1
    case _           => fibonacci(n - 1) + fibonacci(n - 2)
  }

  // function to print values up to nth value
  def fibonacciSeq(n: Int): Unit = {
    if (n > 1) fibonacciSeq(n - 1)
    println(fibonacci(n - 1))
  }

  // main function
  def main(args: Array[String]) = {
    fibonacciSeq(10)
  }
}