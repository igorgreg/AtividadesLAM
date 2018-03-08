import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int n = rand.nextInt(100)+1;
		int chances = 3;
		int nUser;
		do {
			System.out.println("Digite um valor);
			nUser = input.nextInt();
			if(nUser > n) {
				System.out.println("Número menor");
			}else if(nUser < n){
				System.out.println("Número maior");
			}else {
				System.out.println("Ganhou");
				break;
			}
			if(chances == 1) {
				System.out.println("Perdeu");
				break;
			}
			chances--;
		}while(nUser != n);
		
	}
}
