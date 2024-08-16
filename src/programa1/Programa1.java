package programa1;
import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        String empleado;
        double ingreso, gasto, ahorrom, ahorroa;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Nombre del empleado: ");
        empleado = lectura.next();
        
        System.out.print("Ingreso del empleado: ");
        ingreso = lectura.nextDouble();
        
        System.out.print("Gastos del empleado: ");
        gasto = lectura.nextDouble();
        
        ahorrom = ingreso - gasto;
        ahorroa = ahorrom * 12;
        
        System.out.println("Ahorro mensual: " + ahorrom);
        System.out.println("Ahorro anual: " + ahorroa);
        
        lectura.close();
        // fin de las instrucciones
    }
}

