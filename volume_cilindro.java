import java.util.Scanner;
public class Cilindro{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double PI,altura,raio,volume;
        PI=3.14;
        System.out.println("digite a altura do cilindro");
        altura=teclado.nextDouble();
        System.out.print("digite o raio do cilindro");
        raio=teclado.nextDouble();
        volume=PI*raio*raio*altura;
        System.out.println("o volume do cilindro foi: "+volume+"o PI foi: "+PI);
    }
}