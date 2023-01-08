
import java.util.Scanner;
public class TrocarNumero {
    public static void main(String args[]) {
        Scanner teclado=new Scanner(System.in);
        int a,b,c;
        a=teclado.nextInt();
        b=teclado.nextInt();
        System.out.print("mostrar a depois de lida "+a);
        System.out.print("mostrar b depois de lida "+b);
        c=b;
        b=a;
        a=c;
        System.out.print("números "+a+b);
    }
}