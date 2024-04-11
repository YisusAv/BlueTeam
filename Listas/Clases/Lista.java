package Clases;

public class Lista {
    private String nombre;
    private String[] elementos;
    
    public Lista(String nombre, int numElementos) {
        this.nombre = nombre;
        this.elementos = new String[numElementos];
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setElemento(int indice, String elemento) {
        this.elementos[indice] = elemento;
    }
    
    public String getElemento(int indice) {
        return elementos[indice];
    }
    
    public int getNumElementos() {
        return elementos.length;
    }
}