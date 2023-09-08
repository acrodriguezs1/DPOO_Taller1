package uniandes.dpoo.consola;

import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import uniandes.dpoo.modelo.Combo;
import uniandes.dpoo.modelo.Ingrediente;
import uniandes.dpoo.modelo.ProductoMenu;
import uniandes.dpoo.procesamiento.LoaderRestaurante;
import uniandes.dpoo.procesamiento.Restaurante;
import uniandes.dpoo.modelo.Producto;
 
public class Aplicacion {
	
	private Restaurante restaurante;
	private ArrayList<ProductoMenu> menu;
	private ArrayList<Combo> combos;
	private ArrayList<Ingrediente> ingredientes;
	
	public Aplicacion() {
		restaurante=new  Restaurante();
	}
	
	public void mostrarMenu() {
		System.out.println("1. Mostrar el menú");
		System.out.println("2. Iniciar un nuevo pedido");
		System.out.println("3. Agregar un elemento a un pedido");
		System.out.println("4. Cerrar un pedido y guardar la factura");
		System.out.println("5. Consultar la informacionde un pedido dado su ID");
		System.out.println("6. Salir de aplicacion");		
	}
	

	public void ejecutarOpcion() {
		boolean flag = true;
		while (flag)
		{			
			try 
			{	
				mostrarMenu();
				System.out.println("Por favor seleccione una opción");
				String opcion = input("Opcion");
				int opcionSeleccionada = Integer.parseInt( opcion );
				
				if (opcionSeleccionada ==1) {
					
					System.out.println("Menu \n");
					
					ejecutar_opcion_1();
					
					System.out.println("\n");}
				
				else if(opcionSeleccionada==2) {
					
					System.out.println("nuevo pedido en curso...\n");
					
					ejecutar_opcion_2();
					
					System.out.println("Se inicio el pedido correctamente\n");}
					
				else if(opcionSeleccionada==3)
					{		
					System.out.println("Agregar elementos a los pedidos\n");
					ejecutar_opcion_3();
					}
				else if(opcionSeleccionada==4)
					{
					String factura =restaurante.darfactura();
					System.out.println("Cerrar un pedido y guardar la factura \n");}
				else if (opcionSeleccionada==5);
				
				else if (opcionSeleccionada == 6)
				{
					System.out.println("Saliendo de la aplicacion \n");
				    flag = false;
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}
	
	public void ejecutar_opcion_1() {
		menu =restaurante.getMenuBase();
		for(int i=0;i<menu.size();i++) {
			System.out.println((i+1)+". "+menu.get(i).getNombre());
		}
	}
	
	public void ejecutar_opcion_2() {
		String Nombre = input("Ingrese nombre del cliente");
		String Direccion= input ("Ingrese direccion del cliente");
		restaurante.iniciarPedidos(Nombre, Direccion);
		
	}
	public void ejecutar_opcion_3() {
		boolean fin = true;
		while (fin)
		{
	
			{
			try {
				System.out.println("1. Menu \n");
				System.out.println("2. Combo \n");
				System.out.println("3. agregar ingrediente\n");
				System.out.println("4. eliminar ingrediente\n");
				System.out.println("5. Finalizar \n ");
				System.out.println("Por favor seleccione una opción\n");
				String opcion = input("Opcion");
				int opcionSeleccionada = Integer.parseInt( opcion );
		
			if  (opcionSeleccionada ==1) {
				ejecutar_opcion_1();
				
				System.out.println("\n--------------------------------------\n");
				String numero = input("Opcion");
				int opnum = Integer.parseInt( numero );
				try {
					
				restaurante.agregarProductop(menu.get(opnum-1));
				
				System.out.println("se agrego al pedido: "+menu.get(opnum-1).getNombre());}
				
				catch (NumberFormatException e)
				{
					System.out.println("Debe seleccionar uno de los números de las opciones.");
				}
				}
			
			else if  (opcionSeleccionada == 2) {
				
				mostrar_combos();
				
				
				System.out.println("\n--------------------------------------\n");
				
				String numero = input("Opcion");
				int opnum = Integer.parseInt( numero );
				try {
		
					restaurante.agregarProductop(combos.get(opnum-1));
					System.out.println("se agrego al pedido: "+combos.get(opnum-1).getNombre());
					
					
				}
					
					catch (NumberFormatException e)
					{
						System.out.println("Debe seleccionar uno de los números de las opciones.");
					}
				
				}
			
			else if (opcionSeleccionada == 3) {
				
				System.out.println();
				
				
				System.out.println("\n--------------------------------------\n");
				
			}
			else if(opcionSeleccionada ==4) {
				
			}
			else if (opcionSeleccionada == 5) {
				
				System.out.println("Saliendo de la aplicacion \n");
				
			    fin = false;
			}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
			}
		}
	}
	

	private void mostrar_combos(){
		combos =restaurante.getcombos();
		for(int i=0;i<combos.size();i++) {
			System.out.println((i+1)+". "+combos.get(i).getNombre());
		}
	}
	private void mostrar_ingredientes(){
		ingredientes =restaurante.getingrediente();
		for(int i=0;i<ingredientes.size();i++) {
			System.out.println((i+1)+". "+ingredientes.get(i).getNombre());
		}
	}
	
	
	public void ejecutar_opcion_4() {
		
	}

	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String lectura = reader.readLine();
			return lectura;
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}


	public static void main (String[] args) {
		
		Aplicacion consola = new Aplicacion();
		System.out.println("productos menu cargados: "+ consola.darNumeroProductosMenu());
		System.out.println("Combos cargados: "+ consola.darNumeroCombos());
		System.out.println("Los ingredientes cargados: " + consola.darNumeroIngredientes());
		consola.ejecutarOpcion();
		
		
		
	}

	private int darNumeroCombos()
	{
		return restaurante.darNumeroCombos();
	}
	private int darNumeroProductosMenu() {	
		return restaurante.darNumeroProductosMenu();
	}
	private int darNumeroIngredientes() 
	{
		return restaurante.darNumeroIngredientes();
	}


}
