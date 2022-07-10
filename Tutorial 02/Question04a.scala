object Question04a {
  // calculate wage
  def wage(hours: Int): Int = hours * 250;

  // calaulate Overtime
  def ot(hours: Int): Int = hours * 85;

  // calculate total income
  def income(h1: Int, h2: Int): Int = wage(h1) + ot(h2);

  // calculate tax
  def tax(income: Int): Float = income * 0.12f;

  // reduce tax from income
  def takeHome(h1: Int, h2: Int): Double = income(h1, h2) - tax(income(h1, h2));

  // main function
  def main(args: Array[String]) = {
    println(+takeHome(30, 40));
  }
}
