import java.util.Scanner;

public class AtribuicaoAcumulativa {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
	    
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
			System.out.println("Valor da conta = R$" + conta);

		sc.close();
	}
}