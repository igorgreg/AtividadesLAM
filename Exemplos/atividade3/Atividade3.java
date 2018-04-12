import java.util.*;

public class Atividade3{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int cont = 1;
        Random gerador = new Random();
        int numero = gerador.nextInt(10)+1;
        while(cont <= 3){
            System.out.println("Digite um numero: ");
            int n = input.nextInt();
            if(n == numero){
                System.out.println("Você acertou!" + numero);
                cont = 4;
            }else{
                cont++;
            }
        }
    }

}
