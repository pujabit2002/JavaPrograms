/**Factorial of a Number
Problem Statement: Write a program to calculate the factorial of a given number.
Sample Input: 5
Sample Output: 120
Explanation: Factorial of n is n * (n-1) * ... * 1. The program introduces loops (for or while) to compute the product iteratively**/



public class FactorialOfNumber {
    public static void main (String[] args){
        int n =5;
        int fact=1;
        for(int i=1; i<=n; ++i){
            fact=fact*i;
        }
        System.out.println(fact);

    }
}
