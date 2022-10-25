package ejercicio01;

public class main {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();
	    
	    Enfermedad enfermedad1 = new Enfermedad("enfermedad1");
	    enfermedad1.addEstadoPatologico("destruccion de plantas");
	    Enfermedad enfermedad2 = new Enfermedad("enfermedad2");
	    enfermedad2.addEstadoPatologico("pudriciones de raíz");
	    enfermedad2.addEstadoPatologico("muerte de plántulas");
	    Enfermedad enfermedad3 = new Enfermedad("enfermedad3");
	    enfermedad3.addEstadoPatologico("pudriciones de raíz");
	    Enfermedad enfermedad4 = new Enfermedad("enfermedad4");
	    enfermedad4.addEstadoPatologico("hojas carcomidas");
	    Enfermedad enfermedad5 = new Enfermedad("enfermedad5");
	    enfermedad5.addEstadoPatologico("hojas carcomidas");
	    Enfermedad enfermedad6 = new Enfermedad("enfermedad6");
	    enfermedad6.addEstadoPatologico("destruccion de plantas");
	    enfermedad6.addEstadoPatologico("muerte de plántulas");
	    Enfermedad enfermedad7 = new Enfermedad("enfermedad7");
	    enfermedad7.addEstadoPatologico("destruccion de plantas");
	    enfermedad7.addEstadoPatologico("hojas carcomidas");
	    enfermedad7.addEstadoPatologico("pudriciones de raíz");
	    Enfermedad enfermedad8 = new Enfermedad("enfermedad8");
	    enfermedad8.addEstadoPatologico("muerte de plántulas");
	    enfermedad8.addEstadoPatologico("pudriciones de raíz");
	    Enfermedad enfermedad9 = new Enfermedad("enfermedad9");
	    enfermedad9.addEstadoPatologico("hojas carcomidas");

	    Cultivo cultivo1 = new Cultivo("cultivo1");
	    cultivo1.addEnfermedad(enfermedad1);
	    cultivo1.addEnfermedad(enfermedad4);
	    Cultivo cultivo2 = new Cultivo("cultivo2");
	    cultivo2.addEnfermedad(enfermedad2);
	    cultivo2.addEnfermedad(enfermedad5);
	    Cultivo cultivo3 = new Cultivo("cultivo3");
	    cultivo3.addEnfermedad(enfermedad1);
	    cultivo3.addEnfermedad(enfermedad3);
	    Cultivo cultivo4 = new Cultivo("cultivo4");
	    cultivo4.addEnfermedad(enfermedad9);
	    cultivo4.addEnfermedad(enfermedad8);
	    Cultivo cultivo5 = new Cultivo("cultivo5");
	    cultivo5.addEnfermedad(enfermedad7);
	    cultivo5.addEnfermedad(enfermedad6);
	    Cultivo cultivo6 = new Cultivo("cultivo6");
	    cultivo6.addEnfermedad(enfermedad2);
	    cultivo6.addEnfermedad(enfermedad7);
	    
	    Producto_Quimico productoQuimico1 = new Producto_Quimico("producto 1");
	    productoQuimico1.addEstadoPatologico("destruccion de plantas");
	    productoQuimico1.addEstadoPatologico("pudriciones de raíz");
	    productoQuimico1.addCultivoProhibido(cultivo1);
	    productoQuimico1.addCultivoProhibido(cultivo3);
	    productoQuimico1.addCultivoProhibido(cultivo6);
	    
	    Producto_Quimico productoQuimico2 = new Producto_Quimico("producto 2");
	    productoQuimico2.addEstadoPatologico("destruccion de plantas");
	    productoQuimico2.addCultivoProhibido(cultivo2);
	    productoQuimico2.addCultivoProhibido(cultivo3);
	    
	    Producto_Quimico productoQuimico3 = new Producto_Quimico("producto 3");
	    productoQuimico3.addEstadoPatologico("muerte de plántulas");
	    productoQuimico3.addEstadoPatologico("pudriciones de raíz");
	    productoQuimico3.addEstadoPatologico("hojas carcomidas");
	    productoQuimico3.addCultivoProhibido(cultivo5);
	    productoQuimico3.addCultivoProhibido(cultivo4);
	    
	    Producto_Quimico productoQuimico4 = new Producto_Quimico("producto 4");
	    productoQuimico4.addEstadoPatologico("hojas carcomidas");
	    productoQuimico4.addEstadoPatologico("muerte de plántulas");
	    productoQuimico4.addCultivoProhibido(cultivo2);
	    productoQuimico4.addCultivoProhibido(cultivo4);
	    
	    Producto_Quimico productoQuimico5 = new Producto_Quimico("producto 5");
	    productoQuimico5.addEstadoPatologico("destruccion de plantas");
	    productoQuimico5.addEstadoPatologico("pudriciones de raíz");
	    
	    Producto_Quimico productoQuimico6 = new Producto_Quimico("producto 6");
	    productoQuimico6.addEstadoPatologico("muerte de plántulas");
	    productoQuimico6.addCultivoProhibido(cultivo5);
	    
	    Producto_Quimico productoQuimico7 = new Producto_Quimico("producto 7");
	    productoQuimico7.addEstadoPatologico("hojas carcomidas");
	    productoQuimico7.addEstadoPatologico("pudriciones de raíz");
	    productoQuimico7.addEstadoPatologico("muerte de plántulas");
	    
	    sistema.addProducto(productoQuimico1);
	    sistema.addProducto(productoQuimico2);
	    sistema.addProducto(productoQuimico3);
	    sistema.addProducto(productoQuimico4);
	    sistema.addProducto(productoQuimico5);
	    sistema.addProducto(productoQuimico6);
	    sistema.addProducto(productoQuimico7);
	    
	    System.out.println(sistema.getProductosValidos(new Condicion_Enfermadad(enfermedad2)));
	    System.out.println(sistema.getProductosValidos(new Condicion_Enfermadad(enfermedad5)));
	    System.out.println(sistema.getProductosValidos(new Condicion_And(new Condicion_Cultivo(cultivo2), new Condicion_Enfermadad(enfermedad9))));
	}

}
