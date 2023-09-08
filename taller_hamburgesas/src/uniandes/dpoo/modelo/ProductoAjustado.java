package uniandes.dpoo.modelo;

import java.util.ArrayList;


public class ProductoAjustado implements Producto{
	
	private ProductoMenu menu;
	private ArrayList<Ingrediente> ingredientes_agregados;
	private ArrayList<Ingrediente> ingredientes_eliminados;
	private Pedido pedido;
	
	public void agregarIngrediente(Ingrediente nuevoItem){
        ingredientes_agregados.add(nuevoItem);
    }
	public void eliminarIngrediente(Ingrediente nuevoItem){
		ingredientes_eliminados.add(nuevoItem);		
	}
	
	public String getNombre() {
		
		return menu.getNombre();
		
	}
	
	public int getPrecio() {
		
		return menu.getPrecio();
	}
		
		
	public int getPreciototal() {
		int total = 0;
		for(int i=0; i<ingredientes_agregados.size();i++){
			total+=ingredientes_agregados.get(i).getCostoAdicional();
		}
		return menu.getPrecio()+total;
	}
	public String generarTextoFactura() {
		String factura ="";
		if (pedido.listapedido.size()!= 0) {
		for (int i = 0; i<pedido.listapedido.size();i++) {
			String nombre =pedido.listapedido.get(i).getNombre();
			int precio = pedido.listapedido.get(i).getPrecio();
			factura = factura +"n/"+ nombre+" :"+ precio;
			}}
		if (ingredientes_agregados.size()!=0) {
			factura = factura+"n/ Productos Adicionales n/";
			for (int i = 0; i<ingredientes_agregados.size();i++) {
				String nombre =pedido.listapedido.get(i).getNombre();
				int precio = pedido.listapedido.get(i).getPrecio();
				factura = factura +"n/"+ nombre+" :"+ precio;
		}}
		return factura;
		
	}

}
