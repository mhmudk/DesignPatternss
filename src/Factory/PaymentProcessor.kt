package Factory

abstract class  PaymentProcessor {
    fun executePay() {
        println("start to pay ")
        println("choose the pay type ")
        pay()
    }
    abstract fun pay()
}