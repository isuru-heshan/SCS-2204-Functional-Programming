object Question04 {

  // function for calculate book price
  def bookPrice(x: Int): Double = x * 24.95
  
  // function for calculate discount 
  def discount(amount: Double): Double = amount * .4

  // function for calculate shipping cost
  def shippingCost(x: Int): Double = {
    if (x <= 50) {
      return 3 * x;
    } else {
      return 3 * 50 + (x - 50) * .75
    }
  }

  // main function
  def main(args: Array[String]) = {

    println(
      "the total wholesale cost for 60 copies is = " + (
        bookPrice(60) - discount(bookPrice(60)) + shippingCost(60)
      )
    );

  }
}
