fun main() {
    val amount = 4799

    val FEE = 0.0075
    val MIN_FEE = 35

    val feeAmount: Int = if((amount * FEE).toInt() <= MIN_FEE) MIN_FEE else (amount * FEE).toInt()

    println("Комиссия за перевод  суммы $amount рублей составит $feeAmount рублей")
}

