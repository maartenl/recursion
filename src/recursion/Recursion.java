/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.math.BigDecimal;

/**
 * An example of recursion.
 *
 * @author mrbear
 */
public class Recursion
{

    /**
     * Computes the factorial of a number n.
     *
     * @param n
     * @return n!
     */
    public static BigDecimal factorial(BigDecimal n)
    {
        if (BigDecimal.ZERO.equals(n))
        {
            return BigDecimal.ONE;
        }
        return n.multiply(factorial(n.subtract(BigDecimal.ONE)));
    }

    /**
     * Main method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.out.println("java -cp . Recursion <non-negative integer to compute the factorial of>");
            System.exit(1);
        }
        BigDecimal entry = new BigDecimal(args[0]);
        System.out.println(factorial(entry));
    }

}
