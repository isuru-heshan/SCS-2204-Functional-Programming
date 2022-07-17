object Question01 {

  // function for calculate area
  def areaOfDisk(r: Double): Double = math.Pi * r * r;

  // main function
  def main(args: Array[String]) = {

    println("the area of a disk with radius 5 is :" + areaOfDisk(5));

  }
}
