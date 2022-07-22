//Task 31 : Write a java program to sort the given names.

import java.util.Scanner;

public class Task31_SortingNames {
    public static void main(String[] args) {
        int n;
        String arr[];
        String temp="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of names: ");
        n=sc.nextInt();
        arr=new String[n];
        System.out.println("Enter Names: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.next();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1;j++)
            {
                if (arr[j].compareTo(arr[j+1])>0)
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(String s:arr)
        {
            System.out.println(s);
        }

        }
    }





