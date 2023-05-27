package s3t1n1;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Undo {
	
	//Creem un objecte private
	private static Undo instance;
	
	// Constructor private
	private Undo() {
	}
	
	//Obtenim la llista mitjan�ant el m�tode
	public static Undo getInstance() {
		if(instance == null) {
			instance = new Undo();
		}
		return instance;
	}
	
	private ArrayList<String> comandes = null;
	
	//M�tode per afegir les comandes
	public ArrayList<String> setComandes() {
		
		if (comandes == null) {
		
			comandes = new ArrayList<String>();
			
			//Demanem input a l'usuari per ficar cada comanda
			while (true) {
				
				String comanda = JOptionPane.showInputDialog("Introdueix una comanda");
				comandes.add(comanda);
				
				if (comanda.equals("")) {
					break;
				}
			}
		}
		return comandes;
	}
	
	//M�tode per borrar comandes
	public ArrayList<String> borrarComandes(String comanda){
		
		comandes.remove(comanda);
		
		return comandes;
	}
	
	//M�tode per obtenir les comandes
	public ArrayList<String> getComandes() {
		
		return comandes;
	}
}