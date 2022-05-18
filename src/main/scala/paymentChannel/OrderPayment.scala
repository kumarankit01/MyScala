package paymentChannel

import scala.util.{Failure, Success, Try}

// Your old code in bash has been preserved below.
// ## You are working for a company processing orders (Hungerstation)
// ## Your today's task is to write a piece of code that is responsible of processing payments for orders.

// ## Business requirements
// ### 1. Your system should handle 3 different payments methods (Credit Card, Bank Transfer, Paypal) => please keep in mind that later, PM might ask you to add more and more methods, so your code should be ready for this.
// ### 2. Your system should give the ability to split payment over these different payments methods => for instance, for a 100$ order; user can decide to pay 10$ using CC, 10$ using BT, and 80$ using PP.
// ## return error in case of
// ## Your input (pseudocode)

// class PaymentTransaction {
//     - amount Float
//     - paymentMethodName String // cc or bt or pp
// }

// class OrderPayment {
//     - splits []PaymentTransaction
// }
trait IOrderPayment {
  def charge(list: List[PaymentTransaction])
}

class OrderPayment(payment: PaymentChannel, paymentValidation: PaymentValidation) extends IOrderPayment {
  override def charge(list: List[PaymentTransaction]): Unit = {
    if (list.size > 1) {
      //list.map(paymentValidation.validate).map(payment.pay(_))
      Try(paymentValidation.validateAll(list).map(payment.pay)) match {
        case Success(s) => ???
        case Failure(e) => ???
      }
    }
  }
}
