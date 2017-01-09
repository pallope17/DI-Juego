import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class Panel extends JFrame implements ActionListener, MouseListener {
	
	

	
	JPanel misBarcos , susBarcos, paneles, botones, estadisticasMisBarcos, estadisticasSusBarcos, estadicticas;

	JButton agua, tocado, hundido, enviar, rival;

	JMenu menuSalir, juego;
	
	JMenuBar menu ;
	
	JMenuItem salir, reiniciar, reglas;

	JLabel num1, num2, num3, num4, num1_2, num2_2, num3_2, num4_2, barco1_2, barco2_2, barco3_2, barco4_2, infoBotones, valorPanel;
	
	JToggleButton barco1, barco2, barco3, barco4;
	
	Object [][] arrayMisBotones;
	
	Object [][] arraySusBotones;
	
	String posicionY, posicionX;
	
	String letras[]={"A","B","C","D","E","F","G","H","I","J"};
	
	int numeros []={1,2,3,4,5,6,7,8,9};
	
	int random1, random2;
	

	int [][] susDatos={
			{0,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,3,0,0,1,0,0},
			{4,2,2,0,3,0,0,0,0,0},
			{4,0,0,0,3,0,0,2,0,0},
			{4,1,0,0,0,0,0,2,0,0},
			{4,0,0,0,0,0,0,0,0,0},
			{0,2,0,0,0,1,0,0,3,0},
			{0,2,0,0,0,0,0,0,3,0},
			{0,0,0,1,0,0,0,0,3,0},
			{0,0,0,0,0,0,0,0,0,0},
	};
	
	int [][] misDatos={
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
	};
	
	
	
	public Panel(){
		super("Hundir la Flota");
		iniciarGUI();
		
	}

	
	public void iniciarGUI(){
		
		
		
		menu= new JMenuBar();
		juego= new JMenu("Juego");
		menuSalir= new JMenu("Ayuda");
		salir=new JMenuItem("Salir");
		reiniciar=new JMenuItem("Reiniciar Juego");
		reglas= new JMenuItem("Reglas");

		
		
		setJMenuBar(menu);
		menu.add(juego);
		menu.add(menuSalir);
		
		juego.add(reiniciar);
		
		
		menuSalir.add(salir);
		menuSalir.addSeparator();
		menuSalir.add(reglas);
		
		reglas.addActionListener(this);
		salir.addActionListener(this);
	
		
	
		setLayout(new BoxLayout(this.getContentPane(),BoxLayout.PAGE_AXIS));
		
		paneles= new JPanel();
		paneles.setLayout(new BoxLayout(paneles, BoxLayout.LINE_AXIS));
		
		misBarcos= new JPanel(new GridLayout(11, 11));
		
		
		
		
	
		
		misBarcos.add(new JLabel(""));
		misBarcos.add(new JLabel("A"));
		misBarcos.add(new JLabel("B"));
		misBarcos.add(new JLabel("C"));
		misBarcos.add(new JLabel("D"));
		misBarcos.add(new JLabel("E"));
		misBarcos.add(new JLabel("F"));
		misBarcos.add(new JLabel("G"));
		misBarcos.add(new JLabel("H"));
		misBarcos.add(new JLabel("I"));
		misBarcos.add(new JLabel("J"));
		
		arrayMisBotones= new Object[10][10];
		

		
			for(int i=0;i<arrayMisBotones.length;i++){
				arrayMisBotones[i][0]= new JLabel(String.valueOf(i));
				
				misBarcos.add((JLabel)arrayMisBotones[i][0]);
				for(int j=0;j<arrayMisBotones[i].length;j++){
					
				
					
					arrayMisBotones[i][j]= new JButton();
					((JButton)arrayMisBotones[i][j]).setBackground(Color.BLUE);
				((JButton)arrayMisBotones[i][j]).addActionListener(this);
					misBarcos.add((JButton)arrayMisBotones[i][j]);
					((JButton)arrayMisBotones[i][j]).setActionCommand(i+","+j);
				}
			
			}
		
			
		
			
		
		misBarcos.setBorder(BorderFactory.createTitledBorder(null," Mis Barcos ",1,2,new Font("Arial", 0, 12),Color.BLACK  ));
		
		susBarcos= new JPanel(new GridLayout(11, 11));
		
	
		
		susBarcos.add(new JLabel(""));
		susBarcos.add(new JLabel("A"));
		susBarcos.add(new JLabel("B"));
		susBarcos.add(new JLabel("C"));
		susBarcos.add(new JLabel("D"));
		susBarcos.add(new JLabel("E"));
		susBarcos.add(new JLabel("F"));
		susBarcos.add(new JLabel("G"));
		susBarcos.add(new JLabel("H"));
		susBarcos.add(new JLabel("I"));
		susBarcos.add(new JLabel("J"));
		
		

		arraySusBotones= new Object[10][10];
		
		for(int i=0;i<arraySusBotones.length;i++){
			arraySusBotones[i][0]= new JLabel(String.valueOf(i));
			susBarcos.add((JLabel)arraySusBotones[i][0]);
			
			for(int j=0;j<arraySusBotones[i].length;j++){
				
			
				
				arraySusBotones[i][j]= new JButton();
				((JButton)arraySusBotones[i][j]).setBackground(Color.BLUE);
			((JButton)arraySusBotones[i][j]).addActionListener(this);
			((JButton)arraySusBotones[i][j]).setActionCommand(i+","+j);
			
			susBarcos.add((JButton)arraySusBotones[i][j]);
			
			}
		
		}
			

		susBarcos.setBorder(BorderFactory.createTitledBorder(null," Sus Barcos ",1,2,new Font("Arial", 0, 12),Color.BLACK  ));
		
	
		paneles.add(misBarcos);
		paneles.add(susBarcos);
		
		add(paneles);
		
		botones= new JPanel();
		
		botones.setLayout(new BoxLayout(botones, BoxLayout.PAGE_AXIS));
	
		JPanel botonesPanel= new JPanel();
		JPanel jugada= new JPanel();
		jugada.setLayout(new BoxLayout(jugada, BoxLayout.LINE_AXIS));
		JLabel movimientos= new JLabel("¿Que movimiento deseas realizar?");
		
		jugada.add(movimientos);
		JTextField introJugada= new JTextField(10);
		//introJugada.setBounds(200, 200, 50, 20);
		jugada.add(introJugada);
		 infoBotones= new JLabel("La informacion sobre los ultimos movimientos");
	
	
		
		 tocado = new JButton("Tocado");
		 agua = new JButton("Agua");
		 hundido = new JButton("Hundido");
		 JLabel vacio= new JLabel("                     ");
		 enviar= new JButton("Enviar");
		 rival=new JButton("Turno Maquina");
		 
		 tocado.addActionListener(this);
		 agua.addActionListener(this);
		 hundido.addActionListener(this);
		 enviar.addActionListener(this);
		 rival.addActionListener(this);
		 
		 botonesPanel.add(tocado);
		 botonesPanel.add(agua);
		 botonesPanel.add(hundido);
		 botonesPanel.add(vacio);
		 botonesPanel.add(enviar);
		 botonesPanel.add(rival);
		 
		 botones.add(botonesPanel);
		 botones.add(jugada);
		 botones.add(infoBotones);
		
		
	
		
		estadicticas= new JPanel();
		estadicticas.setLayout(new BoxLayout(estadicticas, BoxLayout.LINE_AXIS));
		
	
		
		estadisticasMisBarcos= new JPanel();
		estadisticasMisBarcos.setBorder(BorderFactory.createTitledBorder(null,"Mis Barcos Hundidos",1,2,new Font("Arial", 0, 12),Color.BLACK  ));
		estadisticasMisBarcos.setLayout(new GridLayout(4, 2));
		
		num1= new JLabel("");
		
		
		
		
		estadisticasSusBarcos= new  JPanel();
		estadisticasSusBarcos.setLayout(new GridLayout(4, 2));
		estadisticasSusBarcos.setBorder(BorderFactory.createTitledBorder(null,"Sus Barcos Hundidos",1,2,new Font("Arial", 0, 12),Color.BLACK  ));
		
		
		estadicticas.add(estadisticasMisBarcos);
		estadicticas.add(estadisticasSusBarcos);
		
	
		
		num1= new JLabel("");
		
		num2= new JLabel("");
		num3= new JLabel("");
		num4= new JLabel("");
		
		barco1=new JToggleButton();
		barco2= new JToggleButton();
		barco3= new JToggleButton();
		barco4 = new  JToggleButton();
		
		ImageIcon imagen1= new ImageIcon("barco1.png");
		barco1.setIcon(imagen1);
		
		ImageIcon imagen2= new ImageIcon("barco2.png");
		barco2.setIcon(imagen2);
		
		ImageIcon imagen3= new ImageIcon("barco3.png");
		barco3.setIcon(imagen3);
		
		ImageIcon imagen4= new ImageIcon("barco4.png");
		barco4.setIcon(imagen4);
		

	
		estadisticasMisBarcos.add(num1);
		estadisticasMisBarcos.add(barco1);
		estadisticasMisBarcos.add(num2);
		estadisticasMisBarcos.add(barco2);
		estadisticasMisBarcos.add(num3);
		estadisticasMisBarcos.add(barco3);
		estadisticasMisBarcos.add(num4);
		estadisticasMisBarcos.add(barco4);
		
		
		
		num1_2= new JLabel("");
		
		num2_2= new JLabel("");
		num3_2= new JLabel("");
		num4_2= new JLabel("");
		
		barco1_2=new JLabel();
		barco2_2= new JLabel();
		barco3_2= new JLabel();
		barco4_2 = new  JLabel();
		
		ImageIcon imagen1_2= new ImageIcon("barco1.png");
		barco1_2.setIcon(imagen1);
		
		ImageIcon imagen2_2= new ImageIcon("barco2.png");
		barco2_2.setIcon(imagen2);
		
		ImageIcon imagen3_2= new ImageIcon("barco3.png");
		barco3_2.setIcon(imagen3);
		
		ImageIcon imagen4_2= new ImageIcon("barco4.png");
		barco4_2.setIcon(imagen4);
		
		estadisticasSusBarcos.add(num1_2);
		estadisticasSusBarcos.add(barco1_2);
		estadisticasSusBarcos.add(num2_2);
		estadisticasSusBarcos.add(barco2_2);
		estadisticasSusBarcos.add(num3_2);
		estadisticasSusBarcos.add(barco3_2);
		estadisticasSusBarcos.add(num4_2);
		estadisticasSusBarcos.add(barco4_2);
		
		add(botones);
		add(estadicticas);
		
		setSize(800, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			if(barco1.isSelected()){
				 String coordenadas[]= e.getActionCommand().split(",");
					
				 posicionX= coordenadas[0];
				 posicionY=coordenadas[1];
				 
					if(posicionX==coordenadas[0] && posicionY==coordenadas[1]){
						((JButton)arrayMisBotones[Integer.valueOf(posicionX)][Integer.valueOf(posicionY)]).setBackground(Color.YELLOW);
						misDatos[Integer.valueOf(posicionX)][Integer.valueOf(posicionY)]=1;
					}
						
					 
			}
					
					
					
			if(barco2.isSelected()){
						String coordenadas[]= e.getActionCommand().split(",");
						
						 posicionX= coordenadas[0];
						 posicionY=coordenadas[1];
						 
						if(posicionX==coordenadas[0] && posicionY==coordenadas[1]){
							((JButton)arrayMisBotones[Integer.valueOf(posicionX)][Integer.valueOf(posicionY)]).setBackground(Color.GREEN);
							misDatos[Integer.valueOf(posicionX)][Integer.valueOf(posicionY)]=2;
						}
						
						 
			}
					
				
			if(barco3.isSelected()){
						String coordenadas[]= e.getActionCommand().split(",");
		
						 posicionX= coordenadas[0];
						 posicionY=coordenadas[1];
						 
						if(posicionX==coordenadas[0] && posicionY==coordenadas[1]){
							((JButton)arrayMisBotones[Integer.valueOf(posicionX)][Integer.valueOf(posicionY)]).setBackground(Color.PINK);
							misDatos[Integer.valueOf(posicionX)][Integer.valueOf(posicionY)]=3;
						}
						
						
			}
					
			if(barco4.isSelected()){
						String coordenadas[]= e.getActionCommand().split(",");
						
						 posicionX= coordenadas[0];
						 posicionY=coordenadas[1];
						 
						if(posicionX==coordenadas[0] && posicionY==coordenadas[1]){
							((JButton)arrayMisBotones[Integer.valueOf(posicionX)][Integer.valueOf(posicionY)]).setBackground(Color.ORANGE);
							misDatos[Integer.valueOf(posicionX)][Integer.valueOf(posicionY)]=4;
						}
						
			}	
		
	
	
		 
			if(e.getSource()== reiniciar){
				
				 for(int i=0;i<misDatos.length;i++){
					 for(int j=0;j<misDatos[i].length;j++){
						
							
							misDatos[i][j]=0;
							if(misDatos[i][j]==0){
								((JButton)arrayMisBotones[i][j]).setBackground(Color.BLUE);
							}
					 }}
				
			}
			 
			if(e.getSource()==agua){
				infoBotones.setText("La celda que has seleccionado es agua");
			}
			
			if(e.getSource()== tocado){
				infoBotones.setText("La celda que has seleccionado ha tocado a un barco");
			}
			
			if(e.getSource()==hundido){
				infoBotones.setText("La celda que has seleccionado ha hundido un barco");
			
			}
			 
			if(e.getSource() == salir){
				System.exit(0);
			}
			

	
		
			if(e.getSource()== reglas){
			
			JOptionPane.showMessageDialog(this, new Reglas(), "Reglas", JOptionPane.QUESTION_MESSAGE);
			}
			
			if(e.getSource()==rival){
				
				random1=(int)(Math.random()*9+1);
				random2=(int)(Math.random()*9+1);
				
				String letraSeleccionada=letras[random1];
				String numeroSelecciado=String.valueOf(numeros[random2]);
				
				
				infoBotones.setText("El rival ha seleccionado la celda "+letraSeleccionada+numeroSelecciado);
			}
			
		
		 
		
		
	}
	
	
	public static void main(String[]args){
		Panel p1= new Panel();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
			
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
