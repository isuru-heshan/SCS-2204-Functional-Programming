class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y
  def neg = new Rational(-this.numer, this.denom)
}
object Question01 {
  def main(args: Array[String]): Unit = {
    var r1 = new Rational(1, 2)
    var r2 = r1.neg
    println(r1.numer + " / " + r1.denom)
    println(r2.numer + " / " + r2.denom)
  }
}
