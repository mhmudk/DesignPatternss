package Proxy

class AtmProxy (private val cibBank: CibBank): ATMServices {
    override fun withdraw(amount: Int) {
    cibBank.withdraw(amount)
    }
}