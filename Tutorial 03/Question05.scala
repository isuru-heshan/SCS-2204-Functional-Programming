object Question05 {

  // function for easy stage
  def easy(x: Int): Int = x * 8;

  // function for tempo stage
  def tempo(x: Int): Int = x * 7;

  // main function
  def main(args: Array[String]) = {

    println("Ttotal running time : " + (easy(2) + tempo(3) + easy(2)));

  }

}
