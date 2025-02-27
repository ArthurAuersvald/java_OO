import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		System.out.println("Digite seu nome");
		x = sc.nextLine();
		System.out.println("Digite sua idade");
		y = sc.nextInt();
		System.out.println("Digite seu saldo");
		z = sc.nextDouble();
		
		System.out.println("Seu nome é " + x);
		System.out.println("Sua idade é " + y);
		System.out.println("Seu saldo é " + z);
		
		sc.close();
	}

}
