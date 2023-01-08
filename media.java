import java.util.Scanner;
public class Media
{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double nota,nota1,media;
        System.out.println("bem vindo");
        System.out.println("digite a primeira nota");
        nota=teclado.nextDouble();
        System.out.print("digite a nota 2");
        nota1=teclado.nextDouble();
        media=(nota+nota1)/2;
        System.out.println("média do aluno: "+media);
    }
}