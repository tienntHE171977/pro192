/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot4;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String origin, replaced, replacement;
        System.out.print("Enter original String:");
        origin= sc.nextLine();
        System.out.print("Enter replaced string:");
        replaced= sc.nextLine();
        System.out.print("Enter replacing string:");
        replacement= sc.nextLine();
        origin = origin.replaceAll(replaced, replacement);
        System.out.println("After replacing:" +origin);
        System.out.println("Uppercase:"+ origin.toUpperCase());
        System.out.println("Origin:"+ origin);
        System.out.print("Enter the index of extracted character:");
        int index= Integer.parseInt(sc.nextLine());
        System.out.format("The %d(th)character:%c\n", index, origin.charAt(index));
    }
    
}
