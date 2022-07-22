//Task 29 :
//Write a Java program to print following alphabet pattern
//A B C D E
//B C D E
//C D E
//D E
//E
import java.util.Scanner;
public class Task29_AlphabetPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        char out='A';
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print((char)(out+j)+" ");
            }
            System.out.println("");
        }

    }
}
