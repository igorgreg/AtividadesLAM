import java.util.*;

public class PegaEntradadoTeclado {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome = "";
		System.out.printf("Digite o seu nome");
		nome = input.next();
		System.out.printf("\nMeu nome é %s\n", nome);
		int idade;
		System.out.print("Digite a sua idade: ");
		idade = input.nextInt();
		System.out.printf("\nMinha idade é %d\n",idade);
	}
}