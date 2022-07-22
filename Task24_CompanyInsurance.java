//Task 24 :
//Write a Java program for Company Insurance Policy. A company insure its driver under the following conditions
//If driver is married
//If driver is unmarried male and age above 30
//If driver is unmarried female and age above 25
import java.util.Scanner;
public class Task24_CompanyInsurance {
    public static void main(String[] args) {
        int age;
        char gender,ismarried;
        Scanner sc=new Scanner(System.in);
        System.out.println("Married or not? Ans in: y for yes/n for no: ");
        ismarried=sc.nextLine().charAt(0);
        if(ismarried=='y')
        {
            System.out.println("Driver will get insurance!");
        }
        else
        {
            System.out.println("Enter Driver's Gender ans in: m for male/f for female: ");
            gender=sc.next().charAt(0);
            System.out.println("Enter Age: ");
            age=sc.nextInt();
            switch (gender)
            {
                case 'm':
                    if(age>30)
                        System.out.println("Driver will get insurance!");
                    else
                        System.out.println("Driver will not get insurance!");
                    break;
                case 'f':
                    if(age>25)
                        System.out.println("Driver will get insurance!");
                    else
                        System.out.println("Driver will not get insurance!");
                    break;
                    default:
                        System.out.println("Enter Valid gender");
            }
        }
    }
}
