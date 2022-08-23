object Question01 {

  // function great common divisor
  def GCD(a: Int, b: Int): Int = b match {
    case 0          => a
    case x if x > a => GCD(x, a)
    case _          => GCD(b, a % b)
  }

  // function to check if the number is prime or not
  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (x == p)      => true
    case x if GCD(p, x) > 1 => false
    case _                  => prime(p, n + 1)
  }

  // main function
  def main(args: Array[String]) = {
    println(prime(8));
  }
}
