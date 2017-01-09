import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BotonRojo extends JPanel{
	
public BotonRojo(){
	setBorder(BorderFactory.createTitledBorder(null,null,1,2,new Font("Arial", 0, 12),Color.BLACK  ));
	setBackground(Color.RED);
}


}
