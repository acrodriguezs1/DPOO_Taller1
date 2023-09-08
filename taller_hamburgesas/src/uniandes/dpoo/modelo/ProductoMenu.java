package uniandes.dpoo.modelo;

public class ProductoMenu implements Producto {
	
	private ProductoAjustado productoajustado;
	
	private Combo combos; 
	
	private String nombre;
	
	private int precioBase;
	
	public ProductoMenu(String string, int precioBase) {
		nombre=string;
		this.precioBase= precioBase;
	}
	
	public String  getNombre() {
		return nombre;
	}
	
	public int getPrecio(){
		return precioBase;
	}
	
	public String generarTextoFactura() {
		String factura = "";
		String texto = productoajustado.generarTextoFactura();
		if (texto !=null);{
		factura = factura + texto;
		String texto2 = combos.generarTextoFactura();
		if(texto2!=null) {
			factura = factura + texto2;
		}
		}
		factura = factura +"\n Nombre: "+ getNombre()+"Precio: "+ getPrecio()+"\n" ;
		return factura;
	}

}
