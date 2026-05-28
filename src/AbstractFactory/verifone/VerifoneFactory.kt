package AbstractFactory.verifone

import AbstractFactory.PosFactory
import AbstractFactory.Printer
import AbstractFactory.Reader

object VerifoneFactory : PosFactory {
    override fun reader(): Reader = VerifoneReader()

    override fun printer(): Printer   = VerifonePrinter()
}