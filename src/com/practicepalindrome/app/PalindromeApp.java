package com.practicepalindrome.app;

import com.practicepalindrome.model.PalindromeOperations;

import java.util.Scanner;

public class PalindromeApp
{
    public static void main(String[] args)
    {
        //Variable declaration
        String cad = "ana";
        String message = "";
        boolean isPalindrome = false;
        char response = 'y';

        //Object declaration
        Scanner in = new Scanner(System.in);
        PalindromeOperations palindromeOp = new PalindromeOperations();

        //Input word
        do
        {
            System.out.println("Write a word to know if it is palindrome: ");
            cad = in.next().toLowerCase();

            //Implement function CompareWords
            palindromeOp.setCad(cad);
            isPalindrome = palindromeOp.CompareWords(palindromeOp.getCad());

            //Validate if is palindrome
            if(isPalindrome)
            {
                message = " is palindrome!!!";
            }
            else
            {
                message = " not is palindrome";
            }

            //Output result
            System.out.println(cad + message);

            //User response
            System.out.println("Do you want to write another word (y/n)?");
            response = in.next().charAt(0);

        }while(response == 'y');

        //Close input
        in.close();
    }
}
