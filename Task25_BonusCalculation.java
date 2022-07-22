//Task 25 :
//Write a Java program for bonus calculation. Accept basic salary from user. Calculate TA = 10%, DA= 15%, HRA = 20%, PF= 12% of basic salary. If basic >= 20,000 then give 10% bonus otherwise give 20% bonus on basic salary. Calculate his gross (final) salary ( gross salary = Basic + DA + TA + HRA + Bonus – PF)

import java.util.Scanner;
public class Task25_BonusCalculation {
    public static void main(String[] args) {
        int basicsalary;
        int ta,da,hra,pf,bonus=0,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Basic Salary: ");
        basicsalary=sc.nextInt();
        ta=(basicsalary*10)/100;
        da=(basicsalary*15)/100;
        hra=(basicsalary*20)/100;
        pf=(basicsalary*12)/100;

        if(basicsalary>=20000)
        {
            bonus=(basicsalary*10)/100;
        }
        else{
            bonus=(basicsalary*20)/100;
        }

        result=(basicsalary+da+ta+hra+bonus-pf);
        System.out.println("TA: "+ta);
        System.out.println("DA: "+da);
        System.out.println("HRA: "+hra);
        System.out.println("PF: "+pf);
        System.out.println("Bonus: "+bonus);
        System.out.println("Gross salary: "+result);
    }
}
