import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Reglas extends JPanel{

	JLabel regla1;
	
	
	
	public Reglas(){
		
		regla1= new JLabel("<html>Las reglas del juego son las siguientes :<br>"
				+"1º Selecciona el tipo de barco que quieres<br>"
				+"2º Seleccionador donde quieres colocar el barco<br>"
				+"3º Una vez tienes colocados todos los barcos, empiezas a jugar y seleccionas donde quieres disparar<br>"
				+"<br>"
				+"<br>"
				+"   Gracias por descargarte este juego y espero que te lo pases bien<br></html>");
		
		add(regla1);
		
		
	}
	
}
