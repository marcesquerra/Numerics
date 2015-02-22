package com.bryghts.numerics.impl

import com.bryghts.numerics.ExtendedIntegral

import scala.math.Numeric.IntIsIntegral
import scala.math.Ordering.IntOrdering

/**
 * Created by dunlord on 22/02/15.
 */
object IntExtendedNumeric           extends IntIsIntegral
                                       with IntOrdering
                                       with ExtendedIntegral[Int]
{
    override def toByte         (x: Int): Byte       = x.toByte
    override def toBigInt       (x: Int): BigInt     = BigInt(x)
    override def toBigDecimal   (x: Int): BigDecimal = BigDecimal(x)
    override def toShort        (x: Int): Short      = x.toShort
    override def toChar         (x: Int): Char       = x.toChar

    override def fromShort      (x: Short):      Int = x.toInt
    override def fromBigInt     (x: BigInt):     Int = x.toInt
    override def fromByte       (x: Byte):       Int = x.toInt
    override def fromDouble     (x: Double):     Int = x.toInt
    override def fromFloat      (x: Float):      Int = x.toInt
    override def fromBigDecimal (x: BigDecimal): Int = x.toInt
    override def fromChar       (x: Char):       Int = x.toInt
    override def fromLong       (x: Long):       Int = x.toInt

}
