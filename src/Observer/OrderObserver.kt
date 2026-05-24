package Observer

class OrderObserver {

    val subscribers = mutableListOf<OrderStatusListener>()

    var status = ""

    fun addSubscribeToOrderObserver(orderStatusListener: OrderStatusListener) {
        subscribers.add(orderStatusListener)
    }

    fun changeOrderStatus(orderStatus: String) {
        status = orderStatus

        println("Changed status to $status")


        subscribers.forEach {
            it.onOrderStatusUpdate(status)
        }
    }
}