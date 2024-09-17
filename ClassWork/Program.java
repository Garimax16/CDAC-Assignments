package lambda;

@FunctionalInterface
interface Printable{
	void print();
}

public class Program {

	public static void main(String[] args) {
		
		class PrintableImp1 implements Printable{
			@Override
			public void print() {
				System.out.println("Hello from PrintableImp1");
			}
	}
	Printable p = new PrintableImp1();
	p.print();
	
	}
}
