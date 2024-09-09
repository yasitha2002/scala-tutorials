object labsheet10q4 {
  class Account(var balance: Double) {

    def deposit(amount: Double): Unit = {
      if (amount > 0) balance += amount
    }

    def withdraw(amount: Double): Unit = {
      if (amount > 0 && amount <= balance) balance -= amount
    }

    def transfer(amount: Double, toAccount: Account): Unit = {
      if (amount > 0 && amount <= balance) {
        this.withdraw(amount)
        toAccount.deposit(amount)
      }
    }

    def applyInterest(): Unit = {
      if (balance > 0) {
        balance += balance * 0.05
      } else {
        balance += balance * 0.1
      }
    }

    override def toString: String = s"Account(balance: $balance)"
  }

  class Bank(val accounts: List[Account]) {

    def accountsWithNegativeBalances: List[Account] = {
      accounts.filter(_.balance < 0)
    }

    def totalBalance: Double = {
      accounts.map(_.balance).sum
    }

    def applyInterestToAllAccounts(): Unit = {
      accounts.foreach(_.applyInterest())
    }
  }

  def main(args:Array[String]): Unit =
  {
    val account1 = new Account(1000.0)
    val account2 = new Account(-200.0)
    val account3 = new Account(500.0)

    val bank = new Bank(List(account1, account2, account3))

    val negativeAccounts = bank.accountsWithNegativeBalances
    println(s"Accounts with negative balances: $negativeAccounts")

    val total = bank.totalBalance
    println(s"Total balance of all accounts: $total")

    bank.applyInterestToAllAccounts()
    println(s"Final balances after applying interest: ${bank.accounts}")
  }
}
