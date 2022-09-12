object Question04 {
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
  val overdraft = (b: List[Account]) => b.filter(x => x.balance < 0)
  //val balance = (b: List[Account]): Double = {
    //b.reduce((ac1: Account, ac2: Account):Double = {ac1.balance + ac2.balance} )
  val interest = (b: List[Account]) =>
    b.map(_ match {
      case x if x.balance < 0 => x.balance - x.balance * 0.1
      case x if x.balance > 0 => x.balance + x.balance * 0.5
    })

  def main(args: Array[String]) = {
    var bank: List[Account] = List()

    var ac1 = new Account("123", 123, 50000)
    var ac2 = new Account("234", 234, 50000)
    var ac3 = new Account("345", 345, 30000)
    var ac4 = new Account("456", 456, 20000)
    var ac5 = new Account("567", 567, 10000)
    var ac6 = new Account("678", 678, -10000)

    bank(ac1, ac2, ac3, ac4, ac5, ac6)
    println(overdraft(bank))
  }
}
