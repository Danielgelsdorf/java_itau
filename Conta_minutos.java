// contando os minutos que se passaram dês do início do dia, até a hora atual.
import java.util.Scanner;
public class ContaMin {
    public static void main(String args[]) {
        Scanner teclado=new Scanner(System.in);
        int hora,min,total;
        System.out.print("digite a hora atual");
        //entrada.
        hora=teclado.nextInt();
        System.out.print("digite o minuto  atual");
        min=teclado.nextInt();
        //processando
        total=(hora*60)+min;
        //saída.
        System.out.print("se passaram "+total+" minutos, dês do início do dia.");
    }
}