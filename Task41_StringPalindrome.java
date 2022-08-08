//Task 41 : Write a program check given String is Palindrome or not

import java.util.*;
public class Task41_StringPalindrome {
    public static void main(String []args){
        String data1,data2="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word to check if it is Palindrome or not: ");
        data1=sc.next();
        for(int i=data1.length()-1;i>=0;i--)
        {
            data2=data2+(data1.charAt(i));
        }
        if(data1.equals(data2))
        {
            System.out.print("\u001B[32m"+"Palindrome");
        }
        else{
            System.out.print("\u001B[31m"+"Not Palindrome");
        }
    }
}
