package ejercicio_3regalosdeunacompania;

import java.util.Scanner;

/*Se tiene una lista con los datos de los clientes de una compañía de telefonía celular, 
los cuales pueden aparecer repetidos en la lista, si tienen registrado más de un número telefónico. 
La compañía para su próximo aniversario desea enviar un regalo a sus clientes, sin repetir regalos a un mismo cliente. 
Los regalos se encuentran almacenados en una pila de regalos. Se desea elaborar un programa que permita generar 
una nueva estructura donde los clientes aparezcan sólo una vez con sus regalos asignados. Se sugiere usar una lista de objetos.
 */


public class Ejercicio_3RegalosDeUnaCompania {

  
    public static void main(String[] args) {
      int opcion=0;
        String Nom, Tel;
        Lista l = new Lista();
        Scanner Teclado=new Scanner(System.in);
        do {
            System.out.println ("====MENU DE OPCIONES====");
            System.out.println ("1. Agregar datos");
            System.out.println ("2. Visualizar lista de datos de cientes");
            System.out.println ("3. Visualizar pila de regalos");
            System.out.println ("4. Lista de clientes con regalos");
            System.out.print ("Introduce el número de tu opción: ");
            opcion=Teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println ("\nINGRESA LOS DATOS");
                    System.out.println ("Nombre: ");
                    Nom=Teclado.next();
                    System.out.println ("Telefono: ");
                    Tel=Teclado.next();
                    l.AgregarAlInicio(Nom, Tel);
                    break;
                case 2:
                    System.out.println ("Lista de datos de clientes registrados");
                    l.mostrarLista();
                    System.out.println ();
                    break;
                case 3:
                    break;
                default: 
                    System.out.println("\nOpcion incorrecta");
            }
        }while(opcion!=3);
    }
    
}

  