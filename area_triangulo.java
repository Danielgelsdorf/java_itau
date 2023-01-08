//calculando a área de um triângulo.
import java.util.Scanner;
public class Triangulo{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double base,altura,area;
        System.out.println("digite a base");
        //entrada.
        base=teclado.nextDouble();
        System.out.println("digite a altura");
        altura=teclado.nextDouble();
        //processando.
        area=(base*altura)/2;
        //saída.
        System.out.println("área do triângulo: "+area);
        altura=teclado.nextDouble();
    }
}