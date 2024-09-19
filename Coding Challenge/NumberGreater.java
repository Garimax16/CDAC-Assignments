import java.util.Scanner;
public class NumberGreater{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n=sc.nextInt();

        int[] numbers=new int[n];
        System.out.println("Enter the elements of an Array: ");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }

        double sum=0;
        for (int number:numbers){
            sum+=number;
        }

        double average=sum/n;

        System.out.println("The average is :"+average);

        System.out.println("Number greater than average:");
        for(int number:numbers){
            if(number>average){
                System.out.println(number);
            }

            sc.close();
        }
        }
    }
