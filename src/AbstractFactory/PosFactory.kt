package AbstractFactory

interface PosFactory {
    fun reader() : Reader
    fun printer() : Printer
}