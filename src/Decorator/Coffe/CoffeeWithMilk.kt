package Decorator.Coffe

class CoffeeWithMilk(
    private val coffeeProccess: CoffeeProccess
) : CoffeeDecorator(coffeeProccess) {
    override fun getCost(): Int {
        return super.getCost() + 10
    }

}