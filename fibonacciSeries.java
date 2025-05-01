/**Fibonacci Series
Problem Statement: Write a program to print the Fibonacci series up to n terms.
Sample Input: 6
Sample Output: 0 1 1 2 3 5
Explanation: The Fibonacci series starts with 0 and 1, and each subsequent number is the sum of the previous two. The program uses loops to generate the series.**/
public class fibonacciSeries {
    public static void main(String[] args) {
        int a =0;
        int b=1;
        int c;
        for(int i=0; i<=6; i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }

}
