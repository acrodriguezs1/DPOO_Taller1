package uniandes.dpoo.taller4.interfas;
import java.awt.*;
import java.text.*;

import javax.swing.*;

import com.formdev.flatlaf.FlatLightLaf;

import uniandes.dpoo.taller4.modelo.*;
public class InterfazLightsOut extends JFrame{
	private RegistroTop10 RegitroTop10;
	private PanelBombillos PanelBombillos;
	private PanelDificultad PanelDificultad;
	private PanelJugadas PanelJugadas;
	private PanelOpciones PanelOpciones;
	
	public InterfazLightsOut() {
		setTitle("LightsOut");
		setSize(580,580);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//configurar interfaz
		setLayout(new BorderLayout());
		//panel opciones 
		PanelOpciones= new PanelOpciones(this);
		add(PanelOpciones, BorderLayout.EAST);
		PanelDificultad=new PanelDificultad(this);
		add(PanelDificultad, BorderLayout.NORTH);
		//PanelJugadas=new PanelJugadas(this);
		//add(PanelJugadas,BorderLayout.SOUTH);
		PanelBombillos=new PanelBombillos(this);
		add(PanelBombillos, BorderLayout.CENTER);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	
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
