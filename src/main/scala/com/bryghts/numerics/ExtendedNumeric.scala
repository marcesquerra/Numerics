package com.bryghts.numerics

/**
 * Created by dunlord on 22/02/15.
 */
trait ExtendedNumeric[T]    extends Numeric[T]
                               with NumericBuilders[T]
                               with NumericConverters[T]

trait ExtendedIntegral[T]   extends Integral[T]
                               with ExtendedNumeric[T]

trait ExtendedFractional[T] extends Fractional[T]
                               with ExtendedNumeric[T]
