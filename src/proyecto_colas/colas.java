package proyecto_colas;


public class colas {
    //creamos un nodo
    class Nodo {
        int info;
        Nodo sig;
    }
    
    private Nodo raiz,fondo;
    //creamos un constructor
    colas() {
        raiz=null;
        fondo=null;
    }
    //metodo para ver si esta vacia
    boolean vacia (){
        if (raiz == null)
            return true;
        else
            return false;
    }

    void insertar (int info)
    {
        Nodo nuevo= new Nodo ();
        nuevo.info = info;
        nuevo.sig = null;
        if (vacia ()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }

    ///extraemos un elemento de la cola
    int extraer ()
    {
        if (!vacia ())
        {
            int informacion = raiz.info;
            if (raiz == fondo){
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.sig;
            }
            return informacion;
        } else
            return Integer.MAX_VALUE;
    }
    //imprimimos en pantalla toda la cola
    public void imprimir() {
        Nodo recorrer=raiz;
        System.out.println("Elementos de la cola");
        while (recorrer!=null) {
            System.out.print(recorrer.info+"-");
            recorrer=recorrer.sig;
        }
        System.out.println();
    }
       
}
        
    
