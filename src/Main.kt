fun main() {
    val payment  = PaymentReq.Builder()
        .setAmount(20.33)
        .setCurrency("EUR")
        .setMerchantId("222")
        .setCustomerName("Khattab")
        .build()

    println(payment.amount.toString())

}