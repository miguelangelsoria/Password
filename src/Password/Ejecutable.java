package Password;

import java.swing.JOptionPanel;

public class Ejecutable {

	
	 public class PasswordApp {
	   }
	  
	public static void main(String[] args) {
	        // TODO code application logic here
	    
	        //Introducimos el tama�o del array y la longitud del password
	        
	     
	        String texto=JOptionPane.showInputDialog("Introduce un tama�o para el array");
	        int tamanio=Integer.parseInt(texto);
	  
	        texto=JOptionPane.showInputDialog("Introduce la longitud del password");
	        int longitud=Integer.parseInt(texto);

	        //Creamos los arrays
	        Password listaPassword[]=new Password[tamanio];
	        boolean fortalezaPassword[]=new boolean[tamanio];
	  
	        //Creamos objetos, indicamos si es fuerte y mostramos la contrase�a y su fortaleza.
	        for(int i=0;i<listaPassword.length;i++){
	            listaPassword[i]=new Password(longitud);
	            fortalezaPassword[i]=listaPassword[i].esFuerte();
	            System.out.println(listaPassword[i].getContrase�a()+" "+fortalezaPassword[i]);
	        
	        }
	        
	}
	  

	}

