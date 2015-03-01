package com.bryghts.numerics
package impl

class PolyNumericFromIntegral[A, B, RR](
                 protected val fromA: A => RR,
                 protected val fromB: B => RR,
                 protected val num:   Integral[RR])                extends PolyNumericFromNumeric[A, B, RR]
                                                                     with IntegralPolyNumeric[A, B]
{
    def div     (a: A, b: B): R   = num.quot     (fromA(a), fromB(b))
    def rem     (a: A, b: B): R   = num.rem      (fromA(a), fromB(b))


    override def numeric = num
}
