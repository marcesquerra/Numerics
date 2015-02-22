package com.bryghts.numerics.impl

import com.bryghts.numerics.ExtendedIntegral

import scala.math.Numeric.CharIsIntegral
import scala.math.Ordering.CharOrdering

/**
 * Created by dunlord on 22/02/15.
 */
object CharExtendedNumeric          extends CharIsIntegral
                                       with CharOrdering
                                       with ExtendedIntegral[Char]
{
    override def toShort        (x: Char): Short      = x.toShort
    override def toBigInt       (x: Char): BigInt     = BigInt(x)
    override def toBigDecimal   (x: Char): BigDecimal = BigDecimal(x)
    override def toByte         (x: Char): Byte       = x.toByte
    override def toChar         (x: Char): Char       = x

    override def fromShort      (x: Short):      Char = x.toChar
    override def fromBigInt     (x: BigInt):     Char = x.toChar
    override def fromByte       (x: Byte):       Char = x.toChar
    override def fromDouble     (x: Double):     Char = x.toChar
    override def fromFloat      (x: Float):      Char = x.toChar
    override def fromBigDecimal (x: BigDecimal): Char = x.toChar
    override def fromChar       (x: Char):       Char = x.toChar
    override def fromLong       (x: Long):       Char = x.toChar

}


