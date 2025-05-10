/*Check Vowel or Consonant
Problem Statement: Write a program to check if a given character is a vowel or consonant.
Sample Input: a
Sample Output: Vowel
Explanation: The program checks if the input character is one of 'a', 'e', 'i', 'o', 'u' (case-insensitive). It introduces character handling and conditionals */
public class chekVowelOrConstant {
    public static void main(String[] args){
        char x='a';
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
            System.out.println("Vowel number");
        }
        else{
            System.out.println("Constant number");
        }

    }
}
