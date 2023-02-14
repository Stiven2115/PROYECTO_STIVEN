import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        int number1, number2, resultado;

        number1 = lectura.nextInt();

        System.out.println("El numero que ingresa es: "+number1);

        number2 = lectura.nextInt();

        System.out.println("El numero que ingresa es: " +number2);

        resultado= number1+number2;

        System.out.println("La suma entre " +number1+ " y " +number2+ " es " +resultado);


        lectura.nextLine(); //Limpieza de buffer 
        

    String name;
    System.out.println(" Ingrese su nombre ");

    name = lectura.nextLine();

    System.out.println(" El nombre ingresado fue: " +name);

        lectura.close();
    }
}
