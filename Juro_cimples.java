import java.util.Scanner;
public class Juros {
    public static void main(String args[]) {
        Scanner teclado=new Scanner(System.in);
        double valor,tacha;
        int atraso;
        System.out.println("digite o valor da parcela");
        valor=teclado.nextDouble();
        System.out.println("digite a tacha de juros");
        tacha=teclado.nextDouble();
        System.out.println("digite quantos anos de atraso");
        atraso=teclado.nextInt();
        tacha=tacha/100;
        System.out.print("tacha "+tacha);
        double res=(valor*tacha)*atraso;
        System.out.println("deu R$"+res+" de juros");
        double valorTotal=valor+res;
        System.out.println("o valor total ficou "+valorTotal);
    }
}