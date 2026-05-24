package Observer

class  OnWayScreen :  OrderStatusListener {
    override fun onOrderStatusUpdate(status: String) {
        println("Order status  OnWayScreen : $status")
    }
}