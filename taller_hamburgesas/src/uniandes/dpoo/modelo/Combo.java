package uniandes.dpoo.modelo;
import java.util.List;
import java.util.ArrayList;
import uniandes.dpoo.modelo.ProductoMenu;
import uniandes.dpoo.procesamiento.Restaurante;

public class Combo implements Producto {
	

	private double descuento;
	private String nombreCombo;
	private ArrayList<ProductoMenu> itemscombo; 
	

	
	public Combo(String nombreCombo, double descuento) {
		this.nombreCombo= nombreCombo;
		this.descuento= descuento;
		this.itemscombo= new ArrayList<ProductoMenu>();
	}

	public void agregarItemACombo(ProductoMenu itmeCombo) {
		itemscombo.add(itmeCombo);
	}
	
	public int getPrecio() {
	    int precio = 0;
	    for (ProductoMenu item : this.itemscombo) {
	        precio = precio + item.getPrecio();
	    }
	    return precio;  
	}
	
	public String generarTextoFactura() {
		String factura = "";
		for (int i = 0; i<itemscombo.size(); i++){
			String nombre= itemscombo.get(i).getNombre();
			int precio= itemscombo.get(i).getPrecio();
			factura = factura +"n/"+ nombre +": "+precio;
		}
		return factura;
	}
	
	public String getNombre() {
		
		return this.nombreCombo;
	}

	public void agregarProducto(String string) {
		// TODO Auto-generated method stub
		
	}

	
}
