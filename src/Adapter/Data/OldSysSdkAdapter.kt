package Adapter.Data

class OldSysSdkAdapter(
    private val oldSysSDK: OldSysSDK
) : AccountService {
    override fun getAccoundBalance(accountId: String): Double {
        val balance = oldSysSDK.getBalance(accountId)

        return balance.toDoubleOrNull() ?: 0.0
    }
}