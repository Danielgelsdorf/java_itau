// montando uma calculadora
import java.util.Scanner;
public class Calcule {
    public static void main(String args[]) {          Scanner tc=new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        int num,num1,res,i;
        char opcao;
        i=1;
                do{
                    System.out.println(" digite o primeiro número");
                    num= teclado.nextInt();
                    System.out.println(" digite o segundo número");
                    num1=teclado.nextInt();
                    System.out.println(" digite +: para somar, -: para diminuir, *: para multiplicar, /: para dividir e s: para saír.");
                    opcao=teclado.next().charAt(0);
                    switch(opcao){
                        case '+':
                            res=num+num1;
                            System.out.println(" o resultado da soma foi: " +res);
                            break;
                        case '-':
                            res=num-num1;
                            System.out.println(" o resultado da conta foi: " +res);
                            break;
                        case '*':
                            res=num*num1;
                            System.out.println(" o resultado da conta foi: " +res);
                            break;
                        case '/':
                            res=num/num1;
                            System.out.println(" o resultado da conta foi: " +res);
                            break;
                        case 's':
                            System.out.println(" obrigado por usar o programa");
                            i=0;
                            break;
                        default:
                            System.out.println(" opção errada, por favor digite outra.");
                    }
                    
                }while(i > 0);
            }
        }