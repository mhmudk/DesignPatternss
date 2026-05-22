import Decorator.Coffe.BaseCoffee
import Decorator.Coffe.CoffeeWithMilkWithNuts

fun main() {


    val coffee  = CoffeeWithMilkWithNuts(
        BaseCoffee()
    )
    println("The cost is "+coffee.getCost())

}