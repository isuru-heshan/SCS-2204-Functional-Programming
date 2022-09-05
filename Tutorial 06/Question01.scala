object Question01 {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  
  val Encrypt = (c: Char, key: Int, alphabet: String) =>
    alphabet((alphabet.indexOf(c.toUpper) + key) % alphabet.size);
  
  val Decrypt = (c: Char, key: Int, alphabet: String) =>
    alphabet((alphabet.length + (alphabet.indexOf(c.toUpper) - key)) % alphabet.size);

  val cipher =
    (algo: (Char, Int, String) => Char, string: String, key: Int, alphabet: String) =>
      string.map(algo(_, key, alphabet));
  
  def main(args: Array[String]): Unit = {
    
    var key = 5;
    
    println(cipher(Encrypt, "HELLOWORLD", key, alphabet));
    
    println(cipher(Decrypt, "HJFXFWHNUMJW", key, alphabet));
  
    
  }
}