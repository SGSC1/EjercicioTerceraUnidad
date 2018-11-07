package ejercicio_2depilaacola;
import java.util.Scanner;

/* Ejercicio para combiar datos de una pila a una cola*/

public class Ejercicio_2DePilaACola {

   
    public static void main(String[] args) {
        Scanner Teclado = new Scanner (System.in);
        
        Pila p = new Pila();
        Cola c = new Cola();
        System.out.println("****Introducir los elementos de una pila en una cola****");
        System.out.print ("Introduce el número de elementos a ingresar: ");
        int m = Teclado.nextInt();
        System.out.println ("\nIntroduce un dato a la pila: ");
        String e;
        for (int i=1; i<=m; i++)
        {
            System.out.print ("Posicion ["+i+"]: ");
            e=Teclado.next();
            p.insertar(e);
        }
        System.out.println ("\n----------------------------------------------------");
        System.out.println ("*******Datos pasados de una pila a una cola********");
        System.out.println ("\n----------------------------------------------------");
        
        System.out.println ("\n******Elementos de la cola*****");        
        for (int i=1; i<=m; i++)
        {
            c.insertar(p.quitar());
            System.out.println ("Posicion ["+i+"]: "+c.quitar());
        }
    }
    
}
