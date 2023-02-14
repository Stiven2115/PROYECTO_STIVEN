import java.util.Scanner;

public class Budget{

public static void main(String[] args) {
    double ancho,largo,presupuesto,area;
    System.out.println("Ingrese el ancho") ;
    Scanner lectura=new Scanner(System.in);
    ancho=lectura.nextDouble();
    System.out.println("Ingrese el largo");
    largo=lectura.nextDouble();
    area=largo*ancho;
    presupuesto=45.000*area;

    System.out.println("La superficie a cubir tiene "+ancho+"metros de ancho por"+largo+"metros de largo, con 2metros cuadrados. El presupuesto del proyecto es :"+presupuesto);

    lectura.close();
}

}

    

