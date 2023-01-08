
import java.util.Scanner;
public class Bissexto{
    public static void main(String args[]) {
        Scanner teclado=new Scanner(System.in);
        int ano,mes,dia;
        System.out.println("digite o dia que nasceu");
        dia=teclado.nextInt();
        System.out.println("digite o mês que nasceu");
        mes=teclado.nextInt();
        System.out.println("digite o ano que nasceu");
        ano=teclado.nextInt();
        if (ano %4 ==0){
            System.out.println("sua data de nascimento é: "+dia+"/"+mes+"/"+ano+" e o ano é bissexto");
        }
        else{
            System.out.println("sua data de nascimento é: "+dia+"/"+mes+"/"+ano+" e o ano não é bissexto");
        }
    }
}