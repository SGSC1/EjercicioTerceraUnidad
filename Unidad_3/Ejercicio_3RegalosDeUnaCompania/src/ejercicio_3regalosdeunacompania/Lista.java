
package ejercicio_3regalosdeunacompania;


public class Lista {
    

    protected Nodo inicio, fin; //Punteros para saber donde está el inicio y el fin
    public Lista() {
        inicio= null;
        fin= null;
    }
    
    //Metodo para agragar un nodo al inicio de la lista
    public void AgregarAlInicio(String d, String t) {
        //Creando al nodo
        inicio = new Nodo(d, t, inicio);
        if (fin==null){
            fin=inicio;
        }
    }
    
    //Metodo para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer=inicio;
        while(recorrer!=null){
            System.out.print("["+recorrer.Nombre+", "+recorrer.Telefono+"]-->");
            recorrer=recorrer.siguiente;
        }
    }
}

