import java.util.Scanner;

public class Mandado{
	
		
	public static void main(String[] args){

		
		ListaMandado Mand1 = new ListaMandado();
		
		int menuSelect;
		Scanner insert = new Scanner(System.in);
		
		Scanner scN = new Scanner(System.in);
		Scanner scC = new Scanner(System.in);
        String elemento=null;	
		int mandado=0;
		String nameL1;
        String[]list1;
		String[] listMand1 = list1;
		
		
		
		System.out.println("Bienvenido a Winter-E-Mart");
		
		do{
			System.out.println("Por favor seleccione que accion quiere realizar:");
			System.out.println( "1.- Crear una nueva lista de mandado \n2.- Ver listas creadas \n3.- Modificar lista existente \n4.-Salir" );
			
			menuSelect = insert.nextInt();
            			
			
			switch(menuSelect){
				case 1: 
				       System.out.println("Indique el Nombre de la nueva lista a crear");
					       nameL1= scN.nextLine();					   					   
				           System.out.println("Indique el tamaño que tendra la nueva lista");	
					       int size = scC.nextInt();
						   //for(int i=0;i<size;i++){
						 	//mandado=scC.nextInt();   
						   list1=new String[size];
						for(int i=0;i<list1.length;i++){
						    System.out.println("Anote en la lista el elemento " + (i+1));
							elemento=scC.next();
							list1[i]=elemento;
							if(i==list1.length){
								list1[i]=elemento;
							}																
						
                         //System.out.println(list1[i]);					  
					   }					   					   					   
					   break;
					   
				case 2: 
				       System.out.println("Indique la Lista que quiere revisar");
                       //guardLista1(ListMand1, nameL1);
					   
				       break;
					   
				case 3:
                       break;
					   
                case 4: 
                        System.exit(0);
                        default:						
                              System.out.println("Esa no es una opción");							  					   					   					   					 				
				
			}
			
			
			
		} while (menuSelect!=5);
		
		
	}
	
	/*public void guardLista1(String[] listaGuardada, String nombre){
		
		Scanner subMenu = new Scanner(System.in);
		int menuListas;
		
		nameL1 =  nombre;
		String[] lstNu1 = listaGuardada;
		menuListas = subMenu.nextInt();
		
		
	           switch(menuListas){
								
								case 1: System.out.println(nameL1);
								          
								     for (int i=0;i<lstNu1.length;++i){
								     System.out.println(lstNu1.get(i));
									 }
								     break;
								/*case nameL2: System.out.println(list2[i]);
								     break;
								case nameL3: System.out.println(list3[i]);
								     break;	 
	                            case 2:   
                                  System.exit(0);                                      
                                    default:
                                        System.out.println("Regresamos al inicio");
			   }
	}*/
	

	
	
}
