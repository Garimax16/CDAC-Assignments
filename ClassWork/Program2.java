package lambda;
import java.util.function.Predicate;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;



public class Program2 {
	

	public static void main(String[] args) {
		
		Supplier<Integer> akash = () -> new Random().nextInt();
		int num = akash.get();
		System.out.println(num);
		
	}
	
	public static void main2(String[] args) {
		
		Consumer <String> akash = strr -> System.out.println(strr);
		akash.accept("adadasdasd");
	}
	
	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> I = num -> num%2==0;
		int num = 17;
		System.out.println(I.test(num));
	}

}
