package Factory.Offline

import Factory.PaymentProcessor

class Cash : PaymentProcessor (){
    override fun pay() {
        println("starting to pay by cash")
    }
}