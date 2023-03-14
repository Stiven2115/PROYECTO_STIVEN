import java.util.Scanner;
import java.util.Random;



public class Reto9 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int numero,op;
        double incremento=0;
        double vglobal=23000045;
        System.out.println("digite cuantas va a jugar ");
        op= lectura.nextInt();
        int impresion=op;
        System.out.println("digite cuantas veces desea apostar ");
        incremento= lectura.nextDouble();
        double vapostado=incremento;
        while(op>=1){
            System.out.println("Ingrese 1.cara o 2.sello ");
            numero= lectura.nextInt();
            Random r = new Random();
            int valor = r.nextInt(2)+1;
            if(valor==1 && numero==1){
                System.out.println(" Al haber escogido cara, automaticamente gano ");
                 vglobal=vglobal-incremento;
                 incremento=incremento*2;
                
              
            }
            else if(valor==2 && numero==2){
                System.out.println("Al haber escogido sello, automaticamente gano ");
                 vglobal=vglobal-incremento;
                 incremento=incremento*2;
         
              }
          else if (numero==1){
            System.out.println("Al haber escogido cara y el resultado arrojado fue sello, quiere decir que no gano");
             vglobal=vglobal+incremento;
             incremento=incremento-vapostado;
             
          }
          else if(numero==2){
          System.out.println("Al haber escogido sello y el resultado arrojado fue cara, quiere decir que no gano");
           vglobal=vglobal+incremento;
           incremento=incremento-vapostado;
          }
          else{
            System.out.println("es un valor no permitido en el sistema");
    
          }
        
             op=op-1;
        
        }
        System.out.println("Usted jugo "+impresion+" veces y acumulo cierta cantidad de plata: " +incremento);

        
        
       

      

        lectura.close();
    }
}
