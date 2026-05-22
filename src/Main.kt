import Decorator.Coffe.BaseCoffee
import Decorator.Coffe.CoffeeWithMilkWithNuts
import Proxy.AtmProxy
import Proxy.CibBank

fun main() {


    val atmProxy   = AtmProxy(CibBank())

    println("withdraw from CIB bank"+atmProxy.withdraw(30))
}