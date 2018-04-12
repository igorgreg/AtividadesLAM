import java.util.*;

public class Frag{
	public static void main(String[] args) {
		int idade;
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a idade: ");
		idade = input.nextInt();
		if(idade < 18) {
			System.out.println("Entrada não permitida");
		}else {
			System.out.println("Entrada permitida");
		}
	}
}

