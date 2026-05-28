package AbstractFactory.pax

import AbstractFactory.PosFactory
import AbstractFactory.Printer
import AbstractFactory.Reader

object PaxFactory : PosFactory {
    override fun reader(): Reader = PaxReader()

    override fun printer(): Printer = PaxPrinter()
}