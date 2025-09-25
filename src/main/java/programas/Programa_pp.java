
package programas;

import java.util.Scanner;

public class Programa_pp {
       public static void main (String[] args) {
        
        //declarar variables
        String nombre;
        String apellido;
        double ht, th, sb, des, sn;
        Scanner lectura = new Scanner(System.in);
        
        //entradas
        System.out.print("Nombre: ");
        nombre=lectura.next();
        
        System.out.print("Apellido: ");
        nombre=lectura.next();
        
        System.out.print("Horas Trabajadas: ");
        ht=lectura.nextDouble();
        
        System.out.print("Tarifa por Hora: ");
        th=lectura.nextDouble();
        
        //proceso de datos
        sb=ht*th;
        des=sb*0.13;
        sn=sb-des;
        
        //salida de datos
        System.out.println("Sueldo Bruto: "+sb);
        System.out.println("Descuento: "+des);
        System.out.println("Sueldo Neto: "+sn);
        
    }
}
