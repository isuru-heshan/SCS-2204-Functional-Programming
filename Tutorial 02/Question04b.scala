object Question04b {
  // calculate attendees
  def attendees(price: Int): Int = 120 + (15 - price) / 5 * 20;

  // calculate revenue
  def revenue(price: Int): Int = attendees(price) * price;

  // calculate cost 500 + 3 for each
  def cost(price: Int): Int = 500 + 3 * attendees(price);

  // calculate total profit
  def profit(price: Int): Int = revenue(price) - cost(price);

  // main function
  def main(args: Array[String]) = {
    println(profit(25));
  }
}
