package uniandes.dpoo.taller4.interfas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBombillos extends JPanel{
	//ruta de la imagen 
	public final static String RUTA_IMAGEN = "./data/1.png";
	private InterfazLightsOut ventana;
	private BufferedImage imagen;
	public int tablero;
	public PanelBombillos(InterfazLightsOut pVentana)
	    { 
			ventana=pVentana; 
	        try {
	        	imagen = ImageIO.read(new File(RUTA_IMAGEN));
	        } catch (IOException e) {
	        	e.printStackTrace();
	        }

	        setPreferredSize( new Dimension( imagen.getWidth( ), imagen.getHeight( ) ) );
	        repaint();
	    }

	public void settablero(int numero) {
		tablero = numero;
		
	}
	public void paint( Graphics g )
	{ 
		
	    Graphics2D g2d = (Graphics2D) g;
	     
	    // rectangulo del panel con color del fondo BLACK
	    g2d.setColor(Color.WHITE);
	    g2d.fillRect( 0, 0, 400, 400 );
	    
	    // variables para almacenar las coordenadas de las imágenes
	    int largo = getWidth() / tablero;
	    int ancho = getHeight() / tablero;

	    // crea el tablero
	    for (int i = 0; i < tablero; i++) {
	        for (int j = 0; j < tablero; j++) {
	            g2d.drawImage( imagen, i * largo, j * ancho, largo, ancho, null, this );
	        }
	    }
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
