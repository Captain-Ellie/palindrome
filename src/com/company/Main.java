package com.company;
import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
        String input = "";
        while (!input.equals("exit")) {
            System.out.print("Type a sentence/word to check: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            input = reader.readLine();
            input = input.replaceAll("\\s+","");
            input = input.replaceAll("\\p{Punct}","");
            input = input.toLowerCase();
            if (isPalindrome(input)) {
                System.out.print("Palindrome\n");
            }else {
                System.out.print("Not palindrome\n");
            }
        }
    }

    static boolean isPalindrome(String input)
    {
        int a = 0, z = input.length() - 1;
        if (input.charAt(a) != input.charAt(z)) {
            return false;
        }

        return true;
    }
}