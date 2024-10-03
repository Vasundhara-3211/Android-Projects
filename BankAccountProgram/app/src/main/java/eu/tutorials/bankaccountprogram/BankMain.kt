package eu.tutorials.bankaccountprogram

fun main()
{
    val vasuBankAccount = BankAccount("Vasundhara Patil", 20000.56)
    val sarahBankAccount = BankAccount("Sarah", 0.0)

    println(vasuBankAccount.accountHolder)
    vasuBankAccount.deposit(200.0)
    vasuBankAccount.withdraw(1200.00)
    vasuBankAccount.deposit(3000.00)
    vasuBankAccount.deposit(2000.00)
    vasuBankAccount.withdraw(3333.15)

    vasuBankAccount.displayTransactionHistory()
//    println("${vasuBankAccount.accountHolder}'s" + " balance is ${vasuBankAccount.balance}")
    println("${vasuBankAccount.accountHolder}'s current balance is : ${vasuBankAccount.acctBalance()}")


    sarahBankAccount.deposit(100.00)
    sarahBankAccount.withdraw(10.0)
    sarahBankAccount.deposit(300.0)
    sarahBankAccount.displayTransactionHistory()
    println("${sarahBankAccount.accountHolder}'s current balance is : ${sarahBankAccount.acctBalance()}")
}
