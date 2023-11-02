package uniandes.dpoo.taller4.interfas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import uniandes.dpoo.taller4.modelo.RegistroTop10;
import uniandes.dpoo.taller4.modelo.Top10;



public class DialogoTop10 extends JFrame {
	private InterfazLightsOut ventana;
	private Top10 Top10;
	private RegistroTop10 RegistroTop10;
	 public DialogoTop10( InterfazLightsOut pVentana )
	    {	
		  	Top10=new Top10();
		 	ventana=pVentana;

		 	setName("LightsOut");
		 	setSize(400, 300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
			JPanel panelInfo1 = new JPanel( );
	        panelInfo1.setLayout( new GridLayout( 1, 1 ) );
	        panelInfo1.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
	        panelInfo1.setBackground(Color.PINK);
	        add(panelInfo1,BorderLayout.CENTER);
	        Collection<RegistroTop10> registros = ventana.top10();
	        DefaultListModel<String> listModel = new DefaultListModel<>();
	        for (RegistroTop10 reg : registros)
		    {		
	        	
	        	 String rta= reg.toString();
	        	 listModel.addElement(rta);
		    }
	        JList<String> list = new JList<>(listModel);
	        JScrollPane scrollPane = new JScrollPane(list);
	        

		 	panelInfo1.add(scrollPane);
	    }

}
