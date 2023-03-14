import java.util.Random;
import java.util.Scanner;

public class Reto7 {
    

    public static void main(String[] args) throws Exception {
        Scanner lectura =new Scanner(System.in);
        double valorCompra;


        System.out.println("ingrese el valor de la compra");
        valorCompra=lectura.nextDouble();

        Random bolitas =new Random();
        int valor = bolitas.nextInt(4)+1;


        if(valorCompra >=50000){
            if(valor==1){

                System.out.println("sacaste la bola roja y obtuviste un descuento del 10% en el total de tu compra");
            }

            else if(valor==2){
                System.out.println("sacaste la bola azul y obtuviste un descuento del 30% en el total de tu compra");
            }

            else if(valor==3){
                System.out.println("sacaste la bola amarilla y obtuviste un descuento del 50% en el total de tu compra");
            }

            else if(valor==4){
                System.out.println("sacaste la bola blanca y tu compra es totalmente gratis");
            }

            else{
                System.out.println("no obtuviste tu descuento porque el valor de tu compra es " + valorCompra);
            }
            lectura.close();
        }
    }
}