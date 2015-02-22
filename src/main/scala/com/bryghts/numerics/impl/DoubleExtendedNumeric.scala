package com.bryghts.numerics.impl

import com.bryghts.numerics.ExtendedFractional

import scala.math.Numeric.DoubleIsFractional
import scala.math.Ordering.DoubleOrdering

/**
 * Created by dunlord on 22/02/15.
 */
object DoubleExtendedNumeric         extends DoubleIsFractional
                                       with DoubleOrdering
                                       with ExtendedFractional[Double]
{
    override def toByte         (x: Double): Byte       = x.toByte
    override def toBigInt       (x: Double): BigInt     = BigInt(x.toLong)
    override def toBigDecimal   (x: Double): BigDecimal = BigDecimal(x)
    override def toShort        (x: Double): Short      = x.toShort
    override def toChar         (x: Double): Char       = x.toChar

    override def fromShort      (x: Short):      Double = x.toDouble
    override def fromBigInt     (x: BigInt):     Double = x.toDouble
    override def fromByte       (x: Byte):       Double = x.toDouble
    override def fromDouble     (x: Double):     Double = x.toDouble
    override def fromFloat      (x: Float):      Double = x.toDouble
    override def fromBigDecimal (x: BigDecimal): Double = x.toDouble
    override def fromChar       (x: Char):       Double = x.toDouble
    override def fromLong       (x: Long):       Double = x.toDouble

}
