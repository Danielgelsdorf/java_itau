import java.util.Scanner;
public class Intervalo
{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        int num;
        num=teclado.nextInt();
        if (num>=0 && num<=15){
            System.out.println("ta no intervalo, número: "+num);
        }
        else{
            System.out.println("não está no intervalo, número: "+num);
        }
    }
}