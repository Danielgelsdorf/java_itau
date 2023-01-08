import java.util.Scanner;
public class Cubo{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double res,lado;
        System.out.println("digite o lado do cubo");
        lado=teclado.nextDouble();
        res=lado*lado*lado;
        System.out.print("o volume do cubo é: "+res);
    }
}