object Question5 {
  // function for check even or odd
  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n - 1)
  }
  def isOdd(n: Int): Boolean = !(isEven(n))

  //function to get sum of even numbers
  def sumEven(n: Int): Int = n match{
    case 0 => 0
    case x if isEven(x) => x + sumEven(x - 1)
    case x if isOdd(x) => sumEven(x - 1)
  }

  def main(args: Array[String]) = {
    println(sumEven(10))
  }
}
