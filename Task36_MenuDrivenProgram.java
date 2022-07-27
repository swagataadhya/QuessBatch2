import java.util.Scanner;
class MyNumber
{
    int pos;
    int arr[];
    MyNumber ()
    {
        arr = new int[10];
        pos = -1;
    }

    void insert (int n)
    {
        if (pos == 9)
        {
            System.out.print ("Array Full");
        }
        else
        {
            pos++;
            arr[pos] = n;

        }
    }
    void search (int n)
    {
        boolean isfound = false;
        int i;
        for (i = 0; i <= pos; i++)
        {
            if (arr[i] == n)
            {
                isfound = true;
                break;
            }
        }
        if (isfound)
            System.out.print ("This Number Is Found on " + (i + 1) + " Position");
        else
            System.out.print ("This Number Is Not Found");
    }

    void disp ()
    {
        if (pos != -1)
        {
            for (int i = 0; i <= pos; i++)
            {
                System.out.print (arr[i] + " ");
            }
        }
        else
        {
            System.out.println ("There are no element in array to show");
        }

    }
    boolean isEmpty ()
    {
        if (pos == -1)
            return true;
        else
            return false;
    }
    boolean delete (int n)
    {
        boolean ctrl=false;
        int p = 0;
        while (p <= pos)
        {
            if (arr[p] == n)
            {
                ctrl=true;
                break;
            }
            p++;
        }
        if(ctrl)
        {
            for (; p < pos; p++)
            {
                arr[p] = arr[p + 1];
            }
            pos--;
        }
        else{
            System.out.println("Number Not Found");
        }
        return ctrl;
    }
    void sortDesc ()
    {
        if (pos == 0)
        {
            System.out.println("There is only one number, Usually we can perform the task between Two or more numbers");
            disp ();
        }
        else
        {
            int temp;
            for (int i = 0; i <= pos; i++)
            {
                for (int j = 0; j < pos; j++)
                {
                    if (arr[j] < arr[j + 1])
                    {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            disp ();
        }

    }
    void sortAsc ()
    {
        if (pos == 0)
        {
            System.out.println
                    ("There is only one number, Usually we can perform the task between Two or more numbers");
            disp ();
        }
        else
        {
            int temp;
            for (int i = 0; i <= pos; i++)
            {
                for (int j = 0; j < pos; j++)
                {
                    if (arr[j] > arr[j + 1])
                    {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            disp ();
        }
    }

    void posInsert (int number, int p)
    {
        if (pos == 9)
        {
            System.out.println ("Array Full");
        }
        else
        {
            if (p == 1 && pos == -1)
            {
                pos++;
                arr[pos] = number;
            }
            else if((p-1)==pos+1)
            {
                pos++;
                arr[pos]=number;
            }
            else if ((p - 1) <= pos)
            {
                int i = pos;
                while (i != (p - 1))
                {
                    arr[i + 1] = arr[i];
                    i--;
                }
                arr[i + 1] = arr[i];
                arr[i] = number;
                pos++;
            }
            else
            {
                System.out.println("Insert not possible because it will be out of bound");
                System.out.println("Please type a number within the correct position");
            }
        }

    }

    void getMin ()
    {
        if (pos == -1)
        {
            System.out.println ("Array Is empty");
        }
        else
        {
            int min = 65000;
            for (int i = 0; i <= pos; i++)
            {
                if (min > arr[i])
                {
                    min = arr[i];
                }
            }
            System.out.println ("The Minimum Number Is: " + min);
        }
        disp ();
    }
    void getMax ()
    {
        if (pos == -1)
        {
            System.out.println ("Array Is Empty");
        }
        else
        {
            int max = 0;
            for (int i = 0; i <= pos; i++)
            {
                if (max < arr[i])
                {
                    max = arr[i];
                }
            }
            System.out.println ("The Maximum Number Is: " + max);
        }
        disp ();
    }

    int getLength ()
    {
        return pos + 1;
    }

}

public class Task36_MenuDrivenProgram
{
    public static void hold (Scanner sc)
    {
        System.out.println ("\nPress any Key and Enter to Dive in Menu again");
        sc.next ();
    }
    public static void main (String[]args)
    {
        MyNumber mn = new MyNumber ();
        Scanner sc = new Scanner (System.in);
        char choice;
        int x;
        boolean ctrl = true;

        do
        {
            System.out.print ("\033[H\033[2J");
            System.out.flush ();
            System.out.println
                    ("---------------------------------------------------------");
            System.out.println ("Type");
            System.out.println ("1 for Insert");
            System.out.println ("2 for Display");
            System.out.println ("3 for Delete");
            System.out.println ("4 for Search");
            System.out.println ("5 for Sorting");
            System.out.println ("6 for Insert in position");
            System.out.println ("7 for Minimum Value");
            System.out.println ("8 for Maximum Value");
            System.out.println ("9 for Exit");
            System.out.println
                    ("---------------------------------------------------------");
            choice = sc.next ().charAt (0);
            switch (choice)
            {
                case '1':
                    System.out.println ("Enter Element");
                    x = sc.nextInt ();
                    mn.insert (x);
                    System.out.println("Insert Successful!");
                    hold(sc);
                    break;
                case '2':
                    mn.disp ();
                    hold (sc);
                    break;
                case '3':
                    if (!mn.isEmpty ())
                    {
                        mn.disp();
                        System.out.println ("\nEnter Which Number you want to Delete from the Array");
                        x = sc.nextInt ();
                        if(mn.delete (x))
                        System.out.println("Deletion Successful!");
                        else
                            System.out.println("Deletion Unsuccessful!\nBecause that particular number is not in the Array");
                        hold(sc);
                    }
                    else
                    {
                        System.out.println ("There are no number in the array to Delete");
                        hold (sc);
                    }
                    break;
                case '4':
                    if (!mn.isEmpty ())
                    {
                        System.out.println ("Enter Which Elements You Want to Search");
                        x = sc.nextInt ();
                        mn.search (x);
                    }
                    else
                    {
                        System.out.println ("Array is Empty, no number to show");
                    }
                    hold (sc);
                    break;
                case '5':
                    if (!mn.isEmpty ())
                    {
                        System.out.println ("Type 'a' for Ascending\n'd' for Descending");
                        char c = sc.next ().charAt (0);
                        if (c == 'A' || c == 'a')
                        {
                            mn.sortAsc ();
                        }
                        else if (c == 'D' || c == 'd')
                        {
                            mn.sortDesc ();
                        }
                        else
                        {
                            System.out.println ("Please Enter Proper Option");
                        }
                    }
                    else
                    {
                        System.out.println("There are no number in array \n Insert some number at first");
                    }
                    hold (sc);
                    break;
                case '6':
                    mn.disp();
                    if (!mn.isEmpty())
                    {
                        System.out.print("\nEnter number and position in between " + (mn.getLength ()+1) + " length:");
                        int n, p;
                        n = sc.nextInt();
                        p = sc.nextInt();
                        if (p <= 0) {
                            System.out.println("position cannot be 0 or less than 0, it must be between 1 to n numbers\nPlease type accordingly");
                        } else {
                            mn.posInsert(n, p);
                            mn.disp();
                            System.out.println("Insert Successful in the particular position");
                        }
                    }
                    else
                    {
                        System.out.println("Logically still you can insert in the 1st position");
                        System.out.println("Enter the number: ");
                        int nu=sc.nextInt();
                        mn.posInsert(nu,1);
                        mn.disp();
                    }
                    hold (sc);
                    break;
                case '7':
                    mn.getMin ();
                    hold (sc);
                    break;
                case '8':
                    mn.getMax ();
                    hold (sc);
                    break;
                case '9':
                    ctrl = false;
                    break;
                default:
                    System.out.println ("Please Enter Right Choice (Cases between 1-9)");
                    hold (sc);
            }
        }
        while (ctrl);
    }
}