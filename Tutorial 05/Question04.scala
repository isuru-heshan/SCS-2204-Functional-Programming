object Question04 {
  // used recursion
  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n - 1)
  }
  def isOdd(n: Int): Boolean = !(isEven(n))

  def main(args: Array[String]): Unit = {
    println("D is Odd : " + !isEven(5))
  }
}
