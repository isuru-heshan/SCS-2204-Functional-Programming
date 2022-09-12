object Question02 {
  class Rational(x: Int, y: Int) {
    def numer = x
    def denom = y
    def add(r: Rational) =
      new Rational(
        this.numer * r.denom + r.numer * this.denom,
        this.denom * r.denom
      )
    def neg = new Rational(-this.numer, this.denom)
    def sub(r: Rational) = this.add(r.neg)
    def -(r: Rational) = this.sub(r)

    override def toString(): String = {
      this.numer + "/" + this.denom
    }
  }

  def main(args: Array[String]): Unit = {

    val x = new Rational(3, 4);
    val y = new Rational(5, 8);
    val z = new Rational(2, 7);

    println("x = " + x)
    println("y = " + y)
    println("z = " + z)

    println("x - y - z = " + (x - y - z))

  }
}
