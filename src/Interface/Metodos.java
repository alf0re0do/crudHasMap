package Interface;

import Model.Libros;

public interface Metodos {
	
	public void guardar(Libros libro);
	
	public void mostrar();
	
	public Libros bucar(String titulo);
	
	public void editar(Libros libro);
	
	public void eliminar(String titulo);

}
