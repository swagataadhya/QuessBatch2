//Task 42 : Accept string and count the number of alphabets, digits, spaces, special characters & words in the given string.

import java.util.Scanner;
public class Task42_StringCount {
    public static void main(String[] args) {
        String data;
        Scanner sc=new Scanner(System.in);
        int alpha=0,digits=0,sp=0,spchr=0,word=1;
        System.out.print("Enter Data: ");
        data=sc.nextLine();
        for(int i=0;i<data.length();i++)
        {
            if((data.charAt(i)>='a'&&data.charAt(i)<='z')||(data.charAt(i)>='A'&&data.charAt(i)<='Z'))
            {
                alpha++;
            }
            if((data.charAt(i)>='0'&&data.charAt(i)<='9'))
            {
                digits++;
            }
            if(data.charAt(i)==' ')
            {
                sp++;
            }
            if((data.charAt(i)>='!'&&data.charAt(i)<='/')||(data.charAt(i)>=':'&&data.charAt(i)<='@'))
            {
                spchr++;
            }
        }
        System.out.println("Alphabets: "+alpha);
        System.out.println("Digits: "+digits);
        System.out.println("Spaces: "+sp);
        System.out.println("Special chars: "+spchr);
        System.out.println("Word: "+(word+sp));

    }
}
