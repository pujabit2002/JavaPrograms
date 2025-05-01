/**Check Leap Year
Problem Statement: Write a program to check if a given year is a leap year.
Sample Input: 2020
Sample Output: Leap Year
Explanation: A year is a leap year if it is divisible by 4 but not by 100, or divisible by 400. The program uses logical operators and conditional */
public class CheckLeapYear {
    public static void main(String[] args) {
        int x=-2100;
        if(x%4==0 && x%100!=0){
            System.out.println("leap year");
        }
        else if(x%400==0 ){
            System.out.println("leap year");
            
        }
        else{
            System.out.println("Not leap year");
        }
        
    }
    
}
