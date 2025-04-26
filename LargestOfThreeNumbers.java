/**Find Largest of Three Numbers
Problem Statement: Write a program to find the largest among three input numbers.
Sample Input: 7 12 9
Sample Output: 12
Explanation: The program compares three numbers using conditional statements to determine the largest. It reinforces the use of if-else or nested conditions */
public class LargestOfThreeNumbers {
    public static void main(String[] args){
        int x=7;
        int y=12;
        int z=9;
        if(x>y && x>z){
            System.out.println(x);
        }
        else if(y>z && y>x){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }
    }
}
