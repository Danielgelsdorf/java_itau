//calculando o volume de um cilindro.
import java.util.Scanner;
public class Cilindro{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double PI,altura,raio,volume;
        PI=3.14;//atribuindo valor a o PI.
        System.out.println("digite a altura do cilindro");
        //entrada.
        altura=teclado.nextDouble();
        System.out.print("digite o raio do cilindro");
        raio=teclado.nextDouble();
        //processamento.
        volume=PI*raio*raio*altura;
        //saída.
        System.out.println("o volume do cilindro foi: "+volume+"o PI foi: "+PI);
    }
}