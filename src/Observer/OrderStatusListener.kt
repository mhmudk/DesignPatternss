package Observer

interface OrderStatusListener {
    fun onOrderStatusUpdate(status: String)
}