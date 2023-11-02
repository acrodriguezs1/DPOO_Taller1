package uniandes.dpoo.taller4.interfas;

import uniandes.dpoo.taller4.interfas.PanelBombillos;
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
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class PanelDificultad extends JPanel implements ActionListener{
	private JTextField tf;
	private JComboBox combo;
	private JFrame v;
	private JLabel label;
	private InterfazLightsOut ventana;
	private JRadioButton radio1,radio2,radio3;
	private ButtonGroup bg;
	private PanelBombillos pb;
	
	public PanelDificultad(InterfazLightsOut pVentana, PanelBombillos panelb)
	{
		ventana=pVentana; 
		pb=panelb; 
		//creacion del textfield 
		setBackground(Color.PINK);
		setLayout( new GridLayout( 1, 20, 1, 1) );
		setBorder(new EmptyBorder(5,5,5,5));
		
		 label=new JLabel("TAMAÑO: ");
	     label.setBounds(10,10,5,30);
	     add(label);
    
		// creacion JCombobox
		
		combo= new JComboBox();
		add(combo);
		combo.setBounds(1,1,5,5);
		combo.addItem("5x5");
		combo.addItem("7x7");
		combo.addItem("9x9");
		String dimension =(String) combo.getSelectedItem();
		if (dimension.equals("5x5")) {
			int numero = 5;
			pb.settablero(numero);
			
		}
		if (dimension.equals("7x7")) {
			int numero =7;
			pb.settablero(numero);
		}
		if(dimension.equals("9x9")) {
			int numero=9;
			pb.settablero(numero);
			
		}
		 	
		 label=new JLabel("DIFICULTAD: ");
		 label.setBounds(10,10,5,30);
	
		 
		 add(label);
		 
		 bg=new ButtonGroup();
		 radio1=new JRadioButton("FACIL");
		 radio1.setBounds(10,20,100,30);
	
		 add(radio1);
		 bg.add(radio1);
		 radio2=new JRadioButton("MEDIO");
		 radio2.setBounds(10,70,100,30);
	
		 add(radio2);
		 bg.add(radio2);
		 radio3=new JRadioButton("DIFICIL");
		 radio3.setBounds(10,120,100,30);

		 add(radio3);
		 bg.add(radio3);
		 if (bg.equals(radio1)){
			 
		 }
		 else if (bg.equals(radio2)) {
			 
		 }
		 else{
			 
		 }
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
