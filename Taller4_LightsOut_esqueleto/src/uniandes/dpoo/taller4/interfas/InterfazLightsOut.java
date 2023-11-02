package uniandes.dpoo.taller4.interfas;
import java.awt.*;
import java.text.*;
import java.util.Collection;

import javax.swing.*;

import com.formdev.flatlaf.FlatLightLaf;

import uniandes.dpoo.taller4.modelo.*;
public class InterfazLightsOut extends JFrame{
	private RegistroTop10 RegitroTop10;
	private PanelBombillos PanelBombillos;
	private PanelDificultad PanelDificultad;
	private PanelJugadas PanelJugadas;
	private PanelOpciones PanelOpciones;
	private DialogoFinal DialogoFinal;
	private Top10 Top10;
	private Tablero Tablero;
	
	public InterfazLightsOut() {
		setTitle("LightsOut");
		setSize(580,580);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//creartop10
		Top10=new Top10(); 
		Tablero=new Tablero(5);
		//configurar interfaz
		setLayout(new BorderLayout());
		//panel opciones 
		PanelOpciones= new PanelOpciones(this);
		add(PanelOpciones, BorderLayout.EAST);
		PanelBombillos=new PanelBombillos(this);
		add(PanelBombillos, BorderLayout.CENTER);
		PanelDificultad=new PanelDificultad(this, PanelBombillos);
		add(PanelDificultad, BorderLayout.NORTH);
		PanelJugadas=new PanelJugadas(this);
		add(PanelJugadas,BorderLayout.SOUTH);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	
	} 
	
	public Collection<RegistroTop10>  top10 () {
		Collection<RegistroTop10> registros =Top10.darRegistros(); 
		
		return registros;
		
		
	}
	public void CambiarJugador(String nombre) {
		PanelJugadas.setJugador(nombre);
	}
	
    public static void main( String[] pArgs )
    {
        try
        {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );
            FlatLightLaf.install();
            InterfazLightsOut interfaz = new InterfazLightsOut();           
            interfaz.setVisible( true );
           
            
        }
        catch( Exception e )
        {
            e.printStackTrace( );
        }
    }
}
