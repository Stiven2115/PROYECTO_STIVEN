import java.util.Scanner;

public class pablo {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        int productos;
        double pago,total,cambio;

        System.out.println("ingrese la cantidad de productos");
        productos=lectura.nextInt();
        System.out.println("ingrese la cantidad con la que va a pagar");
        pago=lectura.nextDouble();
        total=productos*10000;
        cambio=pago-total;
        if (pago>=total){
            System.out.println("su total es de "+total+"su cambio es"+cambio);
        ;}else{
            System.out.println("disculpe, el total de "+total+"es superior a su pago de "+pago+"cancele el valor restante");

        }
lectura.close();    
    }
}
