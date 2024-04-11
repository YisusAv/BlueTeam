import java.util.Arrays;

public class Frutero{

      public static void main(String[] args){
               
            String[] Frutero = new String[5];
            String[] sinFruta = new String[Frutero.length-1];
            String[] frutaNueva = new String[sinFruta.length+1];

            Frutero[0] = "Manzána";
            Frutero[1] = "Guayaba";
            Frutero[2] = "Limón";
            Frutero[3] = "Pera";
            Frutero[4] = "Uva";

            String nuevaFruta = "Kiwi";
            String cambioFruta = "Coco";

System.out.println("\n");
System.out.println("Lista original:" + Arrays.toString(Frutero));
System.out.println("\n");

System.out.println("---------QUITAMOS LA PERA------------------" + "\n");

            sinPera(Frutero, sinFruta);

System.out.println("------------PONEMOS EL KIWI---------------" + "\n");

            ponerFruta(sinFruta, frutaNueva, nuevaFruta);

System.out.println("------------CAMBIAMOS UNA FRUTA---------------" + "\n");

            cambiaFruta(frutaNueva, cambioFruta);


System.out.println("------------CAMBIAMOS DE LUGAR COCO Y UVA---------------" + "\n");

            reOrdenar(frutaNueva, Frutero);

System.out.println("---------------------------" + "\n");

         



       }   /*SE TERMINO EL MAIN*/
               
    //QUITAMOS LA PERA

        public static String[] sinPera(String[] Frutero, String[] sinFruta){    
              

                for(int i=0; i<sinFruta.length; i++){                        
                     
                       if(i<3){
                         sinFruta[i] = Frutero[i];
                       } else if (i==3){
                         sinFruta[i] = Frutero[i+1];
                       } 
                         System.out.println(sinFruta[i]);
                 }

                 return sinFruta;

        }

     //AGREGAMOS NUEVA FRUTA

        public static String[] ponerFruta(String[] sinFruta, String[] frutaNueva, String fruta){

                 for(int i=0; i<frutaNueva.length; i++){
                     
                       if(i<sinFruta.length){
                         frutaNueva[i] = sinFruta[i];
                       } else {
                         frutaNueva[i] = fruta;
                       } 
                         System.out.println(frutaNueva[i]);

                 }

                 return frutaNueva;

        }

     //CAMBIAMOS UNA FRUTA
        
        public static String[] cambiaFruta(String[] frutaNueva, String fruta){

                 for(int i=0; i<frutaNueva.length; i++){
                     if(i<1){
                       frutaNueva[i] = fruta;
                     } else{
                       frutaNueva[i] = frutaNueva[i];
                     }
                       System.out.println(frutaNueva[i]);    

                 }

                 return frutaNueva;

        }

     //RE ORDENAMOS EL FRUTERO

        public static String[] reOrdenar(String[] frutaNueva, String[] Frutero){

                 for(int i=0; i<Frutero.length; i++){
                     if(i<1){
                       Frutero[i] = frutaNueva[3];
                     }else if (i<3){
                       Frutero[i] = frutaNueva[i];
                     }else if (i==3){
                       Frutero[i] = frutaNueva[i-3];  
                     }else {
                       Frutero[i] = frutaNueva[i];  
                     }
                       System.out.println(Frutero[i]);
                 }
  
                 return Frutero;
         }

}  
               