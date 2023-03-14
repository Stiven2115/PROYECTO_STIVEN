import java.util.Scanner;

public class Reto5 {

  public static void main(String[] args) {

    Scanner lectura = new Scanner(System.in);

    System.out.print("digite su nombre a continuación ");

    String nombreUsu = lectura.next();

    System.out.print("digite su apellido a continuación ");

    String apellidoUsu = lectura.next();

    int longitudNombre = nombreUsu.length();

    int longitudApellido = apellidoUsu.length();

    String nombreMayuscula = nombreUsu.toUpperCase();

    String apellidoMinuscula = apellidoUsu.toLowerCase();

    String nombreCompleto = nombreUsu + " " + apellidoUsu;

    String nombreCor = nombreUsu.substring(0, 2);

    String nombreApellido = nombreCor + apellidoUsu;

    System.out.println("La longitud de su nombre es " + longitudNombre);

    System.out.println("La longitud de su apellido es " + longitudApellido);

    System.out.println("su nombre en mayúsculas es " + nombreMayuscula);

    System.out.println("su apellido en minúsculas es " + apellidoMinuscula);

    System.out.println("su nombre completo es " + nombreCompleto);

    System.out.println("Las dos primeras letras de su nombre y su apellido son " + nombreApellido);

    lectura.close();

  }

}