import java.util.*;

public class Desafio{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String vetor = "";
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();
        while(numero != 0){
            vetor = vetor + numero%2;
            numero = numero/2;
        }
        StringBuffer saida = new StringBuffer(vetor);
        System.out.print(saida.reverse());
    }

}
