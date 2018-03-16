import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		int horasTrab;
		float valorHora;
		
		System.out.print("Digite o nome do funciońario: ");
		nome = input.next();
		System.out.println();
		System.out.print("Digite o valor da hora de trabalho: ");
		valorHora = input.nextFloat();
		System.out.println();
		System.out.print("Digite o total de horas trabalhadas: ");
		horasTrab = input.nextInt();
		System.out.println();
		System.out.printf("O salário do %s eh %.3f\n", nome, horasTrab*valorHora);
	}
}

