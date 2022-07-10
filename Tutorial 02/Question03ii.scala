object Question03ii {
  def main(args: Array[String]) = {
    var (a, b, c, d) = (2, 3, 4, 5);
    var k = 4.3f

    // from prevoius question
    var g = 4.0f;

    b -= 1;
    println(b * a + c * d);
    d -= 1;

    println(a);
    a += 1;

    // g variable copied from prevoius question
    println(-2 * (g - k) + c);

    println(c);
    c += 1;

    c += 1;
    c += a;
    println(c);
    a += 1;
  }
}
