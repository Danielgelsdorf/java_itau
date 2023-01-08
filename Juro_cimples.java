//calculando o juro cimples de um valor.
import java.util.Scanner;
public class Juros {
    public static void main(String args[]) {
        Scanner teclado=new Scanner(System.in);
        double valor,tacha;
        int atraso;
        System.out.println("digite o valor da parcela");
        //entrada.
        valor=teclado.nextDouble();
        System.out.println("digite a tacha de juros");
        tacha=teclado.nextDouble();
        System.out.println("digite quantos anos de atraso");
        atraso=teclado.nextInt();
        //processamento.
        tacha=tacha/100;
        double res=(valor*tacha)*atraso;
        double valorTotal=valor+res;
        //saída.
        System.out.println("deu R$"+res+" de juros");
        System.out.println("o valor total ficou "+valorTotal);
    }
}