package Observer

class PendingScreen :  OrderStatusListener {
    override fun onOrderStatusUpdate(status: String) {
        println(" Order status  PendingScreen : $status")
    }
}