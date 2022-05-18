package paymentChannel

import paymentChannel.PaymentChannels.PaymentChannels

trait IPaymentChannel {
  def pay(transaction: PaymentTransaction): Boolean = {
    validation
    ???
  }

  def validation: Boolean = ???

  def channelId: Int = ???
}

case object CreditCard extends IPaymentChannel {
  val name = "CreditCard"
}

class PaymentChannel(list: List[IPaymentChannel]) {

   def pay(transaction: PaymentTransaction): Boolean = {
    transaction.paymentMethodName match {
      case PaymentChannels.paypal => list.filter(_.channelId == 1).head.pay(transaction)
      case PaymentChannels.CreditCard => list.filter(_.channelId == 2).head.pay(transaction)
      case PaymentChannels.bank => list.filter(_.channelId == 3).head.pay(transaction)
    }

  }

   def validation: Boolean = ???
}

object PaymentChannels extends Enumeration {
  type PaymentChannels = Value
  val CreditCard = Value(0)
  val paypal = Value(1)
  val bank = Value(2)
}