package Demo

object labsheet10q3 {
  class Account(var balance: Double) {

    def deposit(amount: Double): Unit = {
      if (amount > 0) {
        balance += amount
        println(s"Deposited $amount. New balance: $balance")
      } else {
        println("Deposit amount must be positive.")
      }
    }

    def withdraw(amount: Double): Unit = {
      if (amount > 0 && amount <= balance) {
        balance -= amount
        println(s"Withdrew $amount. New balance: $balance")
      } else if (amount > balance) {
        println("Insufficient balance.")
      } else {
        println("Withdraw amount must be positive.")
      }
    }

    def transfer(amount: Double, toAccount: Account): Unit = {
      if (amount > 0 && amount <= balance) {
        this.withdraw(amount)
        toAccount.deposit(amount)
        println(s"Transferred $amount to another account. New balance: $balance")
      } else if (amount > balance) {
        println("Insufficient balance for transfer.")
      } else {
        println("Transfer amount must be positive.")
      }
    }
  }

  def main(args:Array[String]): Unit =
  {
    print("Account 1 initial balance: ")
    val balance1 = scala.io.StdIn.readDouble()

    print("Account 2 initial balance: ")
    val balance2 = scala.io.StdIn.readDouble()

    val acc1 = new Account(balance1)
    val acc2 = new Account(balance2)


    acc1.deposit(200.0)
    acc1.withdraw(100.0)
    acc1.transfer(150.0, acc2)

    println(s"Account 1 balance: ${acc1.balance}")
    println(s"Account 2 balance: ${acc2.balance}")
  }
}
