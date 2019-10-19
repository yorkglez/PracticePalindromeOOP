package com.practicepalindrome.model;

public class PalindromeOperations {
    //Atributes declaration
    private String cad;

    //Constructor
    public void  PalindromeOperations(){}

    public void PalindromeOperations(String cad, String reverseCad)
    {
        this.cad = cad;
    }

    //Compare string input with reverse string
    public Boolean CompareWords(String cad)
    {
        String reverseCad = "";
        boolean isPalindrome = false;

        for(int i = cad.length()-1; i >= 0; i--)
        {
            reverseCad = reverseCad + cad.charAt(i);
        }

        return cad.equals(reverseCad);
    }

    //Setters and Getters
    public void setCad(String cad)
    {
        this.cad = cad;
    }

    public String getCad()
    {
        return this.cad;
    }
}
