//calculando o volume de um cubo.
import java.util.Scanner;
public class Cubo{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double res,lado;
        System.out.println("digite o lado do cubo");
        //entrada.
        lado=teclado.nextDouble();
        //processamento.
        res=lado*lado*lado;
        //saída.
        System.out.print("o volume do cubo é: "+res);
    }
}