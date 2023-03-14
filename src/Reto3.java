import java.util.Random;
import java.util.Scanner;



public class Reto3 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese 1.cara o 2.sello ");
        numero= lectura.nextInt();
        Random r = new Random();
        int valorNum = r.nextInt(2)+1;
        if(valorNum==1 && numero==1){
            System.out.println("Al haber escogido cara, automaticamente gano ");


        }
        else if(valorNum==2 && numero==2){
            System.out.println("Al haber escogido sello, automaticamente gano ");

        }
      else if (numero==1){
        System.out.println("Al haber escogido cara y el resultado arrojado fue sello, quiere decir que no gano ");

      }
      else if(numero==2){
      System.out.println("Al haber escogido sello y el resultado arrojado fue cara, quiere decir que no gano ");
      }
      else{
        System.out.println("es un valor no permitido en el sistema");

      }

      

        lectura.close();
    }
} 