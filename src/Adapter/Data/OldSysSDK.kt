package Adapter.Data

class OldSysSDK {
    fun getBalance(accountId: String): String {
        return hashMapOf(
            "123" to "1000.00",
            "456" to "2500.50",
            "789" to "500.75"
        )[accountId] ?: "0.00"
    }
}