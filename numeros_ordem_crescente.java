//recebendo 3 números e colocando em ordem crescente.
import java.util.Scanner;
public class Crescente{
    public static void main(String args[]) {
        Scanner teclado=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("digite um número");
        //entrada.
        n1=teclado.nextInt();
        System.out.println("digite um número");
        n2=teclado.nextInt();
        System.out.println("digite um número");
        n3=teclado.nextInt();
        //processamento nos if e saída dentro deles.
        if(n1>n2&& n2>n3){
            System.out.println("os números em ordem crescente são"+n3+" "+n2+" "+n1);
        }
        else if (n1>n3&& n3>n2){
            
            System.out.println("os números em ordem crescente são"+n2+" "+n3+" "+n1);
        }
        else if (n3>n2 &&n2>n1){
            System.out.println("os números em ordem crescente são"+n1+" "+n2+" "+n3);
        }
        else if (n3> n1&& n1> n2){
            System.out.println("os números em ordem crescente são"+n2+" "+n1+" "+n3);
        }
        else if ( n2> n1&& n1>n3){
            System.out.println("os números em ordem crescente são"+n3+" "+n1+" "+n2);
        }
        else {
            System.out.println("os números em ordem crescente são"+n1+" "+n3+" "+n2);
        }
    }
}
    
        