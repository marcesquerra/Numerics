package com.bryghts.numerics.impl

import com.bryghts.numerics.ExtendedIntegral

import scala.math.Numeric.ByteIsIntegral
import scala.math.Ordering.ByteOrdering

/**
 * Created by dunlord on 22/02/15.
 */
object ByteExtendedNumeric          extends ByteIsIntegral
                                       with ByteOrdering
                                       with ExtendedIntegral[Byte]
{
    override def toShort        (x: Byte): Short      = x.toShort
    override def toBigInt       (x: Byte): BigInt     = BigInt(x)
    override def toBigDecimal   (x: Byte): BigDecimal = BigDecimal(x)
    override def toByte         (x: Byte): Byte       = x
    override def toChar         (x: Byte): Char       = x.toChar

    override def fromShort      (x: Short):      Byte = x.toByte
    override def fromBigInt     (x: BigInt):     Byte = x.toByte
    override def fromByte       (x: Byte):       Byte = x.toByte
    override def fromDouble     (x: Double):     Byte = x.toByte
    override def fromFloat      (x: Float):      Byte = x.toByte
    override def fromBigDecimal (x: BigDecimal): Byte = x.toByte
    override def fromChar       (x: Char):       Byte = x.toByte
    override def fromLong       (x: Long):       Byte = x.toByte

}


