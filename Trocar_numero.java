//usando variáveis para trocar o número de lugar.
import java.util.Scanner;
public class TrocarNumero {
    public static void main(String args[]) {
        Scanner teclado=new Scanner(System.in);
        int a,b,c;
        System.out.print("digite um número");
        //entrada.
        a=teclado.nextInt();
        System.out.print("digite um número");
        b=teclado.nextInt();
        //processamento.
        c=b;
        b=a;
        a=c;
        //saída.
        System.out.print("números "+a+b);
    }
}