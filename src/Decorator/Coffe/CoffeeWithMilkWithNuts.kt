package Decorator.Coffe

class CoffeeWithMilkWithNuts
    (private val coffeeProccess: CoffeeProccess) : CoffeeDecorator(coffeeProccess) {
    override fun getCost(): Int {
        return super.getCost() + 20
    }
}