package AbstractFactory

class PosOperation  (private val factory : PosFactory) {
    fun doOperation (){
        val printer  = factory.printer()
        val reader   =factory.reader()

        printer.print()
        reader.reader()
    }
}