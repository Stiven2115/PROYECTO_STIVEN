import java.util.Scanner;

public class operacion{

   public static void main(String[] args) { 
   
     Scanner lectura= new Scanner (System.in);
        int num1, num2, num3;
        System.out.println("ingrese el primer numero");
        num1=lectura.nextInt();
        System.out.println("ingrese el segundo numero");
        num2=lectura.nextInt();
        if(num1>num2) {num3=num1+num2; System.out.println("el numero"+num1+"es mayor que el numero"+num2+"la suma entre estos numero es"+num3);
    }
    else{
        num3=num1-num2; System.out.println("el numero"+num1+"es menor que el numero "+num2+"la resta entre estos numeros es"+num3);
    }
    lectura.close();
    
}
}