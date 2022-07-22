//Task 33 :JAVA program to find the second largest element in an array.

import java.util.Scanner;
public class Task33_ScndLargestElmnt {
    public static void main(String[] args)
    {
        int n;
        int big=0,temp=0;
        boolean ctrl=false;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number Of Array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>arr[big])
            {
                big=i;
            }
        }
        temp=arr[big];
        arr[big]=0;
        big=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[big]&&temp!=arr[i])
            {
                big=i;
                ctrl=true;
            }
        }

        if(!ctrl)
        {
            System.out.println("No 2nd largest Number");
        }
        else
        {
            System.out.print("2nd largest Number Is: "+arr[big]);
        }
    }
}
