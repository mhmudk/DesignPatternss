package Factory.Online

import Factory.PaymentProcessor

class Meeza :  PaymentProcessor() {
    override fun pay() {
        println("starting to pay by Meeza ")
    }
}