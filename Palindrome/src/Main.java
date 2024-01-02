import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Print Program Desc
        System.out.println("""
                =====================================================
                                       PALINDROME
                =====================================================
                The program checks whether the input from the user
                is a palindrome prints the response back to the user
                """);


        //Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String userInput = scanner.nextLine();

        //Show User What they entered
        System.out.println("Your entered: " + userInput);

        //Tell user if the String they entered is a Palindrome
        displayResult(userInput,isPalindrome_1(userInput));
    }

     static boolean isPalindrome(String input){

         StringBuilder reverse = new StringBuilder();

         for(int i =input.length()-1;i>=0;i--){
             reverse.append(input.charAt(i));
         }

         //Returns true or false
         return reverse.toString().equals(input);

    }

    static boolean isPalindrome_1(String input){

        String reverseString = new StringBuilder(input).reverse().toString();

        //Returns true or false
        return reverseString.equals(input);

    }

    static void displayResult(String input, boolean isPalindrome){

        if(isPalindrome){
            System.out.printf("\n%s is a PALINDROME\n",input);
        }else {
            System.out.printf("\n%s is a NOT PALINDROME\n",input);
        }
    }

}