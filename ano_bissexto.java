
import java.util.Scanner;
public class Bissexto{
    public static void main(String args[]) {
        //Criando o objeto Scanner e declarando as variáveis.
        Scanner teclado=new Scanner(System.in);
        int ano,mes,dia;
        System.out.println("Digite o dia que nasceu: ");
        //Entrada.
        dia=teclado.nextInt();
        System.out.println("digite o mês que nasceu");
        mes=teclado.nextInt();
        System.out.println("digite o ano que nasceu");
        ano=teclado.nextInt();
        //Procesamento e saída.
        if (ano %4 ==0){
            System.out.println("sua data de nascimento é: "+dia+"/"+mes+"/"+ano+" e o ano é bissexto");
        }
        else{
            System.out.println("sua data de nascimento é: "+dia+"/"+mes+"/"+ano+" e o ano não é bissexto");
        }
    }
}