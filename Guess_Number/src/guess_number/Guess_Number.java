
package guess_number;

import java.util.Scanner;

/**
 *
 * @author SamJay
 */

public class Guess_Number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Guess a number:");
        int number = in.nextInt();
        while (number != 0){
        if (number == 7){
            System.out.println("You guessed right");
            return;
        }else{
            System.out.println("Wrong guess,(Enter 0 to exit). Try again:");
            number =in.nextInt();
        }
    }}
    
}
