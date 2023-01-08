import java.util.Scanner;
public class Inverter{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        int unid,dez,cen,num;
        System.out.println("digite o número para enverter");
        //entrada.
        num=teclado.nextInt();
        //processamento.
        unid=num%10;
        dez=num%100;
        dez=dez/10;
        cen=num/100;
        //saída.
        System.out.println("o número invertido ficou: "+unid+dez+cen);
    }
}