package com.bryghts.numerics.impl

import com.bryghts.numerics.ExtendedFractional

import scala.math.Numeric.BigDecimalIsFractional
import scala.math.Ordering.BigDecimalOrdering

/**
 * Created by dunlord on 22/02/15.
 */
object BigDecimalExtendedNumeric         extends BigDecimalIsFractional
                                            with BigDecimalOrdering
                                            with ExtendedFractional[BigDecimal]
{

    override def toByte         (x: BigDecimal): Byte       = x.toByte
    override def toBigInt       (x: BigDecimal): BigInt     = x.toBigInt
    override def toBigDecimal   (x: BigDecimal): BigDecimal = x
    override def toShort        (x: BigDecimal): Short      = x.toShort
    override def toChar         (x: BigDecimal): Char       = x.toChar

    override def fromShort      (x: Short):      BigDecimal = BigDecimal(x)
    override def fromBigInt     (x: BigInt):     BigDecimal = BigDecimal(x)
    override def fromByte       (x: Byte):       BigDecimal = BigDecimal(x)
    override def fromDouble     (x: Double):     BigDecimal = BigDecimal(x)
    override def fromFloat      (x: Float):      BigDecimal = BigDecimal(x.toDouble)
    override def fromBigDecimal (x: BigDecimal): BigDecimal = x
    override def fromChar       (x: Char):       BigDecimal = BigDecimal(x)
    override def fromLong       (x: Long):       BigDecimal = BigDecimal(x)

}
