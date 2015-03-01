package com.bryghts.numerics

trait PolyNumeric[A, B] {

    type R

    def plus  (a: A, b: B): R
    def minus (x: A, y: B): R
    def times (x: A, y: B): R
    def div   (x: A, y: B): R

    def compare(x: A, y: B): Int
    def lteq   (x: A, y: B): Boolean = compare(x, y) <= 0
    def gteq   (x: A, y: B): Boolean = compare(x, y) >= 0
    def lt     (x: A, y: B): Boolean = compare(x, y) < 0
    def gt     (x: A, y: B): Boolean = compare(x, y) > 0

    def max    (x: A, y: B): R
    def min    (x: A, y: B): R

    def numeric:Numeric[R]
}

trait IntegralPolyNumeric[A, B] extends PolyNumeric[A, B] {

    def rem    (x: A, y: B): R
    override def numeric:Integral[R]

}

trait FractionalPolyNumeric[A, B] extends PolyNumeric[A, B] {
    override def numeric:Fractional[R]
}

object PolyNumeric {


    object Fractional {

        def apply[A, B, R](
                              fromA: A => R,
                              fromB: B => R)(
                     implicit num:   Fractional[R]): FractionalPolyNumeric[A, B] =
            new impl.PolyNumericFromFractional[A, B, R](fromA, fromB, num)

        def forBothDirections[X, Y, R](
                              fromX: X => R,
                              fromY: Y => R)(
                     implicit num:   Fractional[R]): (FractionalPolyNumeric[X, Y], FractionalPolyNumeric[Y, X]) =
            (apply(fromX, fromY), apply(fromY, fromX))

        def forBothDirections[K, D](
                              fromD: D => K)(
                     implicit num:   Fractional[K]): (FractionalPolyNumeric[K, D], FractionalPolyNumeric[D, K]) =
            forBothDirections((k: K) => k, fromD)

    }

    object Integral {

        def apply[A, B, R](
                              fromA: A => R,
                              fromB: B => R)(
                     implicit num:   Integral[R]): IntegralPolyNumeric[A, B] =
            new impl.PolyNumericFromIntegral[A, B, R](fromA, fromB, num)


        def forBothDirections[X, Y, R](
                                          fromX: X => R,
                                          fromY: Y => R)(
                                          implicit num:   Integral[R]): (IntegralPolyNumeric[X, Y], IntegralPolyNumeric[Y, X]) =
            (apply(fromX, fromY), apply(fromY, fromX))

        def forBothDirections[K, D](
                                       fromD: D => K)(
                                       implicit num:   Integral[K]): (IntegralPolyNumeric[K, D], IntegralPolyNumeric[D, K]) =
            forBothDirections((k: K) => k, fromD)

    }

}



