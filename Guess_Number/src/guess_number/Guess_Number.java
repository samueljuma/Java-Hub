
package guess_number;

import java.util.Scanner;

/**
 *
 * @author SamJay
 */

public class Guess_Number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Guess a number");
        int number = in.nextInt();
        if (number == 7){
            System.out.println("You guessed right");
        }else{
            System.out.println("Wrong guess");
        }
    }
    
}
