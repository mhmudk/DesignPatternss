
/*

            TODO
             - We use apply to modify on the object and return the current object with the changes.
             -

 */



class PaymentReq private constructor(
    val amount: Double,
    val merchantId: String,
    val currency: String,
    val customerName: String,
    val customerPhoneNumber: String,
) {

    class Builder {
        // Todo these all required attr
        private var amount: Double = 0.0
        private var merchantId: String = ""
        private var currency: String = ""

        // TODO these all optional attr
        private var customerName: String? = null
        private var customerPhoneNumber: String? = null


        fun setAmount(amount: Double) = apply {
            this.amount = amount
        }

        fun setMerchantId(merchantId: String) = apply { this.merchantId = merchantId }
        fun setCurrency(currency: String) = apply { this.currency = currency }

        fun setCustomerName(customerName: String) = apply { this.customerName = customerName }

        fun setCustomerPhoneNumber(customerPhoneNumber: String) =
            apply { this.customerPhoneNumber = customerPhoneNumber }



        fun build(): PaymentReq {
            // TODO here we can validate our data like amount ...etc
            if(amount <= 0){
                throw IllegalArgumentException("Amount must be greater than 0")
            }
            // TODO more and more validate if u want .

            return PaymentReq(
                amount = amount,
                merchantId = merchantId,
                currency = currency,
                customerName = customerName ?: "NULL",
                customerPhoneNumber = customerPhoneNumber ?: "NULL",
            )
        }


    }


}