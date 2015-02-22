package com.bryghts.numerics.impl

import com.bryghts.numerics.ExtendedFractional

import scala.math.Numeric.FloatIsFractional
import scala.math.Ordering.FloatOrdering

/**
 * Created by dunlord on 22/02/15.
 */
object FloatExtendedNumeric         extends FloatIsFractional
                                       with FloatOrdering
                                       with ExtendedFractional[Float]
{
    override def toByte         (x: Float): Byte       = x.toByte
    override def toBigInt       (x: Float): BigInt     = BigInt(x.toLong)
    override def toBigDecimal   (x: Float): BigDecimal = BigDecimal(x.toDouble)
    override def toShort        (x: Float): Short      = x.toShort
    override def toChar         (x: Float): Char       = x.toChar

    override def fromShort      (x: Short):      Float = x.toFloat
    override def fromBigInt     (x: BigInt):     Float = x.toFloat
    override def fromByte       (x: Byte):       Float = x.toFloat
    override def fromDouble     (x: Double):     Float = x.toFloat
    override def fromFloat      (x: Float):      Float = x.toFloat
    override def fromBigDecimal (x: BigDecimal): Float = x.toFloat
    override def fromChar       (x: Char):       Float = x.toFloat
    override def fromLong       (x: Long):       Float = x.toFloat

}
