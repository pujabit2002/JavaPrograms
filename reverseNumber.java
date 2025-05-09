/*Reverse a Number
Problem Statement: Write a program to reverse a given number.
Sample Input: 123
Sample Output: 321
Explanation: The program extracts digits of a number (using % and / operators) and constructs the reversed number. It introduces number manipulation */
public class reverseNumber {
    public static void main(String[] args){
        int num=123;
        int rev=0;
        int rem;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("reverse number is:" + rev);

    }
}
