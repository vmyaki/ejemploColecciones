
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Vamos a crear una colecci�n de Strings
		ArrayList<String> listaNombres = new ArrayList<String>();
		
		//Vamos a rellenarlo
		System.out.println("Ve introduciendo nombres, y los a�ado a la lista:");
		String nombre ="";
		do {
			nombre = teclado.nextLine();
			listaNombres.add(nombre);
		} while (!nombre.isEmpty());
		
		//No controlamos que haya elementos, puesto que por fuerza, uno hay como m�nimo (el cadena vac�a)
		listaNombres.remove(listaNombres.size()-1); //Como al final se nos a�ade un elemento m�s siempre (el de cadena vac�a), una soluci�n es eliminarlo (otra ser�a NO a�adirlo)
		
		//Vamos a recorrer la lista manualmente
		for (int i = 0; i<= listaNombres.size()-1; i++) {
			System.out.println(listaNombres.get(i));
		}
		
		System.out.println("A�adimos " + listaNombres.size() + " nombres");
		System.out.println("Hasta luego luca");
		
		
		

	}

}
