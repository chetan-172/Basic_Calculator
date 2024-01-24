
class Calculator extends Calculator1 {
    /**
     * The function "addition" takes two float numbers as input and returns their sum.
     * 
     * @param num1 A float variable representing the first number to be added.
     * @param num2 The parameter "num2" is a float type variable that represents the second number to
     * be added in the addition function.
     * @return The sum of num1 and num2.
     */
    float addition (float num1,float num2){
        return(num1+num2);
    }
    /**
     * The above function performs subtraction of two floating-point numbers.
     * 
     * @param num1 The first number to be subtracted.
     * @param num2 The second number to be subtracted from the first number.
     * @return the sum of num1 and num2.
     */
    
    float substraction (float num1,float num2){
        return(num1-num2);
    }
  /**
   * The function takes two float numbers as input and returns their sum.
   * 
   * @param num1 The first number to be multiplied. It is of type float.
   * @param num2 The second floating-point number to be multiplied.
   * @return The sum of num1 and num2 is being returned.
   */
    float multiplication (float num1,float num2){
        return(num1*num2);
    }

   /**
    * The function "division" takes two float numbers as input and returns their division.
    * 
    * @param num1 A floating-point number representing the numerator of the division operation.
    * @param num2 The second number to be divided.
    * @return the result of dividing `num1` by `num2`.
    */
    float division (float num1,float num2){
        return(num1/num2);
    }


// The code is defining a `main` method which serves as the entry point for the Java program.
// The code `public static void main(String []args){}` is the main method in Java. It serves as the
// entry point for the Java program. When the program is executed, the code inside the main method is
// executed.
public static void main(String []args){
    Calculator calc=new Calculator();
    
    
    float num1=5;
    float num2=10;

// The code is performing various mathematical operations using the Calculator class.
    float add=calc.addition(num1,num2);
    System.out.println("Addition:"+add);

    float sub=calc.substraction(num1,num2);
    System.out.println("Substraction:"+sub);

    float mul=calc.multiplication(num1,num2);
    System.out.println("Multiplication:"+mul);

    float div=calc.division(num1,num2);
    System.out.println("Division:"+div);

    float sqr=calc.square1(num1);
    System.out.println("Square:"+sqr);

    float cub=calc.cube1(num1);
    System.out.println("Cube:"+cub);

    float mod=calc.module1(num1,num2);
    System.out.println("module:"+mod);


}
}