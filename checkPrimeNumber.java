/**Check Prime Number
Problem Statement: Write a program to check if a given number is prime.
Sample Input: 17
Sample Output: Prime
Explanation: A prime number is divisible only by 1 and itself. The program uses a loop to check divisibility up to the square root of the number.**/
public class checkPrimeNumber {
    public static void main(String[] args) {
        int n=7;
        int temp =0;
                for (int i=2; i<=n-1; i++){

                    if(n%2==0){

                        temp= temp+1;
                    }
        }
        if(temp>0){
            System.out.println("Not prime number");
        }
        else{
            System.out.println("Prime Number");
        }
    }
}
