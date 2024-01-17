/**
 * The calculator class performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division.
 */
/**
 * The calculator class performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division.
 */
class Calculator{
/**
 * The function "addition" takes two float parameters and returns their sum.
 * 
 * @param p1 The first parameter is p1, which is a float data type.
 * @param p2 The parameter p2 is a float data type.
 * @return The sum of p1 and p2.
 */
    float addition(float p1,float p2)
    {
        return(p1+p2);
    }
    /**
     * The function "substraction" takes two float parameters and returns their difference.
     * 
     * @param p1 The first parameter, p1, is a float value representing the first number in the
     * subtraction operation.
     * @param p2 The parameter p2 is a float value that represents the second number to be subtracted
     * from the first number.
     * @return the result of subtracting p2 from p1.
     */
     float substraction(float p1,float p2)
    {
        return(p1-p2);
    }
    /**
     * The function takes two float numbers as parameters and returns their multiplication.
     * 
     * @param p1 The first parameter is p1, which is a float data type.
     * @param p2 The parameter p2 is a float data type.
     * @return the product of the two input parameters, p1 and p2.
     */
     
     
     float multiplication(float p1,float p2)
    {
        return(p1*p2);
    }
    /**
     * The function division takes two float parameters and returns their division.
     * 
     * @param p1 The first parameter, p1, is a float value representing the numerator of the division
     * operation.
     * @param p2 The parameter p2 is the divisor in the division operation. It is the number that
     * divides the dividend (p1) to obtain the quotient.
     * @return the result of dividing p1 by p2.
     */
     float division(float p1,float p2)
    {
        return(p1/p2);
    }

     public static void main(String[] args)
     {
        // The code is creating an instance of the `calculator` class called `cal`. It then assigns the
        // values 20 and 30 to the variables `p1` and `p2` respectively.
        Calculator cal=new Calculator();

        float p1=20;
        float p2=30;

        float add=cal.addition(p1,p2);
        System.out.println("result:"+add);

        float sub=cal.substraction(p1,p2);
        System.out.println("result:"+sub);

        float mul=cal.multiplication(p1,p2);
        System.out.println("result:"+mul);

        float div=cal.division(p1,p2);
        System.out.println("result:"+div);
     }
}