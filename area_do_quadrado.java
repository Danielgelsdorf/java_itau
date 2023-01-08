import java.util.Scanner;
public class Quadrado{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        int quadrado,area;
        System.out.println("digite a o lado do quadrado: ");
        quadrado=teclado.nextInt();
        area=quadrado*quadrado;
        System.out.println("a área do quadrado é: "+area);
        
    }
}
