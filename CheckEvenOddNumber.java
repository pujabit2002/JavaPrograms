/**Check Even or Odd
Problem Statement: Write a program to check if a given number is even or odd.
Sample Input: 4
Sample Output: Even
Explanation: The program uses the modulo operator (%) to determine if a number is divisible by 2. It introduces conditional statements (if-else)**/
public class CheckEvenOddNumber {
    public static void main (String[] args){
        int x=7;
        if(x%2==0){
            System.out.println("The number is even number");
        }
        else{
            System.out.println("The number is odd number");
        }
    }
}
