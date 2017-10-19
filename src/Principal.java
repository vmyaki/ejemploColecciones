
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Vamos a crear una colección de Strings
		ArrayList<String> listaNombres = new ArrayList<String>();
		
		//Vamos a rellenarlo
		System.out.println("Ve introduciendo nombres, y los añado a la lista:");
		String nombre ="";
		do {
			nombre = teclado.nextLine();
			listaNombres.add(nombre);
		} while (!nombre.isEmpty());
		
		//No controlamos que haya elementos, puesto que por fuerza, uno hay como mínimo (el cadena vacía)
		listaNombres.remove(listaNombres.size()-1); //Como al final se nos añade un elemento más siempre (el de cadena vacía), una solución es eliminarlo (otra sería NO añadirlo)
		
		//Vamos a recorrer la lista manualmente
		for (int i = 0; i<= listaNombres.size()-1; i++) {
			System.out.println(listaNombres.get(i));
		}
		
		System.out.println("Añadimos " + listaNombres.size() + " nombres");
		System.out.println("Hasta luego luca");
		
		
		

	}

}
