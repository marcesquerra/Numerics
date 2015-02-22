package com.bryghts.numerics

trait PolyNumeric[A, B, R] {

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

}

trait IntegralPolyNumeric[A, B, R] extends PolyNumeric[A, B, R] {

    def rem    (x: A, y: B): R

}

trait FractionalPolyNumeric[A, B, R] extends PolyNumeric[A, B, R] {

}

object PolyNumeric {


    object Fractional {

        def apply[A, B, R](
                              fromA: A => R,
                              fromB: B => R)(
                     implicit num:   Fractional[R]): FractionalPolyNumeric[A, B, R] =
            new impl.PolyNumericFromFractional[A, B, R](fromA, fromB, num)

        def forBothDirections[X, Y, R](
                              fromX: X => R,
                              fromY: Y => R)(
                     implicit num:   Fractional[R]): (FractionalPolyNumeric[X, Y, R], FractionalPolyNumeric[Y, X, R]) =
            (apply(fromX, fromY), apply(fromY, fromX))

        def forBothDirections[K, D](
                              fromD: D => K)(
                     implicit num:   Fractional[K]): (FractionalPolyNumeric[K, D, K], FractionalPolyNumeric[D, K, K]) =
            forBothDirections((k: K) => k, fromD)

    }

    object Integral {

        def apply[A, B, R](
                              fromA: A => R,
                              fromB: B => R)(
                     implicit num:   Integral[R]): IntegralPolyNumeric[A, B, R] =
            new impl.PolyNumericFromIntegral[A, B, R](fromA, fromB, num)


        def forBothDirections[X, Y, R](
                                          fromX: X => R,
                                          fromY: Y => R)(
                                          implicit num:   Integral[R]): (IntegralPolyNumeric[X, Y, R], IntegralPolyNumeric[Y, X, R]) =
            (apply(fromX, fromY), apply(fromY, fromX))

        def forBothDirections[K, D](
                                       fromD: D => K)(
                                       implicit num:   Integral[K]): (IntegralPolyNumeric[K, D, K], IntegralPolyNumeric[D, K, K]) =
            forBothDirections((k: K) => k, fromD)

    }

}



