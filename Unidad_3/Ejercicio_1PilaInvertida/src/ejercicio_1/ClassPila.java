
package ejercicio_1;



public class ClassPila
{
    char pila1[];
    int tope;
    
//constructor de pila
public ClassPila (int tamano)
    {
     pila1=new char [tamano];
     tope=0;
    }

    //Metodo Para agregar datos a la pila
public void push(char letra){
     pila1[tope]=letra;
     tope++;
    }

public void salida(){
     while (tope>0)
        {
            tope --;
System.out.println(pila1[tope]);
        }
    }
}
