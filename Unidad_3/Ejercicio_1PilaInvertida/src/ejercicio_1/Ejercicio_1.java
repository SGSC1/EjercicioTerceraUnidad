package ejercicio_1;

/*Invertir de forma inversa los datos introducido en una pila*/


import java.util.Scanner; 
public class Ejercicio_1 {

    
   public static void main(String[] args) 
   {
       
   Scanner teclado = new Scanner(System.in);
            System.out.print("Ingresa palabra o frase: ");
   String cadena = teclado.nextLine();
   ClassPila p= new ClassPila(cadena.length());
        for (int i=0;i<cadena.length();i++)
        
    {
        p.push(cadena.charAt(i));
    }
            System.out.println("");
            System.out.println("El orden inverso de los datos introducidos es: ");
            System.out.println("");
                    p.salida();
            System.out.println("");
            
}
    }
