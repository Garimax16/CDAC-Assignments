import java.util.Scanner;
	public class ArrayExample{
	    public static void main(String[] args){
	        int[] arr=new int[5];

	        System.out.println("Default Values:");
	        for(int i=0;i<=arr.length;i++){
	            System.out.println(arr[i]);
	        }

	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter 5 Integers");
	        for(int i=0;i<=arr.length;i++){
	            arr[i]=sc.nextInt();
	        }
	        System.out.println("Updated Values");
	                for(int i=0;i<=arr.length;i++){
	                System.out.println(arr[i]);
                }



	    }
	}
