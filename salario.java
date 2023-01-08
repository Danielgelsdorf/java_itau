//calculando salário com desconto.
import java.util.Scanner;
public class Salario
{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double precoHora, quantHora, por;
        System.out.println("digite a quantidade de horas trabalhadas ");
        //entrada.
        quantHora=teclado.nextDouble();
        System.out.println("digite quando desconto deseja dar ");
        por=teclado.nextDouble();
        System.out.println("digite o preço da hora");
        precoHora=teclado.nextDouble();
        //processamento.
        double salario=quantHora*precoHora;
        double total=salario-(salario*por)/100;
        //saída
        System.out.println("salário final foi de:"+total);
}
}