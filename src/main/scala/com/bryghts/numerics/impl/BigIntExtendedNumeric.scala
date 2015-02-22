package com.bryghts.numerics.impl

import com.bryghts.numerics.ExtendedIntegral

import scala.math.Numeric.BigIntIsIntegral
import scala.math.Ordering.BigIntOrdering

/**
 * Created by dunlord on 22/02/15.
 */
object BigIntExtendedNumeric           extends BigIntIsIntegral
                                          with BigIntOrdering
                                          with ExtendedIntegral[BigInt]
{
    override def toByte         (x: BigInt): Byte       = x.toByte
    override def toBigInt       (x: BigInt): BigInt     = x
    override def toBigDecimal   (x: BigInt): BigDecimal = BigDecimal(x)
    override def toShort        (x: BigInt): Short      = x.toShort
    override def toChar         (x: BigInt): Char       = x.toChar

    override def fromShort      (x: Short):      BigInt = BigInt(x)
    override def fromBigInt     (x: BigInt):     BigInt = x
    override def fromByte       (x: Byte):       BigInt = BigInt(x)
    override def fromDouble     (x: Double):     BigInt = BigInt(x.toLong)
    override def fromFloat      (x: Float):      BigInt = BigInt(x.toLong)
    override def fromBigDecimal (x: BigDecimal): BigInt = x.toBigInt
    override def fromChar       (x: Char):       BigInt = BigInt(x)
    override def fromLong       (x: Long):       BigInt = BigInt(x)

}
