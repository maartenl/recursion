/*
 * Copyright (C) 2014 maartenl
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package recursion;

import java.math.BigDecimal;

/**
 * An example of tail recursion.
 *
 * @author maartenl
 */
public class TailRecursion
{

    /**
     * Computes the factorial of a number n.
     *
     * @param n
     * @return n!
     */
    public static BigDecimal factorial(BigDecimal n)
    {

        return factorial(BigDecimal.ONE, n);
    }

    /**
     * Computes the factorial of a number n with an accumulator.
     *
     * @param n
     * @return n!
     */
    private static BigDecimal factorial(BigDecimal accumulator, BigDecimal n)
    {
        if (BigDecimal.ZERO.equals(n))
        {
            return BigDecimal.ONE;
        }
        return factorial(accumulator.multiply(n), n.subtract(BigDecimal.ONE));
    }

}
