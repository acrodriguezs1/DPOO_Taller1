package uniandes.dpoo.taller4.interfas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



@SuppressWarnings("serial")
public class PanelOpciones extends JPanel implements ActionListener{

	
	
	
	
	//opcion nuevo 
	public final static String NUEVO = "NUEVO";
	public final static String REINICIAR="REINICIAR";
	public final static String TOP10 ="TOP-10";
	public final static String CAMBIARJUGADOR="CAMBIAR JUGADOR";
	//botones
	private JButton bnuevo;
	private JButton breiniciar;
	private JButton btop10;
	private JButton bcambiarjugador;
	
	//ventana
	private InterfazLightsOut ventana;
	//"main"
	public PanelOpciones(InterfazLightsOut pVentana) {
		// Guarda la referencia a la ventana padre
        ventana = pVentana;

        // Color de fondo del componente
        setBackground(Color.pink);
        //tamanio grid
        setLayout( new GridLayout( 6, 20, 0, 8) );
        setBorder( new EmptyBorder( 125, 5, 5, 5 ) );
        //boton nuevo 
        bnuevo = new JButton( "NUEVO" );
        bnuevo.setActionCommand( NUEVO );
        bnuevo.addActionListener( this );
        bnuevo.setPreferredSize( new Dimension( 100, 20 ) );
        add( bnuevo );
        //boton reiniciar
        breiniciar = new JButton( "REINICIAR" );
        breiniciar.setActionCommand( REINICIAR );
        breiniciar.addActionListener( this );
        breiniciar.setPreferredSize( new Dimension( 100, 20 ) );
        add( breiniciar );
        //boton top10 
        btop10 = new JButton( "TOP-10" );
        btop10.setActionCommand( TOP10 );
        btop10.addActionListener( this );
        btop10.setPreferredSize( new Dimension( 100, 20 ) );
        add( btop10 );
        //boton cambiar Jugador 
        bcambiarjugador = new JButton( "CAMBIAR JUGADOR" );
        bcambiarjugador.setActionCommand( CAMBIARJUGADOR );
        bcambiarjugador.addActionListener( this );
        bcambiarjugador.setPreferredSize( new Dimension( 150, 10 ) );
        add( bcambiarjugador );
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
