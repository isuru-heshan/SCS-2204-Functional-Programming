object Question03 {
  class Account(id: String, ac: Int, bal: Double) {
    val nic: String = id
    val acnumber: Int = ac
    var balance: Double = bal
    override def toString =
      "[" + "NIC - " + nic + " : " + "ACC NO - " + acnumber + " : " + "Balance - " + balance + "]"
    def withdraw(amount: Double) = this.balance = this.balance - amount
    def deposit(amount: Double) = this.balance = this.balance + amount
    def transfer(acc: Account, amount: Double) = {
      this.balance = this.balance - amount
      acc.balance = acc.balance + amount
    }
  }

  def main(args: Array[String]) = {

    var ac1 = new Account("123", 456, 50000)
    var ac2 = new Account("321", 654, 30000)

    println(ac1)
    println(ac2)

    ac1.transfer(ac2, 30000)

    println(ac1)
    println(ac2)

  }
}
