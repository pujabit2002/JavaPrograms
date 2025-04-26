/*Problem Statement: Write a program to calculate simple interest given principal, rate, and time.
Sample Input: 1000 5 2
Sample Output: 100
Explanation: The formula for simple interest is (P * R * T) / 100. The program takes three inputs and computes the result, introducing basic mathematical operations. */
public class SimpleInterest {
    public static void main(String[] args){
        float P=1000;
        float R=5;
        float T=2;
        float SI =(P*R*T)/100;
        System.out.println(SI);
    }
}
