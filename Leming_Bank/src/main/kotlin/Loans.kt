import com.sun.tools.javac.Main
import java.util.*
import javax.print.attribute.standard.PrinterLocation

class Loans {

    var loanAmt : Float = 15000.00f
    var loanBal : Float = 0.00f
    var loanPay : Float = 0.00f

    init {
        println("Please select an action: ")
        println("1. Apply for a loan \n" +
                "2. Check loan balance \n" +
                "3. Pay existing loan \n" +
                "4. back to Main Menu")
        var pick = Scanner(System.`in`)
        var loanpick = pick.nextInt()
        if (loanpick == 1){
            LoanAppl()
        }else if (loanpick == 2){
            LoanBal()
        }else if (loanpick == 3){
            LoanPay()
        }else{
            Main()
        }
    }

    fun LoanAppl(){
        println("You currently qualify for a loan of up to: $loanAmt")
        println("Please enter loan amount you want: ")
        var loanappl = Scanner(System.`in`)
        var amountloan = loanappl.nextFloat()
        if (amountloan <= loanAmt){
            var loanBal = loanAmt
            println("Loan application successful." +
                    "Your new loan balance is: $loanBal")
        }else{
            println("Please input a valid amount")
            LoanAppl()
        }

    }

    fun LoanBal(){
        println("Your current loan balance is $loanBal")
    }

    fun LoanPay(){
        println("Current loan balance is $loanBal. \n" +
                "Please enter amount you wish to deposit to pay your loan: ")
        var payloan = Scanner(System.`in`)
        var loanPay = payloan.nextFloat()

        var loanBal = loanBal - loanPay
    }
}