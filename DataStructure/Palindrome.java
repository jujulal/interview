package DataStructure;

import java.util.Arrays;

/**
 * Created by Bibek on 3/20/2018.
 *
 * Write a program that takes an integer and determindes if that integer's representation as decimal string is palindrom.
 * And also write method that takes String and determines that is palindrome or not?
 */
public class Palindrome {

    /* This isPalindrome(int) method will findout a given number is Palindrome or NOT, without using String functions. */
    public boolean isPalindrome(int inputNumber){
        inputNumber = Math.abs(inputNumber);
        int numDigits = (int)(Math.floor(Math.log10(inputNumber)))+1;
        int revDigits =0;
        for(int i=1, j=numDigits; i<=numDigits; i++, j--){
            revDigits += (int)((inputNumber%(Math.pow(10,i))) / (Math.pow(10,i-1))) * Math.pow(10,j-1);
        }
        System.out.println("Reverse digit: " + revDigits);
        return inputNumber == revDigits ? true : false;
    }
    public boolean isPalindrome(String inputText){
        char[] revText = new char[inputText.length()];
        char[] arrInputText = inputText.toCharArray();
        for(int i =arrInputText.length-1, j=0; i>=0; i--, j++){
            revText[j] = arrInputText[i];
        }
        String revString = new String(revText);
        System.out.println("Reverse string: " + revString);
        if(revString.equals(inputText))
            return true;
        else
        return false;
    }

    public static void main(String args[]){
        int x = -114;
        String s = "abcba";
        Palindrome palindrome = new Palindrome();
        System.out.println("Input number: " + x);
        System.out.println("Palindrome: " + palindrome.isPalindrome(x));

        System.out.println("Input String: "+ s);
        System.out.println("Palindrome: " + palindrome.isPalindrome(s));
    }
}
