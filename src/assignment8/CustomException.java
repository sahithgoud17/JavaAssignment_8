package assignment8;
import java.util.*;

class ShortLength extends Exception
{
    ShortLength(String msg)
    {
        super(msg);
    }
}
class NoSpecial extends Exception
{
    NoSpecial(String msg)
    {
        super(msg);
    }
}
class VeryLong  extends Exception
{
    VeryLong (String msg)
    {
        super(msg);
    }
}
public class CustomException
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password to be created");
        String passWord=sc.nextLine();
        try
        {
            checkPassword(passWord);
        }
        finally
        {
            System.out.println("Using Strong Passwords helps in data security");
        }

    }
    static void checkPassword(String pswd)
    {
        try
        {
            if(pswd.length() <8)
                throw new ShortLength("password too short");
            else if(pswd.indexOf('@')<0)
                throw new NoSpecial("doesn't have special characters");
            else if (pswd.length() > 16)
                throw new VeryLong(" password is too long");
            else
                System.out.println("Password Created");
        }
        catch (ShortLength  | NoSpecial  | VeryLong ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}