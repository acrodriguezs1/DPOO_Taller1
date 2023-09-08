package uniandes.dpoo.procesamiento;
import uniandes.dpoo.procesamiento.LoaderRestaurante;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import uniandes.dpoo.modelo.Ingrediente;
import uniandes.dpoo.modelo.Pedido;
import uniandes.dpoo.modelo.Producto;
import uniandes.dpoo.modelo.ProductoAjustado;
import uniandes.dpoo.modelo.ProductoMenu;
import uniandes.dpoo.modelo.Combo;

public class Restaurante {
		
	private ArrayList<ProductoMenu>productosMenu;
	
	private ArrayList<Ingrediente>ingredientes;
	
	private ArrayList<Combo> combos;
	
	
	private ArrayList<Producto> bebidas;
	
	private ArrayList<Pedido> pedidos;
	
	private Pedido pedidosencurso;
	
	private Combo combo;
	
	private ProductoMenu productomenu;
	
	private ProductoAjustado productoajustado;
	
	public Restaurante() {
		ejecutar_carga_de_datos();
		
	} 

	private void ejecutar_carga_de_datos()
	{
		String ruta_menu = "./data/menu.txt";
		String ruta_combo= "./data/combos.txt";
		String ruta_ingredientes ="./data/ingredientes.txt";
		try {
			this.productosMenu=LoaderRestaurante.leerInfoArchivoProductosMenu(ruta_menu);
			this.combos=LoaderRestaurante.leerInfoArchivoCombos(ruta_combo, this.productosMenu);
			this.ingredientes= LoaderRestaurante.leerInfoArchivoingredientes(ruta_ingredientes);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	boolean bandera = false;
	
	public void iniciarPedidos(String nombreCliente ,String direcionCliente){
		bandera = true;
		pedidosencurso = new Pedido(nombreCliente, direcionCliente);
	}
	
	public void cerrarYGuardarPedido() {
		
	}
	
	public ArrayList<ProductoMenu> getMenuBase() {
		
		return this.productosMenu;
	}
	
	public ArrayList<Combo>getcombos(){
		
		return this.combos;
	}
	public ArrayList<Ingrediente>getingrediente(){
		
		return this.ingredientes;
		
	}

	public int darNumeroProductosMenu() {
		
		return productosMenu.size();
	}

	public int darNumeroCombos() {
		
		return combos.size();
	}

	public int darNumeroIngredientes() {
		
		return ingredientes.size();
	}
	public void agregarProductop(Producto nuevoItem) {
		
		pedidosencurso.agregarProducto(nuevoItem);
	}
	public void agregaringredientes(Ingrediente nuevoItem) {
		productoajustado.agregarIngrediente(nuevoItem);
	}
	public void eliminaringredientes(Ingrediente nuevoItem) {
		productoajustado.eliminarIngrediente(nuevoItem);
	}
	
	public String darfactura() {
		System.out.println(productomenu.generarTextoFactura());
		String rta = productomenu.generarTextoFactura();
		return rta ;	
	}
}




