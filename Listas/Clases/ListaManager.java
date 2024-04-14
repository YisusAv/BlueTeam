package Clases;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaManager {
	//no se si se pueda utilizar tengo que investigar como sustituirlo
	
	/*Instanciacion de un arreglo de arreglos*/
    private ArrayList <Lista> listas = new ArrayList<>();
    
	/*Metodo setter para crear lista*/
	/*Tipo de dato Scanner*/
	
	
	
    public void crearLista(Scanner scanner) {
        System.out.print("Ingrese el nombre de la lista: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el número de elementos: ");
        int numElementos = scanner.nextInt();
        
        Lista lista = new Lista(nombre, numElementos);
        for (int i = 0; i < numElementos; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            String elemento = scanner.next();
			
			/*Invocación al metodo setElemento de la del objeto lista*/
            lista.setElemento(i, elemento);
       

	   }
        // esto no lo hemos visto es propio de arraylit
		// .add es método dentro de la clase ArrayList
        listas.add(lista);
		
		// 0 lista
		// 1 lista 2
		// 2 lista 3
		
		
    }
    
    public void verListas() {
        System.out.println("\nListas creadas:");
        for (int i = 0; i < listas.size(); i++) {
            System.out.println((i + 1) + ". " + listas.get(i).getNombre()); //. get(int) le decimos que elemento del arreglo queremos trabajar y .getNombre son propios de arrayList
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione una lista para ver sus elementos: ");
        int indiceLista = scanner.nextInt();
        
		/*Lista con L mayuscula es tipo de dato*/
        Lista listaSeleccionada = listas.get(indiceLista - 1);
		
		
        System.out.println("\nElementos de la lista " + listaSeleccionada.getNombre() + ":");
        for (int i = 0; i < listaSeleccionada.getNumElementos(); i++) {
            System.out.println((i + 1) + ". " + listaSeleccionada.getElemento(i));
        }
    }
	
	
    
	public void modificarLista(Scanner scanner) {
    System.out.println("\nListas creadas:");
    for (int i = 0; i < listas.size(); i++) {
        System.out.println((i + 1) + ". " + listas.get(i).getNombre());
    }

    System.out.print("Seleccione una lista para modificar: ");
    int indiceLista = scanner.nextInt();
    Lista listaSeleccionada = listas.get(indiceLista - 1);
	
	
	/*Impresión de lista seleccionada para modificar Yisus Avila*/
	System.out.println("\nLa lista seleccionada es " + listaSeleccionada.getNombre() + ":");
        for (int i = 0; i < listaSeleccionada.getNumElementos(); i++) {
            System.out.println((i + 1) + ". " + listaSeleccionada.getElemento(i));
        }
	
	
	

    System.out.println("\n¿Qué acción desea realizar en la lista " + listaSeleccionada.getNombre() + "?");
    System.out.println("1. Cambiar de lugar un elemento");
    System.out.println("2. Actualizar el nombre de un elemento");
    System.out.println("3. Borrar un elemento");
    System.out.println("4. Agregar un nuevo elemento");
    System.out.print("Seleccione una opción: ");
    int opcion = scanner.nextInt();

    switch (opcion) {
        case 1:
            // Cambiar de lugar un elemento
            System.out.print("Ingrese el índice del elemento que desea mover: ");
            int indiceElemento = scanner.nextInt();
            System.out.print("Ingrese la nueva posición para el elemento: ");
            int nuevaPosicion = scanner.nextInt();
            if (indiceElemento >= 1 && indiceElemento <= listaSeleccionada.getNumElementos()
                    && nuevaPosicion >= 1 && nuevaPosicion <= listaSeleccionada.getNumElementos()) {
               

			   String elemento = listaSeleccionada.getElemento(indiceElemento - 1);
                listaSeleccionada.setElemento(indiceElemento - 1, null); // Este null se debe de cambiar por el elemento del índice seleccionado
				
                if (indiceElemento < nuevaPosicion) {
                    for (int i = indiceElemento; i < nuevaPosicion; i++) {
                        String temp = listaSeleccionada.getElemento(i);
                        listaSeleccionada.setElemento(i, elemento);
                        elemento = temp; // temp es porque es una variable que se usa de manera "temporal"
                    }
                } else {
                    for (int i = indiceElemento - 2; i >= nuevaPosicion - 1; i--) {
                        String temp = listaSeleccionada.getElemento(i);
                        listaSeleccionada.setElemento(i, elemento);
                        elemento = temp; // temp es porque es una variable que se usa de manera "temporal"
                    }
                }
            } else {
                System.out.println("Índices inválidos. No se realizó ningún cambio.");
            }
			
			// Para impresión cada que hay un cambio YisusAvila
			System.out.println("\nLa lista nueva de " + listaSeleccionada.getNombre() + " es :");
			for (int i = 0; i < listaSeleccionada.getNumElementos(); i++) {
            System.out.println((i + 1) + ". " + listaSeleccionada.getElemento(i));
			}
	
			
			
            break;
        case 2:
            // Actualizar el nombre de un elemento
            System.out.print("Ingrese el índice del elemento que desea actualizar: ");
            int indiceActualizar = scanner.nextInt();
            System.out.print("Ingrese el nuevo nombre para el elemento: ");
            String nuevoNombre = scanner.next();
            if (indiceActualizar >= 1 && indiceActualizar <= listaSeleccionada.getNumElementos()) {
                listaSeleccionada.setElemento(indiceActualizar - 1, nuevoNombre);
            } else {
                System.out.println("Índice inválido. No se realizó ninguna actualización.");
            }
			
			// Para impresión cada que hay un cambio YisusAvila
			System.out.println("\nLa lista nueva de " + listaSeleccionada.getNombre() + " es:");
			for (int i = 0; i < listaSeleccionada.getNumElementos(); i++) {
            System.out.println((i + 1) + ". " + listaSeleccionada.getElemento(i));
			}
			
            break;
        case 3:
            // Borrar un elemento
            System.out.print("Ingrese el índice del elemento que desea borrar: ");
            int indiceBorrar = scanner.nextInt();
            if (indiceBorrar >= 1 && indiceBorrar <= listaSeleccionada.getNumElementos()) {
               /* for (int i = indiceBorrar - 1; i < listaSeleccionada.getNumElementos()-1; i++) {
                    listaSeleccionada.setElemento(i, listaSeleccionada.getElemento(i));
                }*/

                /*listaSeleccionada.setElemento(listaSeleccionada.getNumElementos()-1, null);*/
				listaSeleccionada.setElemento(indiceBorrar-1, null); // Modificación YisusAvila estaba mal lo comentado arriba de esta línea
            } else {
                System.out.println("Índice inválido. No se realizó ninguna eliminación.");
            }
			
			// Para impresión cada que hay un cambio YisusAvila (Se puede meter en un método)
			System.out.println("\nLa lista nueva de " + listaSeleccionada.getNombre() + " es:");
			for (int i = 0; i < listaSeleccionada.getNumElementos(); i++) {
            System.out.println((i + 1) + ". " + listaSeleccionada.getElemento(i));
			}
			
            break;
        case 4:
            // Agregar un nuevo elemento
            System.out.print("Ingrese el nuevo elemento: ");
            String nuevoElemento = scanner.next();
            String[] nuevosElementos = new String[listaSeleccionada.getNumElementos() + 1];
            for (int i = 0; i < listaSeleccionada.getNumElementos(); i++) {
                nuevosElementos[i] = listaSeleccionada.getElemento(i);
            }
            nuevosElementos[nuevosElementos.length - 1] = nuevoElemento;
            //listaSeleccionada.setElementos(nuevosElementos);
			listaSeleccionada.setElemento(nuevosElementos.length - 1, nuevoElemento);
            
			// Para impresión cada que hay un cambio YisusAvila
			System.out.println("\nLa lista nueva de " + listaSeleccionada.getNombre() + " es:");
			for (int i = 0; i < listaSeleccionada.getNumElementos(); i++) {
            System.out.println((i + 1) + ". " + listaSeleccionada.getElemento(i));
			}
			
			break;
        default:
            System.out.println("Opción no válida. No se realizó ninguna acción.");
            break;
		}
	}
}
   
