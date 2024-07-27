import java.util.Scanner;
public class week3_1
{
    public static void main(String[]args)
    {
        String[] cars={"Volvo","BMW","Ford","Mazda"};
        for(String i : cars)
        {
            System.out.println(i);
        }
        for(int i=0;i<10;i++)
        {
            if (i==4)
            {
                continue;
            }
            else if(i==7)
            {
                break;
            }

            System.out.println(i);
        }
        Scanner myObj = new Scanner(System.in);
        String username;  //enter username and press enter
        System.out.println("Enter username");
        username=myObj.nextLine();
        System.out.println("Username is: "+username);


    }
}
