import AbstractFactory.PosOperation
import AbstractFactory.pax.PaxFactory
import Decorator.Coffe.BaseCoffee
import Decorator.Coffe.CoffeeWithMilkWithNuts
import Observer.OnReceivedScreen
import Observer.OnWayScreen
import Observer.OrderObserver
import Observer.PendingScreen
import Proxy.AtmProxy
import Proxy.CibBank

fun main() {

    val pax = PosOperation(
        PaxFactory
    )

    pax.doOperation()


}