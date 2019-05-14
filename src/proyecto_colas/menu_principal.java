
package proyecto_colas;

public class menu_principal {
    public static void main(String[] ar) {
        colas cola=new colas();
        cola.insertar(5);
        cola.insertar(10);
        cola.insertar(50);
        cola.imprimir();
        System.out.println("sale el primer elemento de la cola:"+cola.extraer());
        cola.imprimir();        
    }
}

