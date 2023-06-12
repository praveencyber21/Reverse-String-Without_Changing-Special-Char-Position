package ReverseString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Word: ");
        String word = sc.nextLine();

        System.out.println(Reverse.reverse(word));
        
        
    }
}
