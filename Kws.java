//Calculando a conta de luz.
import java.util.Scanner;
public class Kws{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double salario,kw;
        System.out.print("digite quantos kw gastou: ");
        //entrada.
        kw=teclado.nextDouble();
        System.out.println("digite seu salário");
        salario=teclado.nextDouble();
        //processamento.
        double kw100=(salario/7);
        double kw1=(kw100/100);
        double precoPessoa=(kw1*kw);
        double desc=precoPessoa-(precoPessoa*10)/100;
        //saída.
        System.out.printf("100 kw custam: %.2f ",kw100);
        System.out.printf("  1 kw custa: %.2f \n",kw1);
        System.out.printf(" a casa vai pagar: %.2f \n",precoPessoa);
        System.out.printf(" Com desconto vai ficar: %.2f ",desc);
    }
}