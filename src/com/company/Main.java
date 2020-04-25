package com.company;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = "";
            while (!input.equals("exit")) {
                System.out.print("Type a sentence/word to check: ");
                input = reader.readLine();
                input = input.replaceAll("\\s+", "")
                        .replaceAll("\\p{Punct}", "")
                        .toLowerCase();
                if (isPalindrome(input)) {
                    System.out.print("Palindrome\n");
                } else System.out.print("Not palindrome\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    static boolean isPalindrome(String input) {
        int a = 0, z = input.length() - 1;
        while (z > a) {
            if (input.charAt(a) != input.charAt(z)) {
                return false;
            }
            z--;
            a++;
        }
        return true;
    }
    
}
