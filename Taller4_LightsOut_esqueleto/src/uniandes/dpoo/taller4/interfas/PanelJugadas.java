package uniandes.dpoo.taller4.interfas;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import uniandes.dpoo.taller4.modelo.Tablero;

@SuppressWarnings("serial")
public class PanelJugadas extends JPanel {
	private JLabel label;
	private InterfazLightsOut ventana;
	private Tablero Tablero;
	public  JTextArea jugadas; 
	private String jugadas2;
	private String jugador2;
	public  JTextArea jugadorta; 
	
	public PanelJugadas(InterfazLightsOut pVentana ) {
		ventana=pVentana; 
		
		setBackground(Color.pink);
		setLayout( new GridLayout( 1, 20, 1, 1) );
		label = new JLabel("JUGADAS: ");
		label.setBounds(10,10,5,30);
		add(label);
		jugadas = new JTextArea( );
        jugadas.setEditable( false );
        jugadas.setLineWrap( true );
        jugadas.setText(jugadas2);
        add(jugadas);
		setBackground(Color.pink);
		setLayout( new GridLayout( 1, 20, 1, 1) );
		label = new JLabel("JUGADORES: ");
		label.setBounds(10,10,5,30);
		add(label);
		jugadorta = new JTextArea( );
		jugadorta.setEditable( false );
		jugadorta.setLineWrap( true );
		jugadorta.setText( jugador2 );
        add(jugadorta);
		}
	
	public void setjugadas() {
		jugadas2= ""+Tablero.darJugadas();
	}
	   public void setJugador(String nombre) {
	        jugadorta.append(nombre);
	    }
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
