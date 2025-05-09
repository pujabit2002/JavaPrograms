/*Palindrome Number
Problem Statement: Write a program to check if a given number is a palindrome.
Sample Input: 121
Sample Output: Palindrome
Explanation: A palindrome number reads the same forwards and backwards. The program reverses the number and compares it with the original */
public class pallindroneNumber {
    public static void main (String[] args){
        int num=197;
        int temp=num;
        int rev=0;
        int rem;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(num==rev){
               System.out.println("The number is pallindrone number:" +num);
        }
        else{
            System.out.println("The number is not pallindrone number:" + num);
        }

    }
}
