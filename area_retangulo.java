import java.util.Scanner;
public class Retangulo{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double altura,base;
        System.out.println("digite a base");
        //entrada.
        base=teclado.nextDouble();
        System.out.println("digite a altura");
        altura=teclado.nextDouble();
        //processamento.
        base=base*altura;
        //saída.
        System.out.println("a área do retângulo é:"+base);
    }
}