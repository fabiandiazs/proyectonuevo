/**
 * 
 */
package nuevoproyecto2;

/**
 * clase principal
 * @author Fabian Diaz
 * @version 1.0 13/09/2016
 */
public class Main {

	/**
	 * funcion principal - inicia el programa
	 * @param args -
	 */
	public static void main(String[] args) {
		//Declarar 
		Sillon silloncito1;
		Sillon silloncito2;
		
		
		//Instanciar
		silloncito1 = new Sillon();
		silloncito2 = new Sillon("Samsung", 50, 150000, 200, "fierro", 2);
		//MOdificar
		silloncito1.setAltura(100);
		silloncito1.setCapacidad(3);
		silloncito1.setCosto(150);
		silloncito2.setFabricante("Madensa");
		//obtener
		//System.out.println(silloncito1.getAltura());
		//System.out.println(silloncito1.getCapacidad());
		System.out.println(silloncito2.getFabricante());

	}

}
