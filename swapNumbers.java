/**Swap Two Numbers
Problem Statement: Write a program to swap two numbers without using a third variable.
Sample Input: 10 20
Sample Output: 20 10
Explanation: The program swaps two numbers using arithmetic operations (e.g., a = a + b, b = a - b, a = a - b). It teaches variable manipulation.**/
public class swapNumbers {
    public static void main(String[] args){
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
