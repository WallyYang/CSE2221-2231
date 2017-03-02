import components.naturalnumber.*;

public class HelpMethods2 {

    // Test cases for HelpMethods2
    public static void main(String[] args) {
        NaturalNumber num = new NaturalNumber2(15);

        System.out.println("num ^ 3 = " + power2(num, 3));
        System.out.println("num + 8 = " + add2(num, 8));
        System.out.println("num - 7 = " + minus2(num, 7));
        System.out.println("num * 2 = " + multiply2(num, 2));
        System.out.println("num / 4 = " + divide2(num, 4));
    }

    /**
     * Returns {@code n} to the power {@code p}.
     * 
     * @param n
     *            the number to which we want to apply the power
     * @param p
     *            the power
     * @return the number to the power
     * @requires Integer.MIN_VALUE <= n ^ (p) <= Integer.MAX_VALUE and p >= 0
     * @ensures power2 = n ^ (p)
     */
    private static NaturalNumber power2(NaturalNumber n, int p) {
        NaturalNumber ret = new NaturalNumber2(1);
        int count = 0;
        while (count < p) {
            ret.multiply(n);
            count++;
        }
        return ret;
    }

    /**
     * Returns {@code n1} add {@code n2}.
     * 
     * @param n1
     *            the number to which we want to apply the addition
     * @param n2
     *            the number to add
     * @return n1 + n2
     * @requires Integer.MIN_VALUE <= n1 + n2 <= Integer.MAX_VALUE
     * @ensures add2 = n1 + n2
     */
    private static NaturalNumber add2(NaturalNumber n1, int n2) {
        NaturalNumber ret = new NaturalNumber2(n1);
        NaturalNumber rhs = new NaturalNumber2(n2);
        ret.add(rhs);
        
        return ret;
    }

    /**
     * Returns {@code n1} minus {@code n2}.
     * 
     * @param n1
     *            the number to which we want to apply the subtraction
     * @param n2
     *            the number to subtract
     * @return n1 - n2
     * @requires Integer.MIN_VALUE <= n1 - n2 <= Integer.MAX_VALUE
     * @ensures minus2 = n1 - n2
     */
    private static NaturalNumber minus2(NaturalNumber n1, int n2) {
        NaturalNumber ret = new NaturalNumber2(n1);
        NaturalNumber rhs = new NaturalNumber2(n2);
        ret.subtract(rhs);
        return ret;
    }


    /**
     * Returns {@code n1} multiply {@code n2}.
     * 
     * @param n1
     *            the number to which we want to apply the multiplication
     * @param n2
     *            the number to multiply
     * @return n1 - n2
     * @requires Integer.MIN_VALUE <= n1 * n2 <= Integer.MAX_VALUE
     * @ensures multiply2 = n1 * n2
     */
    private static NaturalNumber multiply2(NaturalNumber n1, int n2) {
        NaturalNumber ret = new NaturalNumber2(n1);
        NaturalNumber rhs = new NaturalNumber2(n2);
        ret.multiply(rhs);
        return ret;
    }


    /**
     * Returns {@code n1} divide by {@code n2}.
     * 
     * @param n1
     *            the number to which we want to apply the division
     * @param n2
     *            the number to divide by
     * @return n1 - n2
     * @requires Integer.MIN_VALUE <= n1 / n2 <= Integer.MAX_VALUE
     * @ensures divide = n1 / n2
     */
    private static NaturalNumber divide2(NaturalNumber n1, int n2) {
        // int result = n1.toInt() / n2;
        NaturalNumber ret = new NaturalNumber2(n1);
        NaturalNumber nn2 = new NaturalNumber2(n2);
        // ret.copyFrom(new NaturalNumber2(result));
        ret.divide(nn2);
        return ret;
    }
   
}
