import java.util.*;

public class Frag4{
	public static void main(String[] args) {
		int op;
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a opção: ");
		op = input.nextInt();
		do {
			System.out.println("op vale " + op);
			op++;
		}while(op <= 3);		
	}
}

