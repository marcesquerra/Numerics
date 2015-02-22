package com.bryghts.numerics

/**
 * Created by dunlord on 22/02/15.
 */
trait NumericConverters[T] {

    def toByte       (x: T): Byte
    def toChar       (x: T): Char
    def toShort      (x: T): Short
    def toInt        (x: T): Int
    def toLong       (x: T): Long
    def toFloat      (x: T): Float
    def toDouble     (x: T): Double
    def toBigInt     (x: T): BigInt
    def toBigDecimal (x: T): BigDecimal

}
