
package automaticdocumentgeneration;

import java.util.Scanner;

/**
 * <h1> Count Number of Characters in a String!</h1>
 * The program counts the number of characters and displays the result on the screen
 * <p><b>Note: </b>It is also a sample of how to automatically generate java documentation in HTML</>
 * @author Java_Pro
 * @version 1.1
 */
public class AutomaticDocumentGeneration {
    
    /**
    * This is the main method. It is where the program begins
    * it makes use of the countString method
    * @param args Unused.
    * @see Scanner Class
    */

    public static void main(String[] args){
        System.out.println("\n\nCount the total number of words in a string: \n");
        System.out.println("------------------------------------------\n");
        System.out.println("Input the String: ");
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        System.out.println("Total number of words in the String is: " +countString (input));
    }
    
    /**
     * This method is used to iterate through the string while 
     * counting the number of characters in the string
     * @param word This is the parameter used as input for the method
     * @return int This returns the number of characters in the string input
     * @see <a href="https://www.javatpoint.com/java-for-loop">Loops in Java </a>
     * @exception IndexOutOfBoundsException On Index out of bounds 
     */

    public static int countString(String word) {
        int counter = 0;
        
        /* loop till end of String */
        for(int i = 0; i < word.length(); i++){
            
            /* skip the space */
            if(word.charAt(i) != ' '){
                counter ++;
            }
        }
        return counter;
    }
    
}
