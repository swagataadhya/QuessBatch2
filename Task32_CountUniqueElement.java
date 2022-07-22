//Task 32 : JAVA program to count a total number of unique elements in an array.

import java.util.Arrays;
import java.util.Scanner;
public class Task32_CountUniqueElement {
    public static void main(String[] args) {
        int n;
        int count=1;
        int temp;
        System.out.print("Enter Elements Number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        char arr[]=new char[n];
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        Arrays.sort(arr);
        temp=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=temp)
            {
                temp=arr[i];
                count++;
            }
        }
        System.out.print("Unique Elements are: "+count);
    }
}
