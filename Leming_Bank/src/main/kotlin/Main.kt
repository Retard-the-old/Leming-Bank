import java.util.*

/* Leming Bank. Main class. login, register, check balance, deposit, change branch, apply for loan */

fun main(args: Array<String>) {
    println("Hello World!")

    println("Welcome to Leming Bank")

    println("Enter your name: ")
    var visitor = Scanner(System.`in`)
    var welcome = visitor.nextLine()


    var guests = arrayOf("Joan", "John", "Amber", "Ambrose", "Teddy", "Aaron")

    if (welcome in guests) {
        println("Welcome back $welcome")
        Choices()
    } else {
        println("Please register first")
    }
}

fun Choices(){
    println("Please Pick An Action:")
    println(" 1. Check balance \n" +
            " 2. Deposit \n" +
            " 3. Withdraw \n" +
            " 4. Apply for loan")
    var pickOne = Scanner(System.`in`)
    var pickone = pickOne.nextInt()

    var choice = arrayOf(1,2,3,4)
    var bank = Clients()

    if (pickone in choice){
        if (pickone == 1){
            bank.CheckBalance()
            println("\n")
            Choices()
        }else if (pickone == 2){
            bank.Deposit(100.00f)
        }else if (pickone == 3){
            bank.Withdraw(amount = 50.00f)
        }else if (pickone == 4){
            Loans()
        }else{
            println("Thank you for visiting Leming. \n")
            return
        }
    }

}