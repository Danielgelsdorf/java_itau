// pegando 3 nomes e 6 notas e mostrando os nomes e as respectivas médias.
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner tc=new Scanner(System.in);
        String nomes[]= new String[3];
        double notas[]=new double[6];
        int j=0;
        for(int i=0; i<3; i++){
            System.out.println("digite seu nome");
            nomes[i]=tc.next();
        for(int k=0; k<2; k++){
            System.out.println("digite a nota");
            notas[j]=tc.nextDouble();
            j++;
            }
            
        }
        
        j=0;
        for(int i=0; i<3; i++){
            System.out.println("seu nome é: "+nomes[i]);
            System.out.println(" sua média foi "+((notas[j]+notas[j+=1])/2));
            j+=1;
        }
    }
}