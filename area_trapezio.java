import java.util.Scanner;
public class trapezio{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double area,base,baseMaior,altura;
        System.out.print("digite a base maior");
        baseMaior=teclado.nextDouble();
        System.out.println("digite a outra base");
        base=teclado.nextDouble();
        System.out.println("digite a altura");
        altura=teclado.nextDouble();
        area=(baseMaior+base)*altura/2;
        System.out.println("a área do trapézio é de: "+area);
    }
}