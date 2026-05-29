package Factory.Online

import Factory.PaymentProcessor

class Visa  : PaymentProcessor()  {
    override fun pay() {
        println("starting to pay by Visa")
    }
}