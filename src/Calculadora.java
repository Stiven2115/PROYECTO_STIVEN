import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        double num1, num2, rest, rest2;
        int op;
        System.out.println("ingrese un numero");
        num1=lectura.nextDouble();
        System.out.println("ingrese otro numero");
        num2=lectura.nextDouble();

        System.out.println("1.Suma 2.Resta 3.Multiplicacion 4.Division 5.Potencia 6.Radicacion");
        op=lectura.nextInt();

        switch(op){
            case 1:
            rest=num1+num2;
            System.out.println("La suma entre " +num1+ "mas"+num2+ "es:" +rest);
            break;

            case 2:
            rest=num1-num2;
            System.out.println("La resta entre  " +num1+ "menos" +num2+ "es" +rest);
            break;

            case 3:
            rest=num1*num2;
            System.out.println("La Multiplicacion entre" +num1+ "por" +num2+ "es:" +rest);
            break;

            case 4:
            rest=num1/num2;
            System.out.println("La Divide entre  " +num1+ "y" +num2+ "es:" +rest);
            break;

            case 5:
            rest=Math.pow(num1,num2);
            System.out.println("La pontenciacion entre  " +num1+ "y" +num2+ "es:" +rest);
            break;

            case 6:
            rest=Math.sqrt(num1);
            rest2=Math.sqrt(num2);
            System.out.println("La raiz cuadra de  " +num1+ "es" +rest+ "la raiz cuadrada de " +num2+ "es: " 
            +rest2);
            break;
        
            default:
            System.out.println("La opcion no es valida ");
            break;
        
        }

        





        lectura.close();
    }

}
