package Decorator.Coffe

class BaseCoffee  : CoffeeProccess {
    override fun getCost(): Int {
        return 10
    }
}