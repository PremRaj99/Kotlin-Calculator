package com.cuteboy.calculator

data class CalculatorState(
    val Number1: String = "",
    val Number2: String = "",
    val operation: CalculatorOperation? = null
)
