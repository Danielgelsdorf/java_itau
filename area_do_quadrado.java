// calculando a área de um quadrado
import java.util.Scanner;
public class Quadrado{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        int quadrado,area;
        System.out.println("digite  o lado do quadrado: ");
        //entrada.
        quadrado=teclado.nextInt();
        //processamento.
        area=quadrado*quadrado;
        //saída.
        System.out.println("a área do quadrado é: "+area);
        
    }
}
