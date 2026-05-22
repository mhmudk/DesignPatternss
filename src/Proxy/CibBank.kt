package Proxy

class CibBank  : ATMServices {
    override fun withdraw(amount: Int) {
        println("CibBank with amount: $amount")
    }
}