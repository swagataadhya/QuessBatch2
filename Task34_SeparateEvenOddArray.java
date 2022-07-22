//Task 34 :  JAVA program to input n number of elements in an array and separate them into even and odd two different arrays.

import java.util.Scanner;
public class Task34_SeparateEvenOddArray {
    public static void main(String[] args)
    {
        int n,temp,oodpoint=0,evepoint=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number Of Elements:");
        n=sc.nextInt();
        int odd[]=new int[n];
        int eve[]=new int[n];
        for(int i=0;i<n;i++)
        {
            temp=sc.nextInt();
            if(temp%2==0)
            {
                eve[evepoint]=temp;
                evepoint++;
            }
            else{
                odd[oodpoint]=temp;
                oodpoint++;
            }
        }
        System.out.print("Oddnumbers:");
        for(int i=0;i<oodpoint;i++)
        {
            System.out.print(odd[i]+" ");
        }
        System.out.println("");
        System.out.print("Evennumbers: ");
        for(int i=0;i<evepoint;i++)
        {
            System.out.print(eve[i]+" ");
        }
    }
}
