import java.util.*;

public class Atividade1{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do funcionario: ");
        String nome = input.next();
        System.out.print("Horas trabalhadas: ");
        int horas = input.nextInt();
        System.out.print("Valor pago por hora: ");
        float pagoHoras = Float.parseFloat(input.next());
        float salario = horas * pagoHoras;
        System.out.print("Salario: " + salario);

    }

}
