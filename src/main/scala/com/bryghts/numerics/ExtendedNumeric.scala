package com.bryghts.numerics

/**
 * Created by dunlord on 22/02/15.
 */
trait ExtendedNumeric[T]    extends Numeric[T]
                               with NumericBuilders[T]
                               with NumericConverters[T]
{
    override def lteq(x: T, y: T): Boolean = super[Numeric].lteq(x, y)
    override def gteq(x: T, y: T): Boolean = super[Numeric].gteq(x, y)
    override def lt  (x: T, y: T): Boolean = super[Numeric].lt(x, y)
    override def gt  (x: T, y: T): Boolean = super[Numeric].gt(x, y)
}

trait ExtendedIntegral[T]   extends Integral[T]
                               with ExtendedNumeric[T]
{
}

trait ExtendedFractional[T] extends Fractional[T]
                               with ExtendedNumeric[T]
{
}
