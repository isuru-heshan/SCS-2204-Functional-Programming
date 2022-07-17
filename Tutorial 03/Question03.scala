object Question03 {

  // function for calculate volume
  def volumeOfSphere(r: Double): Double = r * r * r * math.Pi * 4 / 3

  // main function
  def main(args: Array[String]) = {

    println("the volume of a sphere with radius 5 is : " + volumeOfSphere(5));

  }
}
