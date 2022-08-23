object Question03 {
  // function to get Sum of 1 to n
  def sum(n: Int): Int = n match {
    case x if x < 1  => println("Invalid number"); return 0;
    case x if x == 1 => 1
    case _           => n + sum(n - 1)
  }
  // main function
  def main(args: Array[String]) = {
    println(sum(5))
  }
}
