package com.bryghts.numerics
package impl

class PolyNumericFromIntegral[A, B, R](
                 protected val fromA: A => R,
                 protected val fromB: B => R,
                 protected val num:   Integral[R])                extends PolyNumericFromNumeric[A, B, R]
                                                                     with IntegralPolyNumeric[A, B, R]
{
    def div     (a: A, b: B): R   = num.quot     (fromA(a), fromB(b))
    def rem     (a: A, b: B): R   = num.rem      (fromA(a), fromB(b))
}
