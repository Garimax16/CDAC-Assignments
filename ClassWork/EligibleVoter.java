import java.util.Scanner;

public class EligibleVoter{
    public static void main(String []args)
{
    Scanner scanner=new Scanner(System.in);
System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        if(age>18){
            System.out.println("You are Elgible to vote");
        }
        else{
            System.out.println("You are not elible to vote");
        }

        scanner.close();
}
}
