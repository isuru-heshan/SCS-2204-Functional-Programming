object Question01 {
  /* main function */
  def main(args: Array[String]) = {
    println("for Rs. 19000 intrest is : " + interest(19000));
    println("for Rs. 190000 intrest is : " + interest(190000));
    println("for Rs. 1900000 intrest is : " + interest(1900000));
    println("for Rs. 19000000 intrest is : " + interest(19000000));
  }
  /* function for check interest */
  def interest(amount: Double): Double = {
    amount match {
      case x if x < 0        => 0
      case x if x < 20000    => x * .02
      case x if x < 200000   => x * .04
      case x if x < 2000000  => x * .035
      case x if x >= 2000000 => x * .065
    }
  }
}
