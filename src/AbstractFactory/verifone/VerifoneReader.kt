package AbstractFactory.verifone

import AbstractFactory.Printer
import AbstractFactory.Reader

class VerifoneReader :  Reader {
    override fun reader() {
        println("verifone starting reader ")
    }
}