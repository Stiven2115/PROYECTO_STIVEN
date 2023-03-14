import java.util.Random;

import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        String[] opciones = {"piedra", "papel", "tijera"};

        System.out.println(" Estas jugando piedra papel o tijera, empecemos ");

        while (true) {

            System.out.print("digite (piedra, papel o tijera): ");

            String opcionUsuario = scanner.nextLine().toLowerCase();

            if (opcionUsuario.equals("salir")) {

                System.out.println("te esperamos para el próximo juego");

                break;

            }

            if (!opcionUsuario.equals("piedra") && !opcionUsuario.equals("papel") && !opcionUsuario.equals("tijera")) {

                System.out.println(" carácter no valido ");

                continue;

            }

            int opcionMaquina = random.nextInt(3);

            String opcionMaquinaStr = opciones[opcionMaquina];

            System.out.println(" el sistema arrojo" + opcionMaquinaStr);

            if (opcionUsuario.equals(opcionMaquinaStr)) {

                System.out.println("Empate");

            } else if ((opcionUsuario.equals("piedra") && opcionMaquinaStr.equals("tijera")) ||

                       (opcionUsuario.equals("papel") && opcionMaquinaStr.equals("piedra")) ||

                       (opcionUsuario.equals("tijera") && opcionMaquinaStr.equals("papel"))) {

                System.out.println(" ha ganado, felicitaciones );

            } else {

                System.out.println("has perdido");

            }

        }

        scanner.close();

    }

}