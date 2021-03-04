package test;

import java.util.Iterator;
import java.util.List;
import datos.UsuarioDAO;
import domain.Usuario;

public class PruebaManejoUsuario {

	public static void main(String[] args) {
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		
		//INSETAR 
//		Usuario usuario1 = new Usuario("Julian", "juli12345");
//		usuarioDao.insertar(usuario1);
//		Usuario usuario2 = new Usuario("Emanuel", "messi5554");
//		usuarioDao.insertar(usuario2);
//		Usuario usuario3 = new Usuario("Leo Messi", "55544222");
//		usuarioDao.insertar(usuario3);
			
		//ACTUALIZAR
//		Usuario actualiza1 = new Usuario(1,"JulianCastro","45454");
//		usuarioDao.actualizar(actualiza1);
		
		//DELETE
//		Usuario eliminar3 = new Usuario(3);
//		usuarioDao.eliminar(eliminar3);
		
		//MOSTRAR LISTA (SELECT)
		List <Usuario> usuarios = usuarioDao.seleccionar();
		for (Usuario usuario : usuarios) {
			System.out.println("Usuarios = " + usuario);
		}
		
		
	} 
	
}
