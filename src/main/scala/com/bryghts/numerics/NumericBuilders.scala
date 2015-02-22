package com.bryghts.numerics

/**
 * Created by dunlord on 22/02/15.
 */
trait NumericBuilders[T] {

    def fromByte       (x: Byte): T
    def fromChar       (x: Char): T
    def fromShort      (x: Short): T
    def fromInt        (x: Int): T
    def fromLong       (x: Long): T
    def fromFloat      (x: Float): T
    def fromDouble     (x: Double): T
    def fromBigInt     (x: BigInt): T
    def fromBigDecimal (x: BigDecimal): T

}
