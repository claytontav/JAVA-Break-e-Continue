import java.util.Scanner;

/**
 * BreackContinue
 */
public class BreackContinue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int num = scan.nextInt();

        System.out.println("Informe um limite: ");
        int  max = scan.nextInt();

        for(int i=num; i<=max; i++){
            if(i % 7 == 0){
                System.out.println("O valor de i é: " + i);
                break;
            }
        }


        //Break com rotulos
        for(int i=0; i<=4; i++){
            rotulo1: {
                rotulo2:{
                    rotulo3: {
                        if(i == 1){
                            break rotulo1;
                        }
                        if(i == 2){
                            break rotulo2;
                        }
                        if(i == 3){
                            break rotulo3;
                        }
                        System.out.println("rotulo3");
                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");
            }
            System.out.println(i);
        }

        //Comando Continue 
        System.out.println("Informe um numero: ");
        int num1 = scan.nextInt();

        System.out.println("Informe um limite: ");
        int  max1 = scan.nextInt();

        for(int i=num1; i<=max1; i++){
            if(i % 7 == 0){                
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }

    }
}