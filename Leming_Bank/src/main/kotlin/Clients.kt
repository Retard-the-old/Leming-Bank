import java.util.*

class Clients {

    var account_number : Int =0
    var account_balance : Float = 0.00f
    lateinit var account_name : String

    fun Deposit(amount: Float){

        var depoAmt = Scanner(System.`in`)
        println("Enter the amount you wish to deposit:")
        var depositAmt = depoAmt.nextFloat()

        this.account_balance += depositAmt
        println("New Account Balance is $account_balance")
    }

    fun Withdraw(amount: Float){
        var withAmt = Scanner(System.`in`)
        println("Enter the amount you wish to deposit:")
        var withdrawAmt = withAmt.nextFloat()

        this.account_balance -= withdrawAmt
        println("New Account Balance is $account_balance")
    }

    fun CheckBalance(){
        println("Current balance is $account_balance")
    }

}