package com.bryghts.numerics
package impl


class PolyNumericFromFractional[A, B, R](
                 protected val fromA: A => R,
                 protected val fromB: B => R,
                 protected val num:   Fractional[R])                           extends PolyNumericFromNumeric[A, B, R]
                                                                                  with FractionalPolyNumeric[A, B, R]
{
    def div     (a: A, b: B): R   = num.div     (fromA(a), fromB(b))

    override def numeric = num
}
