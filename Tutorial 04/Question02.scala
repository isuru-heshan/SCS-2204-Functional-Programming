object Question03 {
  /* used recursion */
  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n - 1)
  }
  def isOdd(n: Int): Boolean = !(isEven(n))

  /* main function */
  def main(args: Array[String]): Unit = {
    println("Enter a number");
    scala.io.StdIn.readInt() match {
      case x if x < 0      => println("Negative number");
      case x if x == 0     => println("Zero");
      case x if isEven(x)  => println("Even number");
      case x if !isEven(x) => println("Odd number");
    }
  }
}