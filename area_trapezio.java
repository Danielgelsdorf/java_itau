//calculando a área de um trapézio
import java.util.Scanner;
public class trapezio{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double area,base,baseMaior,altura;
        System.out.print("digite a base maior");
        //entrada.
        baseMaior=teclado.nextDouble();
        System.out.println("digite a outra base");
        base=teclado.nextDouble();
        System.out.println("digite a altura");
        altura=teclado.nextDouble();
        //processano.
        area=(baseMaior+base)*altura/2;
        //saída.
        System.out.println("a área do trapézio é de: "+area);
    }
}