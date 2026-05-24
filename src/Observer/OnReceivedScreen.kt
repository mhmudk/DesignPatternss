package Observer

class OnReceivedScreen :  OrderStatusListener {
    override fun onOrderStatusUpdate(status: String) {
        println("Order status  OnReceivedScreen: $status")
    }
}