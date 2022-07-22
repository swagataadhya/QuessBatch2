//Task 30 : Write a program in to find the sum and average of all elements of the array.

import java.util.ArrayList;
import java.util.Scanner;

public class Task30_SumAverageOfArray {
    public static void normal()
    {
        int arr[];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element numbers: ");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        float avg=0;
        for(int ele:arr)
        {
            sum+=ele;
        }
        avg=(float) sum/arr.length;
        System.out.println("Sum Is: "+sum);
        System.out.println("Avg Is: "+avg);
    }

    public static void advance()
    {
        char c='y';
        int x;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        ArrayList list=new ArrayList<>();

        do {
            System.out.print("Enter element: ");
            x=sc.nextInt();
            list.add(x);
            System.out.println("You want to enter y/n");
            c=sc.next().charAt(0);
        }while (c=='y');

        for(int i=0;i<list.size();i++)
        {
            sum+=(int)list.get(i);
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Avarage: "+(float)sum/list.size());

    }
    public static void main(String[] args) {
        normal();
        //advance();
    }
}
