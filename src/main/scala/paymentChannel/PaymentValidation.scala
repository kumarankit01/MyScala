package paymentChannel

trait PaymentValidation {
  def validate: PaymentTransaction => PaymentTransaction = ???

  def validateAll: List[PaymentTransaction] => List[PaymentTransaction] = ???
}
