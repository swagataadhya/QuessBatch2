//Task 40 : Write a java program that let the user choose his/her username and password. The program verifies whether the chosen username and password are valid. If either one of them is invalid, it notifies the user by raising exception and explain the cause of invalidity. The rules for choosing valid usernames and passwords are:
//a. A username must be of length 6-15 characters.
//b. A username must start with an uppercase English alphabet A to Z.
//c. A password must not be shorter than 8 characters but must not exceed 256.
//d. There cannot be any types of parentheses or whitespaces in a valid username or password.
//e. A password cannot contain or be the same as its associated username


import java.util.Scanner;
class MyException extends Exception
{
    String error;
    MyException(String err)
    {
        super(err);
        this.error=err;
    }
}

class UserNamePass
{
    private String uname;
    private String upass;
    void setUsername(String un) throws MyException
    {
        if((un.length()>=6&&un.length()<=15)&&(un.charAt(0)>='A'&&un.charAt(0)<='Z')&&(!un.contains(" ")&&!un.contains("{")&&!un.contains("}")&&!un.contains("[")&&!un.contains("]")&&!un.contains("(")&&!un.contains(")")))
        {
            this.uname=un;
        }
        else
        {
            throw(new MyException("User Name is Not Matching Conditions"));
        }
    }

    void setPassWord(String pass) throws MyException
    {
        if((pass.length()>=8&&pass.length()<=256))
        {
            this.upass=pass;
        }
        else
        {
            throw(new MyException("Password is Not Matching Conditions\nPlease Try Again!"));
        }
    }

}

public class Task40_UsernamePasswordException
{
    public static void main(String[] args) {
        UserNamePass unp=new UserNamePass();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter User Name: ");
        String n=sc.nextLine();
        System.out.println("Enter Password: ");
        String p=sc.nextLine();
        try {
            unp.setUsername(n);
            unp.setPassWord(p);
            System.out.println("Successful!\nJAI SHREE RAM");
        }
        catch(MyException e)
        {
            System.out.println(e.error);
        }
    }
}