package com.bryghts.numerics
package impl


trait PolyNumericFromNumeric[A, B, R] extends PolyNumeric[A, B, R] {

    protected val num: scala.Numeric[R]

    protected val fromA: A => R
    protected val fromB: B => R

    def zero = num.zero
    def one  = num.one

    def plus    (a: A, b: B): R   = num.plus    (fromA(a), fromB(b))
    def minus   (a: A, b: B): R   = num.minus   (fromA(a), fromB(b))
    def times   (a: A, b: B): R   = num.times   (fromA(a), fromB(b))
    def compare (a: A, b: B): Int = num.compare (fromA(a), fromB(b))

    def max     (a: A, b: B): R   = if (gteq(a, b)) fromA(a) else fromB(b)
    def min     (a: A, b: B): R   = if (lteq(a, b)) fromA(a) else fromB(b)
}
