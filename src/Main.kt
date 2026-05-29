import AbstractFactory.PosOperation
import AbstractFactory.pax.PaxFactory
import Decorator.Coffe.BaseCoffee
import Decorator.Coffe.CoffeeWithMilkWithNuts
import Factory.Online.Visa
import Factory.PaymentProcessor
import Observer.OnReceivedScreen
import Observer.OnWayScreen
import Observer.OrderObserver
import Observer.PendingScreen
import Proxy.AtmProxy
import Proxy.CibBank

fun main() {

  val online    : PaymentProcessor  = Visa()

    online.executePay()
}