package Decorator.Coffe

open class CoffeeDecorator (private val coffeeProccess: CoffeeProccess)  : CoffeeProccess {
    override fun getCost(): Int {
        return coffeeProccess.getCost()
    }
}