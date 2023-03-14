import java.util.Scanner;
import java.util.Random;



public class Reto8 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double totalCompra;
        int op;
        Random aleatorio= new Random();
        int valor = aleatorio.nextInt(4)+1;
       double valorCompra=0;
       double precio,pago;
       System.out.println("Ingrese el numero de productos ");
       op= lectura.nextInt();

   while(op>=1){
    
    System.out.println("Ingrese el precio ");
    precio= lectura.nextDouble();
    valorCompra=valorCompra+precio;
     op=op-1;

}






        if(valorCompra>=50000){
        if(valor==1){
            totalCompra=valorCompra*0.1;
             double total=valorCompra-totalCompra;
            System.out.println(" Tu compra es "+valorCompra+" pero sacaste la bola roja y obtuviste un descuento del 10% y el total de tu compra es "+total);
            System.out.println("Digite el billete con el que va a pagar ");
            pago= lectura.nextDouble();
            double cambio=pago-totalCompra;
            System.out.println("su cambio es "+cambio);
        }
        else if(valor==2){
            totalCompra=valorCompra*0.3;
            double total=valorCompra-totalCompra;
            System.out.println(" Tu compra es "+valorCompra+" pero sacaste bolita azul y tienes un 30% de descuento y el total de tu compra es "+total);
            System.out.println("Digite el billete con el que va a pagar ");
            pago= lectura.nextDouble();
            double cambio=pago-totalCompra;
            System.out.println("su cambio es "+cambio);
                  



        }
        else if(valor==3){
            totalCompra=valorCompra*0.5;
            double total=valorCompra-totalCompra;
            System.out.println(" Tu compra es "+valorCompra+" pero sacaste bolita amarilla y tienes un 50% de descuento y el total de tu compra es "+total);
            System.out.println("Digite el billete con el que va a pagar ");
            pago= lectura.nextDouble();
            double cambio=pago-totalCompra;
            System.out.println("su cambio es "+cambio);
                  



        }
        else if(valor==4){
            System.out.println(" Tu compra es "+valorCompra+" pero sacaste bolita blanca y te llevas tu compra gratis");

                  



        }
        }
        else {

            System.out.println(" No tienes descuento el valor de tu compra es "+valorCompra);
            System.out.println("Digite el billete con el que va a pagar ");
            pago= lectura.nextDouble();
            double cambio=pago-valorCompra;
            System.out.println("su cambio es "+cambio);

        }

    
     
        lectura.close();
    }
}