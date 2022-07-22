//Task 27 : Find the table of given number using recursion

import java.util.Scanner;
public class Task27_TableRecursion {
    public static int table(int n,int r,int i)
    {
        if(i<=r)
        {
            System.out.println(n+" X "+i+" = "+(n*i));
            i++;
            table(n,r,i);
        }
        else
        {
            return 0;
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("Enter the range: ");
        int r=sc.nextInt();
        table(n,r,1);
        System.out.print("Thank You");
    }
}
