package ejercicio01;

import java.util.ArrayList;

public class Sistema {
	private ArrayList<Producto_Quimico>productos;
	
	public Sistema() {
		this.productos = new ArrayList<>();
	}
	
	public void addQuimico(Producto_Quimico p) {
		if(p != null) {
			productos.add(p);
		}
	}
	
	public ArrayList<Producto_Quimico> getProductosValidos(Condicion c){
		ArrayList<Producto_Quimico> productosValidos = new ArrayList<>();
		for(Producto_Quimico producto: productos) {
			if(c.esValido(producto)) {
				productosValidos.add(producto);
			}
		}
		return productosValidos;
	}

	public void addProducto(Producto_Quimico p) {
		if(p != null) {
			productos.add(p);
		}
	}

}
