package co.edu.poli.proyecto.vista;


import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		//Menu
		System.out.println("Bienvenido al sistema de La universidad x" /* Aqui deberiamos poner un .get para que tenga el nombre de usuariuo en especifico
		 y no confundir mucho las cosas*/+"\n"+ "1. Pedir Objeto"+"\n"+"2. Read"+"\n"+"3. Update"+"\n"+"4. Delete"+"\n"+"5. Guardar Archivo"+"\n"+"6. Cargar Archivo"+"\n"+"7. Salir");
		
    	
    	Scanner in = new Scanner(System.in);
    	int opcion;
    	opcion = Integer.parseInt(in.nextLine());
    	
    	do{
    		
    		if (opcion == 1) {
    			
    			
    			
    		}
    		if (opcion == 2) {
    			
    			
    			
    		}
    		if (opcion == 3) {
    			
    		
    			
    		}
    		if (opcion == 4) {
    			
    			
    		}
    		if (opcion == 5) {
    			
    			
    			
    		}
    		if (opcion == 6) {
    		
    		}
   
    		System.out.println("Elija una opción:"+"\n"+ "1. Pedir Objeto"+"\n"+"2. Read"+"\n"+"3. Update"+"\n"+"4. Delete"+"\n"+"5. Guardar Archivo"+"\n"+"6. Cargar Archivo"+"\n"+"7. Salir");
        	
        	
        	opcion = Integer.parseInt(in.nextLine()); 
    	}while(opcion != 7);
    	System.out.println("Gracias");
    	
    	
    	in.close();
    	
    	
    	
    	
    	

	}
		
	}

