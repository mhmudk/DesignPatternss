package Facade

import Facade.subSystems.BankTransferService
import Facade.subSystems.OtpService
import Facade.subSystems.SmsService
import Facade.subSystems.WalletService

class CashOutFacade {
    private val otpService = OtpService()
    private val walletService = WalletService()
    private val transferService = BankTransferService()
    private val smsService = SmsService()


    fun cashOut() {
        otpService.verifyOtp()
        walletService.checkBalance()
        transferService.transfer();
        smsService.sendSms()

        println("Cashout  Completed")
    }


}