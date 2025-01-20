package Main;

import java.util.Scanner;

import Implementacion.LogicaMetodos;
import Model.Libros;

public class Principal {

	public static void main(String[] args) {

		String clave;
		String titulo;
		int numPag;
		String autor;
		
		Scanner lectura = null;

		Libros libro;
     
		int menuPrincipal, subMenu;
	
		LogicaMetodos imp = new LogicaMetodos();
		try {

			do {
				System.out.println("BIENVENIDO AL MENU");
				System.out.println("1-----ALTA");
				System.out.println("2-----MOSTRA");
				System.out.println("3-----BUSCAR");
				System.out.println("4-----EDITAR");
				System.out.println("5-----ELIMINAR");
				System.out.println("6-----SALIR");
				lectura = new Scanner(System.in);
				menuPrincipal = lectura.nextInt();

				switch (menuPrincipal) {
				case 1:
					try {
						System.out.println("Ingrese la clave");
						lectura = new Scanner(System.in);
						clave = lectura.nextLine();

						System.out.println("Ingrese el titulo");
						lectura = new Scanner(System.in);
						titulo = lectura.nextLine();

						System.out.println("Ingrese el numero de paginas");
						lectura = new Scanner(System.in);
						numPag = lectura.nextInt();

						System.out.println("Ingrese el autor");
						lectura = new Scanner(System.in);
						autor = lectura.nextLine();

						libro = new Libros(clave, titulo, numPag, autor);

						imp.guardar(libro);

						System.out.println("Se guardo con exito ");

						break;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Error al guardar " + e.getMessage());
					}

				case 2:
					imp.mostrar();

					break;
				case 3:

					System.out.println("Ingrese la clave");
					lectura = new Scanner(System.in);
					clave = lectura.nextLine();

					// buscar
					if (imp.bucar(clave) == null) {

						System.out.println("Registro no encontrado");

					} else {
						libro = imp.bucar(clave);
						System.out.println("Se encontro el registro " + libro);
						break;
					}
				case 4:
					System.out.println("Ingrese la clave");
					lectura = new Scanner(System.in);
					clave = lectura.nextLine();

					// buscar
					if (imp.bucar(clave) == null) {
						System.out.println("Registro no encontrado");
					} else {

						libro = imp.bucar(clave);
						System.out.println("Se encontro el registro " + libro);

						try {
							do {
								System.out.println("SUB MENU");
								System.out.println("1---TITULO");
								System.out.println("2---NUM. PAGINAS");
								System.out.println("3---REGRESAR");
								lectura = new Scanner(System.in);
								subMenu = lectura.nextInt();

								switch (subMenu) {
								case 1:
									System.out.println("Ingrese el nuvo titulo");
									lectura = new Scanner(System.in);
									titulo = lectura.nextLine();
									// Actualizacion
									libro.setTitulo(titulo);
									imp.editar(libro);
									System.out.println("se edito");
									break;

								case 2:
									try {
										System.out.println("Ingrese el nuevo numero de paginas");
										lectura = new Scanner(System.in);
										numPag = lectura.nextInt();
										// Actualizacion
									libro.setNumPag(numPag);
									imp.editar(libro);
									System.out.println("se edito");

									} catch (Exception e) {
										System.out.println("Solo se permiten numerps");// TODO: handle exception
									}

									
									break;
								case 3:

									break;

								default:
									break;
								}

							} while (subMenu < 3);
						} catch (Exception e) {
							System.out.println("Solo se permiten números");// TODO: handle exception
						}
					}
					break;
				case 5:
					System.out.println("Ingrese la clave");
					lectura = new Scanner(System.in);
					clave = lectura.nextLine();

					// Eliminacion
					imp.eliminar(clave);
					
					System.out.println("Se elimino con exito");

					break;
				case 6:

					break;

				default:
					break;
				}

			} while (menuPrincipal < 6);

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("Solo se permiten números");
		}

	}

}
