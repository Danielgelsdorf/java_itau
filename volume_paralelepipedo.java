import java.util.Scanner;
public class Paralelepipedo{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double altura,largura,profun,volume;
        System.out.println("digite a altura");
        altura=teclado.nextDouble();
        System.out.println("digite a largura");
        largura=teclado.nextDouble();
        System.out.println("digite a profundidade");
        profun=teclado.nextDouble();
        volume=altura*largura*profun;
        System.out.println("o volume do paralelepípedo é de: "+volume);
    }
}