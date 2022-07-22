//Task 28 : Find the sum of 1 to n numbers using recursion.

import java.util.Scanner;
public class Task28_SumOfNumUsingRecursion {
    public static int sum(int n,int res)
    {
        int sum=res+n;
        int rem=n-1;
        if(rem==1)
        {
            return (sum+1);
        }
        else
        {
            return sum(rem,sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        System.out.print(sum(n,0));
    }
}
