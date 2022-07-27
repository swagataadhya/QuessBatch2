//Weekend Task 2 : Create a NUMBER SYSTEM CONVERSION CALCULATOR.
//WeekendTask2_NumberSystemCalculator

import java.util.Scanner;
public class WeekendTask2_NumberSystemCalculator
{
    public static void main(String[] args) {
        boolean ctrl=true;
        Scanner sc=new Scanner(System.in);
        String temp;
        boolean isOkay,isExit;
        int ch,number;
        char c;
        do{
            System.out.println("\u001B[36m"+"----------------------------------------------------------");
            System.out.println("Type");
            System.out.println("1 for Binary conversion");
            System.out.println("2 for Octal conversion");
            System.out.println("3 for Decimal conversion");
            System.out.println("4 for Hexadecimal conversion");
            System.out.println("5 for Exit");
            System.out.println("----------------------------------------------------------");
            ch=sc.next().charAt(0);
            switch(ch)
            {
                case '1':
                    do {
                        isExit=false;
                        System.out.println("\u001B[35m"+"1 for Binary To Octal");
                        System.out.println("2 for Binary To Decimal");
                        System.out.println("3 for Binary To Hexadecimal");
                        System.out.println("4 For Exit");
                        ch=sc.next().charAt(0);
                        switch(ch)
                        {
                            case '1':
                                System.out.println("Enter Binary Number: ");
                                temp=sc.next();
                                isOkay=true;
                                for (int i=0;i<temp.length();i++)
                                {
                                    if(temp.charAt(i)!='1'&&temp.charAt(i)!='0') isOkay=false;
                                }
                                if(isOkay)
                                {
                                    number=Integer.parseInt(temp,2);
                                    System.out.println("\u001B[32m"+"Binary to Octal: "+(Integer.toOctalString(number)));
                                }
                                else
                                {
                                    System.out.println("\u001B[31m"+"Please Enter Binary Number");
                                }
                                break;
                            case '2':
                                System.out.println("Enter Binary Number: ");
                                temp=sc.next();
                                isOkay=true;
                                for(int i=0;i<temp.length();i++)
                                {
                                    if(temp.charAt(i)!='1'&&temp.charAt(i)!='0') isOkay=false;
                                }
                                if(isOkay)
                                {
                                    number=Integer.parseInt(temp,2);
                                    System.out.println("\u001B[32m"+"Binary to Decimal: "+number);
                                }
                                else
                                {
                                    System.out.println("\u001B[31m"+"Please Enter Binary Number");
                                }
                                break;
                            case '3':
                                System.out.print("Enter Binary Number: ");
                                temp=sc.next();
                                isOkay=true;
                                for (int i=0;i<temp.length();i++)
                                {
                                    if(temp.charAt(i)!='1'&&temp.charAt(i)!='0') isOkay=false;
                                }
                                if(isOkay)
                                {
                                    number=Integer.parseInt(temp,2);
                                    System.out.println("\u001B[32m"+"Binary to Hex: "+(Integer.toHexString(number).toUpperCase()));
                                }
                                else {
                                    System.out.println("\u001B[31m"+"Please Enter Binary Number");
                                }
                                break;
                            case '4':
                                isExit=true;
                                break;
                                default:
                                    System.out.println("\u001B[31m"+"Please Select Right option");
                        }
                        if(!isExit)
                        {
                            System.out.println("\u001B[33m"+"\nPress y to Continue\nPress any key to go to Main Menu");
                            c=sc.next().charAt(0);
                        }
                        else {
                            c='n';
                        }
                    }while(c=='y');
                    break;
                case '2':
                    do {
                        System.out.println("\u001B[35m"+"1 for Octal To Binary");
                        System.out.println("2 for Octal To Decimal");
                        System.out.println("3 for Octal To Hexadecimal");
                        System.out.println("4 For Exit");
                        isExit=false;
                        ch = sc.next().charAt(0);
                        switch (ch) {
                            case '1':
                                System.out.print("Enter Octal Number: ");
                                temp=sc.next();
                                isOkay=false;
                                for (int i=0;i<temp.length();i++)
                                {
                                    if(temp.charAt(i)>'7') isOkay=false;
                                }
                                if (isOkay)
                                {
                                    number = Integer.parseInt(temp, 8);
                                    System.out.println("\u001B[32m"+"Octal to Binary: " + (Integer.toBinaryString(number)));
                                }
                                else
                                {
                                    System.out.println("\u001B[31m"+"Please Enter Octal Number");
                                }
                                break;
                            case '2':
                                System.out.print("Enter Octal Number: ");
                                temp=sc.next();
                                isOkay=true;
                                for(int i=0;i<temp.length();i++)
                                {
                                    if(temp.charAt(i)>'7') isOkay=false;
                                }
                                if (isOkay)
                                {
                                    number = Integer.parseInt(temp, 8);
                                    System.out.println("\u001B[32m"+"Octal to Decimal: " + number);
                                }
                                else
                                {
                                    System.out.println("\u001B[31m"+"Please Enter Octal Number");
                                }
                                break;
                            case '3':
                                System.out.print("Enter Octal Number: ");
                                temp=sc.next();
                                isOkay=true;
                                for(int i=0;i<temp.length();i++)
                                {
                                    if (temp.charAt(i)>'7') isOkay=false;
                                }
                                if (isOkay)
                                {
                                    number = Integer.parseInt(temp, 8);
                                    System.out.println("\u001B[32m"+"Octal to Hexadecimal: " + (Integer.toHexString(number).toUpperCase()));
                                }
                                else {
                                    System.out.println("\u001B[31m"+"Please Enter Octal Number");
                                }
                                break;
                            case '4':
                                isExit=true;
                                break;
                                default:
                                    System.out.println("\u001B[31m"+"Please Select Right Option");

                        }
                        if (!isExit)
                        {
                            System.out.println("\u001B[33m"+"\nPress y to Continue\nPress any key to go to Main Menu");
                            c=sc.next().charAt(0);
                        }
                        else {
                            c='n';
                        }
                    }while(c=='y');
                    break;
                case '3':
                    do {
                        System.out.println("\u001B[35m"+"1 for Decimal To Binary");
                        System.out.println("2 for Decimal To Octal");
                        System.out.println("3 for Decimal To Hexadecimal");
                        System.out.println("4 for Exit");
                        isExit=false;
                        ch = sc.next().charAt(0);
                        switch (ch) {
                            case '1':
                                System.out.print("Enter Decimal Number: ");
                                try {
                                    System.out.println("\u001B[32m"+"Decimal to Binary: "+Integer.toBinaryString(sc.nextInt()));
                                }
                                catch (Exception e)
                                {
                                    sc.next();
                                    System.out.println("\u001B[31m"+"Please Enter Number");
                                }

                                break;
                            case '2':
                                System.out.print("Enter Decimal Number: ");
                                try {
                                    System.out.println("\u001B[32m"+"Decimal to Octal: "+Integer.toOctalString(sc.nextInt()));
                                }
                                catch (Exception e)
                                {
                                    sc.next();
                                    System.out.println("\u001B[31m"+"Please Enter Number");
                                }

                                break;
                            case '3':
                                System.out.print("Enter Decimal Number: ");
                                try
                                {
                                    System.out.println("\u001B[32m"+"Decimal to Hex: "+Integer.toHexString(sc.nextInt()));
                                }
                                catch (Exception e)
                                {
                                    sc.next();
                                    System.out.println("\u001B[31m"+"Please Enter Number");
                                }

                                break;
                            case '4':
                                isExit=true;
                                break;
                                default:
                                    System.out.println("\u001B[31m"+"Please Select Right Option");
                        }
                        if (!isExit)
                        {
                            System.out.println("\u001B[33m"+"\nPress y to Continue\nPress any key to go to Main Menu");
                            c=sc.next().charAt(0);
                        }
                        else
                        {
                            c='n';
                        }
                    }while(c=='y');
                    break;
                case '4':
                    do {
                        System.out.println("\u001B[35m"+"1 for Hex To Binary");
                        System.out.println("2 for Hex To Octal");
                        System.out.println("3 for Hex To Decimal");
                        System.out.println("4 for Exit");
                        isExit=false;
                        ch = sc.next().charAt(0);
                        switch (ch) {
                            case '1':
                                System.out.println("Enter Hexadecimal Number: ");
                                temp=sc.next();
                                isOkay=true;
                                for (int i=0;i<temp.length();i++)
                                {
                                    if ((temp.charAt(i)<'0'||temp.charAt(i)>'9')&&(temp.charAt(i)<'A'||temp.charAt(i)>'F')) isOkay=false;
                                }
                                if(isOkay)
                                {
                                    number = Integer.parseInt(temp, 16);
                                    System.out.println("\u001B[32m"+"Hex To Binary: " + Integer.toBinaryString(number));
                                }
                                else {
                                    System.out.println("\u001B[31m"+"Please Enter Hex Number");
                                }
                                break;
                            case '2':
                                System.out.println("Enter Hexadecimal Number: ");
                                temp=sc.next();
                                isOkay=true;
                                for(int i=0;i<temp.length();i++)
                                {
                                    if ((temp.charAt(i)<'0'||temp.charAt(i)>'9')&&(temp.charAt(i)<'A'||temp.charAt(i)>'F')) isOkay=false;
                                }
                                if (isOkay)
                                {
                                    int octal = Integer.parseInt(temp, 16);
                                    System.out.println("\u001B[32m"+"Hex To Octal: " + Integer.toOctalString(octal));
                                }
                                else {
                                    System.out.println("\u001B[31m"+"Please Enter Hex Number");
                                }
                                break;
                            case '3':
                                System.out.println("Enter Hexadecimal Number: ");
                                temp=sc.next();
                                isOkay=true;
                                for (int i=0;i<temp.length();i++)
                                {
                                    if ((temp.charAt(i)<'0'||temp.charAt(i)>'9')&&(temp.charAt(i)<'A'||temp.charAt(i)>'F')) isOkay=false;
                                }
                                if (isOkay)
                                {
                                    System.out.println("\u001B[32m"+"Hex To Decimal: " + Integer.parseInt(temp, 16));
                                }
                                else
                                {
                                    System.out.println("\u001B[31m"+"Please Enter Hes Number");
                                }
                                break;
                            case '4':
                                isExit=true;
                                break;
                                default:
                                    System.out.println("\u001B[31m"+"Please Select Right Option");
                        }
                        if (!isExit)
                        {
                            System.out.println("\u001B[33m"+"\nPress y to Continue\nPress any key to go to Main Menu");
                            c=sc.next().charAt(0);
                        }
                        else
                        {
                            c='n';
                        }
                    }while (c=='y');
                    break;
                case '5':
                    ctrl=false;
                    break;
                    default:
                        System.out.println("\u001B[31m"+"Please Select Correct Option");
            }
        }while(ctrl);
    }
}