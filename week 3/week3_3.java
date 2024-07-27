import java.util.Scanner;
public class week3_3 {
    public static void main(String[] args) {
        int val = 1;
        while (val > 0) {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for divition");
            System.out.println("Enter 5 to terminate");
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter choice:");
            int a = myObj.nextInt();
            if (a == 1) {
                int val1;
                int val2;
                System.out.println("enter the values");
                val1 = myObj.nextInt();
                val2 = myObj.nextInt();
                System.out.println(val1 + val2);
            } else if (a == 2) {
                int val1;
                int val2;
                System.out.println("enter the values");
                val1 = myObj.nextInt();
                val2 = myObj.nextInt();
                System.out.println(val1 - val2);
            } else if (a == 3) {
                int val1;
                int val2;
                System.out.println("enter the values");
                val1 = myObj.nextInt();
                val2 = myObj.nextInt();
                System.out.println(val1 * val2);
            } else if (a == 4) {
                int val1;
                int val2;
                System.out.println("enter the values");
                val1 = myObj.nextInt();
                val2 = myObj.nextInt();
                System.out.println(val1 / val2);
            } else if (a == 5) {
                break;
                
            } else {
                System.out.println("invalid choice");
            }
        }

    }
}