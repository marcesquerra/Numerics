package com.bryghts

/**
 * Created by dunlord on 22/02/15.
 */
package object numerics {

    implicit val ByteExtendedNumeric       = impl.ByteExtendedNumeric
    implicit val CharExtendedNumeric       = impl.CharExtendedNumeric
    implicit val ShortExtendedNumeric      = impl.ShortExtendedNumeric
    implicit val IntExtendedNumeric        = impl.IntExtendedNumeric
    implicit val LongExtendedNumeric       = impl.LongExtendedNumeric
    implicit val FloatExtendedNumeric      = impl.FloatExtendedNumeric
    implicit val DoubleExtendedNumeric     = impl.DoubleExtendedNumeric
    implicit val BigIntExtendedNumeric     = impl.BigIntExtendedNumeric
    implicit val BigDecimalExtendedNumeric = impl.BigDecimalExtendedNumeric

    implicit val (implicitCharBytePolynumeric,         implicitByteCharPolynumeric)          = PolyNumeric.Integral  .forBothDirections[Char,       Byte, Int]          (_.toInt, _.toInt)
    implicit val (implicitShortBytePolynumeric,        implicitByteShortPolynumeric)         = PolyNumeric.Integral  .forBothDirections[Short,      Byte, Int]          (_.toInt, _.toInt)
    implicit val (implicitIntBytePolynumeric,          implicitByteIntPolynumeric)           = PolyNumeric.Integral  .forBothDirections[Int,        Byte]               (_.toInt)
    implicit val (implicitLongBytePolynumeric,         implicitByteLongPolynumeric)          = PolyNumeric.Integral  .forBothDirections[Long,       Byte]               (_.toLong)
    implicit val (implicitFloatBytePolynumeric,        implicitByteFloatPolynumeric)         = PolyNumeric.Fractional.forBothDirections[Float,      Byte]               (_.toFloat)
    implicit val (implicitDoubleBytePolynumeric,       implicitByteDoublePolynumeric)        = PolyNumeric.Fractional.forBothDirections[Double,     Byte]               (_.toDouble)
    implicit val (implicitBigIntBytePolynumeric,       implicitByteBigIntPolynumeric)        = PolyNumeric.Integral  .forBothDirections[BigInt,     Byte]               (BigInt(_))
    implicit val (implicitBigDecimalBytePolynumeric,   implicitByteBigDecimalPolynumeric)    = PolyNumeric.Fractional.forBothDirections[BigDecimal, Byte]               (BigDecimal(_))
    implicit val (implicitShortCharPolynumeric,        implicitCharShortPolynumeric)         = PolyNumeric.Integral  .forBothDirections[Short,      Char, Int]          (_.toInt, _.toInt)
    implicit val (implicitIntCharPolynumeric,          implicitCharIntPolynumeric)           = PolyNumeric.Integral  .forBothDirections[Int,        Char]               (_.toInt)
    implicit val (implicitLongCharPolynumeric,         implicitCharLongPolynumeric)          = PolyNumeric.Integral  .forBothDirections[Long,       Char]               (_.toLong)
    implicit val (implicitFloatCharPolynumeric,        implicitCharFloatPolynumeric)         = PolyNumeric.Fractional.forBothDirections[Float,      Char]               (_.toFloat)
    implicit val (implicitDoubleCharPolynumeric,       implicitCharDoublePolynumeric)        = PolyNumeric.Fractional.forBothDirections[Double,     Char]               (_.toDouble)
    implicit val (implicitBigIntCharPolynumeric,       implicitCharBigIntPolynumeric)        = PolyNumeric.Integral  .forBothDirections[BigInt,     Char]               (BigInt(_))
    implicit val (implicitBigDecimalCharPolynumeric,   implicitCharBigDecimalPolynumeric)    = PolyNumeric.Fractional.forBothDirections[BigDecimal, Char]               (BigDecimal(_))
    implicit val (implicitIntShortPolynumeric,         implicitShortIntPolynumeric)          = PolyNumeric.Integral  .forBothDirections[Int,        Short]              (_.toInt)
    implicit val (implicitLongShortPolynumeric,        implicitShortLongPolynumeric)         = PolyNumeric.Integral  .forBothDirections[Long,       Short]              (_.toLong)
    implicit val (implicitFloatShortPolynumeric,       implicitShortFloatPolynumeric)        = PolyNumeric.Fractional.forBothDirections[Float,      Short]              (_.toFloat)
    implicit val (implicitDoubleShortPolynumeric,      implicitShortDoublePolynumeric)       = PolyNumeric.Fractional.forBothDirections[Double,     Short]              (_.toDouble)
    implicit val (implicitBigIntShortPolynumeric,      implicitShortBigIntPolynumeric)       = PolyNumeric.Integral  .forBothDirections[BigInt,     Short]              (BigInt(_))
    implicit val (implicitBigDecimalShortPolynumeric,  implicitShortBigDecimalPolynumeric)   = PolyNumeric.Fractional.forBothDirections[BigDecimal, Short]              (BigDecimal(_))
    implicit val (implicitLongIntPolynumeric,          implicitIntLongPolynumeric)           = PolyNumeric.Integral  .forBothDirections[Long,       Int]                (_.toLong)
    implicit val (implicitFloatIntPolynumeric,         implicitIntFloatPolynumeric)          = PolyNumeric.Fractional.forBothDirections[Float,      Int]                (_.toFloat)
    implicit val (implicitDoubleIntPolynumeric,        implicitIntDoublePolynumeric)         = PolyNumeric.Fractional.forBothDirections[Double,     Int]                (_.toDouble)
    implicit val (implicitBigIntIntPolynumeric,        implicitIntBigIntPolynumeric)         = PolyNumeric.Integral  .forBothDirections[BigInt,     Int]                (BigInt(_))
    implicit val (implicitBigDecimalIntPolynumeric,    implicitIntBigDecimalPolynumeric)     = PolyNumeric.Fractional.forBothDirections[BigDecimal, Int]                (BigDecimal(_))
    implicit val (implicitFloatLongPolynumeric,        implicitLongFloatPolynumeric)         = PolyNumeric.Fractional.forBothDirections[Float,      Long]               (_.toFloat)
    implicit val (implicitDoubleLongPolynumeric,       implicitLongDoublePolynumeric)        = PolyNumeric.Fractional.forBothDirections[Double,     Long]               (_.toDouble)
    implicit val (implicitBigIntLongPolynumeric,       implicitLongBigIntPolynumeric)        = PolyNumeric.Integral  .forBothDirections[BigInt,     Long]               (BigInt(_))
    implicit val (implicitBigDecimalLongPolynumeric,   implicitLongBigDecimalPolynumeric)    = PolyNumeric.Fractional.forBothDirections[BigDecimal, Long]               (BigDecimal(_))
    implicit val (implicitDoubleFloatPolynumeric,      implicitFloatDoublePolynumeric)       = PolyNumeric.Fractional.forBothDirections[Double,     Float]              (_.toDouble)
    implicit val (implicitBigIntFloatPolynumeric,      implicitFloatBigIntPolynumeric)       = PolyNumeric.Fractional.forBothDirections[BigInt,     Float, BigDecimal]  (BigDecimal(_), f => BigDecimal(f.toDouble))
    implicit val (implicitBigDecimalFloatPolynumeric,  implicitFloatBigDecimalPolynumeric)   = PolyNumeric.Fractional.forBothDirections[BigDecimal, Float]              (f => BigDecimal(f.toDouble))
    implicit val (implicitBigIntDoublePolynumeric,     implicitDoubleBigIntPolynumeric)      = PolyNumeric.Fractional.forBothDirections[BigInt,     Double, BigDecimal] (BigDecimal(_), BigDecimal(_))
    implicit val (implicitBigDecimalDoublePolynumeric, implicitDoubleBigDecimalPolynumeric)  = PolyNumeric.Fractional.forBothDirections[BigDecimal, Double]             (BigDecimal(_))
    implicit val (implicitBigDecimalBigIntPolynumeric, implicitBigIntBigDecimalPolynumeric)  = PolyNumeric.Fractional.forBothDirections[BigDecimal, BigInt]             (BigDecimal(_))

}
