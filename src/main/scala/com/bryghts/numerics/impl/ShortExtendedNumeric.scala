package com.bryghts.numerics.impl

import com.bryghts.numerics.ExtendedIntegral

import scala.math.Numeric.ShortIsIntegral
import scala.math.Ordering.ShortOrdering

/**
 * Created by dunlord on 22/02/15.
 */
object ShortExtendedNumeric         extends ShortIsIntegral
                                       with ShortOrdering
                                       with ExtendedIntegral[Short]
{
    override def toByte         (x: Short): Byte       = x.toByte
    override def toBigInt       (x: Short): BigInt     = BigInt(x)
    override def toBigDecimal   (x: Short): BigDecimal = BigDecimal(x)
    override def toShort        (x: Short): Short      = x
    override def toChar         (x: Short): Char       = x.toChar

    override def fromShort      (x: Short):      Short = x.toShort
    override def fromBigInt     (x: BigInt):     Short = x.toShort
    override def fromByte       (x: Byte):       Short = x.toShort
    override def fromDouble     (x: Double):     Short = x.toShort
    override def fromFloat      (x: Float):      Short = x.toShort
    override def fromBigDecimal (x: BigDecimal): Short = x.toShort
    override def fromChar       (x: Char):       Short = x.toShort
    override def fromLong       (x: Long):       Short = x.toShort

}
