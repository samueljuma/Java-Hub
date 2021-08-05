
package javaoutputformatting;

import java.util.Scanner;

/**
 *
 * @author SamJay
 */
public class JavaOutputFormatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15.15s%03d\n", s1, x);
            }
            System.out.println("================================");
    }
    
}





