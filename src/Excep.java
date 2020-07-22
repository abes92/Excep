import java.util.Scanner;

public class Excep {


    public static void main(String []args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your favorite name");

            try {
                String n=sc.nextLine();
                System.out.println("your lovely name is ");
                System.out.println(n);
            } catch(Exception e) {
                System.out.println("sorry please enter a name");
            }

        }
}
