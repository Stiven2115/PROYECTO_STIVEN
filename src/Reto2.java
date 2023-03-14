import java.util.*;


public class Reto2 {
    



    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double peso;
        int  meses;
        System.out.println("ingrese los meses del bebe ");
        meses= lectura.nextInt();
        System.out.println("ingrese el peso del bebe ");
        peso= lectura.nextDouble();
        double vacuna=(peso+10)/(meses*10)*8;
        System.out.println("La dosis permitida para aplicarle al bebe es  "+vacuna);
        
        lectura.close();
    
}
}

