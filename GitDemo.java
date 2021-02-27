/*****
 * Jennifer Lemley
 ******/
public class GitDemo {
    
    private double reverseNum;
    private double previousNumber;
    
    public GitDemo() {
        previousNumber = 1;
    }
    
    /*****
     * This function should add 'num' to 'previousNumber' and return the sum.
    *****/
    public double addNumber(double num) {
        sum = num + previousNumber; // added for part b.i.
        System.out.print("Add num to previousNumber");
        return 0;
    }
    
    /*****
     * This function should calculate the factorial of 'num' and return the resulting value.
     * i.e. if num = 4,
     *  the function will return the value of (1 * 2 * 3 * 4)
     *****/
    public double findFactorial(int num) {
double newNumber = 1;
        
        for(int i = 1; i <= num; ++i){
            newNumber = newNumber * i;
        }
        reverseNum = newNumber; //added for part c.ii.
        return newNumber;
    }
    }
    
    /*****
     * This function should reverse 'num' and return the resulting value.
     * i.e. if num = 1234
     *  the function will return 4321
     *****/
    public double reverseNumber(int num){
        double factorialNumber = 0;
        
        while( num != 0 ) {
            double temp = num % 10;
            factorialNumber = factorialNumber * 10 + temp;
            num /= 10;
        }
        
        return factorialNumber;
    
}
