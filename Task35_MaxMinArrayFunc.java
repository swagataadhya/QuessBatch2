//Task 35 : JAVA program to find maximum and minimum number from given array by passing array to the function.

import java.util.Scanner;
public class Task35_MaxMinArrayFunc {
    public static void minMax(int arr[])
    {
        int min=999,max=0;
        for(int x:arr)
        {
            if(x>max)
            {
                max=x;
            }

            if(x<min)
            {
                min=x;
            }
        }

        System.out.println("Maximum number "+max);
        System.out.println("Minimum number "+min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter The Number Of Element: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        minMax(arr);
    }
}
