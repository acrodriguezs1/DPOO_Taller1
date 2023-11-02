package uniandes.dpoo.taller4.interfas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class DialogoFinal  extends JFrame implements ActionListener{
	private InterfazLightsOut ventana;
	public final static String AGREGAR = "AGREGAR";
	private JButton bagregar;
	private String nombreIngresado;
	public DialogoFinal (InterfazLightsOut pVentana) {
		ventana=pVentana;
		
	 	setTitle("Nuevo jugador nombre");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JPanel panelInfo1 = new JPanel( );
        panelInfo1.setLayout( new GridLayout( 8, 1 ) );
        panelInfo1.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
        panelInfo1.setBackground(Color.PINK);
        add(panelInfo1,BorderLayout.CENTER);
        JLabel label = new JLabel("Ingrese su nombre: ");
        panelInfo1.add(label);
        // Crear un JTextField
        JTextField textField = new JTextField();
       
        // Agregar el JTextField al JFrame
        panelInfo1.add(textField);
        bagregar = new JButton( "AGREGAR" );
        bagregar.setActionCommand( AGREGAR );
        bagregar.addActionListener( this );
        bagregar.setPreferredSize( new Dimension( 1, 1 ) );
        panelInfo1.add( bagregar );
        nombreIngresado = textField.getText();
        System.out.println(nombreIngresado);
       
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String comando = e.getActionCommand( );
		if (comando.equals(AGREGAR)) {
			ventana.CambiarJugador(nombreIngresado);
			System.out.println(nombreIngresado);
		}

	}

}
