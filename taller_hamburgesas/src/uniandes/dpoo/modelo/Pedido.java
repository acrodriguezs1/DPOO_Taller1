package uniandes.dpoo.modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import uniandes.dpoo.modelo.ProductoMenu;
import uniandes.dpoo.procesamiento.Restaurante;
public class Pedido {

	private int numeroPedidos;
	
	private int idPedido;
	
	private String nombreCliente;
	
	private String direccionCliente;
	
	public ArrayList<Producto> listapedido = new ArrayList<Producto>();
	
	private ProductoAjustado productoajustado;
	
	public Pedido(String nombreCliente, String direccionCliente){
		numeroPedidos = numeroPedidos + 1;
        this.idPedido = numeroPedidos;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
	}
	
	public int getIdPeriodo(){
		
		return this.idPedido;
	}
	
	public void agregarProducto(Producto nuevoItem) {
		listapedido.add(nuevoItem);
	}

	private int getPrecioNetoPedido(){
		int precioNeto= 0; 
		for (int i=0;i<listapedido.size();i++){
			 Producto parte= listapedido.get(i);
			 precioNeto= precioNeto+parte.getPrecio();
		}
		return precioNeto;
	}

	private int getPrecioTotalPedido() {
		int precioTotal= 0;
		precioTotal = getPrecioNetoPedido()+ getPrecioIVAPedido();
				
		return precioTotal;
	}
	
	private int getPrecioIVAPedido() {
		int precioIva=getPrecioNetoPedido();
		precioIva = (int)(precioIva* 0.9);
		return precioIva;
	}
	
	 public void guardarFactura(File archivo) throws IOException{
	        FileWriter fileWriter = new FileWriter(archivo);
	        fileWriter.write(productoajustado.generarTextoFactura());
	        fileWriter.close();
	    }



	
}
