import java.util.Scanner;
public class losango{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double area,diagonal,diagonal1;
        System.out.println("digite a primeira diagonal");
        diagonal=teclado.nextDouble();
        System.out.println("digite a segunda diagonal");
        diagonal1=teclado.nextDouble();
        area=diagonal*diagonal1;
        System.out.println(" área do losango é de: "+area);
    }
}