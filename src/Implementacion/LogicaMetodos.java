package Implementacion;

import java.util.HashMap;

import Interface.Metodos;
import Model.Libros;

public class LogicaMetodos implements Metodos {
	
	//Tipos de datos primitovos hay que parsearlos
	HashMap<String, Libros> registros = new HashMap<String, Libros>();
   
	@Override
	public void guardar(Libros libro) {
		// TODO Auto-generated method stub
	registros.put(libro.getClave(), libro);
		
	
	}
	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
			System.out.println(registros);
	}

	@Override
	public Libros bucar(String titulo) {
		// TODO Auto-generated method stub
		return registros.get(titulo);
	}

	@Override
	public void editar(Libros libro) {
		// TODO Auto-generated method stub
		registros.put(libro.getClave(), libro);
	}

	@Override
	public void eliminar(String titulo) {
		// TODO Auto-generated method stub
		registros.remove(titulo);
		
		
	}

}
