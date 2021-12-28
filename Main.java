package Reto2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
		Inventario inventario = new Inventario(lista);
		Scanner entrada = new Scanner(System.in);
		boolean b=true;
		System.out.println("Digite el comando");
		String comando = entrada.nextLine();
		  if(comando.startsWith("1")){
	    	  inventario.ProcesarComandos(comando);
		  }else{
	    	  b=false;
	    	  
		  }
	    	  do{
	    			System.out.println("Digite el comando");
	    			String comando2 = entrada.nextLine();
	    			inventario.ProcesarComandos(comando2);
	    			  if(comando2.startsWith("3")){
	    				  System.out.println("fin del programa");
		    		    	  b=false;
	    	  }
	    	  }while(b);
    
      
     
    	  

      }
      
    }
