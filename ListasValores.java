import java.util.Scanner;

	public class ListasValores{

	public static void main(String [] args){

		int opcion;

		do{
		System.out.println("Selecione la opción deseada" + "\n" + "1.Crear Lista" + "\n" + "2. Ver Listas" +"\n" + "3. Modificar Lista" + "\n" + "4.Salir");		
		Scanner sc2 = new Scanner(System.in);
		opcion = sc2.nextInt();
	
	
		switch(opcion){
		
				case 1: 
				/*Llamada de al método*/
				int cantidadValores = cantidadListasAgregar();
				System.out.println("Cantidad de valores = " + cantidadValores);
				String nombreLista = nombreListasAgregar();

				break;

				default: System.out.println("No jala");		
				break;

			}
		}
			while(opcion!=4);

	}

	static int cantidadListasAgregar(){
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Ingrese la cantidad de listas a agregar");
	int cantidadValores = sc1.nextInt();
	return cantidadValores;
	}

	
	static String nombreListasAgregar(){
	Scanner sc3 = new Scanner(System.in);
	System.out.println("Ingrese el nombre de la lista");
	String nombreLista= sc3.nextLine();
	return nombreLista;
	}


}


/*Métodos*/

	
	
	
	

