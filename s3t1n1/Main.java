package s3t1n1;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//Afegim elements a una llista demanant la instància
		Undo llista = Undo.getInstance();
		llista.setComandes();
		
		//Borrem elements en cas que es vulgui
		String borrador = JOptionPane.showInputDialog("Introdueix una comanda que vols esborrar");
		if (!borrador.equals("")) {
			llista.borrarComandes(borrador);
		}
				
		//Mostrem els elements de la llista
		for (String comanda : llista.getComandes()) {
			System.out.println(comanda);
		}
	}
}