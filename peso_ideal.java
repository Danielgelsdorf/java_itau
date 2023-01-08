// calculando se você está no peso  ideal.
import java.util.Scanner;
public class PesoIdeal{
    public static void main(String args[]){
        Scanner teclado =new Scanner(System.in);
        double altura;
        char sexo;
        System.out.print("digite sua altura");
        //entrada.
        altura=teclado.nextDouble();
        System.out.print("digite seu sexo, m: mulher e h: homem.");
        sexo=teclado.next().charAt(0);
        //processamento e saída.
        if (sexo=='h'){
            double idealH =(72.7*altura)-58;
            System.out.printf("peso ideal: %.2f",idealH," kg");
        }
        else if (sexo=='m'){
            double idealH =(62.1*altura)-44.7;
            System.out.printf("peso ideal: %.2f",idealH,"kg");
        }
        else{
            System.out.printf("sexo inválido, porfavor tente novamente.");
        }
    }
}
