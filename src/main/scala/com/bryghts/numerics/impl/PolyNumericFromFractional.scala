package com.bryghts.numerics
package impl


class PolyNumericFromFractional[A, B, RR](
                 protected val fromA: A => RR,
                 protected val fromB: B => RR,
                 protected val num:   Fractional[RR])                           extends PolyNumericFromNumeric[A, B, RR]
                                                                                  with FractionalPolyNumeric[A, B]
{
    def div     (a: A, b: B): R   = num.div     (fromA(a), fromB(b))

    override def numeric = num
}
