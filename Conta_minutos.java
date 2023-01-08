import java.util.Scanner;
public class ContaMin {
    public static void main(String args[]) {
        Scanner teclado=new Scanner(System.in);
        int hora,min,total;
        System.out.print("digite a hora atual");
        hora=teclado.nextInt();
        System.out.print("digite o minuto  atual");
        min=teclado.nextInt();
        total=(hora*60)+min;
        System.out.print("se passaram "+total+" minutos, dês do início do dia.");
    }
}