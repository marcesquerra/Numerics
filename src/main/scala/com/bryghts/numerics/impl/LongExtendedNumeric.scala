package com.bryghts.numerics.impl

import com.bryghts.numerics.ExtendedIntegral

import scala.math.Numeric.LongIsIntegral
import scala.math.Ordering.LongOrdering

/**
 * Created by dunlord on 22/02/15.
 */
object LongExtendedNumeric          extends LongIsIntegral
                                       with LongOrdering
                                       with ExtendedIntegral[Long]
{
    override def toByte         (x: Long): Byte       = x.toByte
    override def toBigInt       (x: Long): BigInt     = BigInt(x)
    override def toBigDecimal   (x: Long): BigDecimal = BigDecimal(x)
    override def toShort        (x: Long): Short      = x.toShort
    override def toChar         (x: Long): Char       = x.toChar

    override def fromShort      (x: Short):      Long = x.toLong
    override def fromBigInt     (x: BigInt):     Long = x.toLong
    override def fromByte       (x: Byte):       Long = x.toLong
    override def fromDouble     (x: Double):     Long = x.toLong
    override def fromFloat      (x: Float):      Long = x.toLong
    override def fromBigDecimal (x: BigDecimal): Long = x.toLong
    override def fromChar       (x: Char):       Long = x.toLong
    override def fromLong       (x: Long):       Long = x.toLong

}
