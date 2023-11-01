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
	public final static String RUTA_IMAGEN = "./data/luz.jpg";
	private InterfazLightsOut ventana;
	private BufferedImage imagen;
	
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

	
    public void paint( Graphics g )
    {
    	Graphics2D g2d = (Graphics2D) g;
    	
    	
        // rectangulo del panel con color del fondo BLACK
        g2d.setColor(Color.WHITE);
        g2d.fillRect( 0, 0, getWidth(), getHeight() );

    	// Mostrar imagen parte superior izquierda
    	g2d.drawImage( imagen, 0, 0, getWidth() / 3, getHeight() / 2, null, this );

    	// Mostrar imagen parte inferior derecha
    	g2d.drawImage( imagen, 2*(getWidth() / 3), getHeight() / 2, getWidth() / 3, getHeight() / 2, null, this );

    	// imagen centro arriba
   
        g2d.drawImage( imagen,getWidth() / 3, 0, getWidth()/3, getHeight()/2 ,null, this );
        //imagen centro abajo 
        g2d.drawImage( imagen,getWidth() / 3, getHeight() / 2, getWidth()/3, getHeight()/2 ,null, this );
        // parte inferior izq
        g2d.drawImage( imagen,0, getHeight() / 2, getWidth()/3, getHeight()/2 ,null, this );
        //centro abajo 
        g2d.drawImage( imagen,13*getHeight() /25 ,0, getWidth()/3, getHeight()/2 ,null, this );
    	
       
    }
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
