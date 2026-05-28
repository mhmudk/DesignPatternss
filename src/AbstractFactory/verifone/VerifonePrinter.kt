package AbstractFactory.verifone

import AbstractFactory.Printer

class VerifonePrinter :  Printer {
    override fun print() {
        println("verifone starting print ")
    }
}