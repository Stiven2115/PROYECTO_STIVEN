import java.util.Random;

public class Reto6 {

  public static void main(String[] args) {

    Random rand = new Random();

    System.out.println(" que comienze el juego " );

    int dado1 = rand.nextInt(6) + 1;

    int dado2 = rand.nextInt(6) + 1; 

    int totalDado = dado1 + dado2; 

    System.out.println("Lanzamiento: " + dado1 + " + " + dado2 + " = " + totalDado);

    if (totalDado == 2 || totalDado == 12) {

      System.out.println("ha ganado, el resultado de los dados es " + totalDado);

    } else if (totalDado == 3 || totalDado== 11) {

      System.out.println("ha ganado, el resultado de los dados es " + totalDado);

    } else if (totalDado == 7) {

      System.out.println("ha ganado, el resultado de los dados es " + totalDado);

    } else if (dado1 == 1 && dado2 == 1) {

      System.out.println("ha ganado, el resultado de los dados es " + totalDado);

    } else {

      System.out.println("has perdido, el resultado de los dados es " + totalDado);

    }

  }

}

