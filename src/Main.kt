import Decorator.Coffe.BaseCoffee
import Decorator.Coffe.CoffeeWithMilkWithNuts
import Observer.OnReceivedScreen
import Observer.OnWayScreen
import Observer.OrderObserver
import Observer.PendingScreen
import Proxy.AtmProxy
import Proxy.CibBank

fun main() {

    val orderObserver  = OrderObserver()

    val pendingScreen  = PendingScreen()
    val onWayScreen = OnWayScreen()
    val onReceivedScreen = OnReceivedScreen()

    orderObserver.addSubscribeToOrderObserver(pendingScreen)
    orderObserver.addSubscribeToOrderObserver(onWayScreen)
    orderObserver.addSubscribeToOrderObserver(onReceivedScreen)

    orderObserver.changeOrderStatus("welcome to observer pattern")



}