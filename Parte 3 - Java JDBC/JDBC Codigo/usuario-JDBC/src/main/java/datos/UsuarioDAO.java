package datos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import domain.Usuario;

public class UsuarioDAO {

    private static final String SQL_SELECT = "SELECT id_usuario, usuario, contrasena FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (usuario, contrasena) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, contrasena = ? WHERE id_usuario =?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";
	
	public List<Usuario> seleccionar(){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Usuario usuario = null;
		List <Usuario> usuarios = new ArrayList<>();
		
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int idUsuario = rs.getInt("id_usuario");
				String user = rs.getString("usuario");
				String contrasena = rs.getString("contrasena");
				
				Usuario usr = new Usuario(idUsuario, user, contrasena);
				usuarios.add(usr);
			}
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			 try {
	                Conexion.close(rs);
	                Conexion.close(stmt);
	                Conexion.close(conn);
	            } catch (SQLException ex) {
	                ex.printStackTrace(System.out);
	            }
		}
		return usuarios;
	}
    
    public int insertar(Usuario usuario) {
    	Connection conn = null;
    	PreparedStatement stmt = null;
    	int registros = 0;
    	
    	try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			stmt.setString(1, usuario.getUsuario());
			stmt.setString(2, usuario.getContrasena());
			registros = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			  try {
					Conexion.close(stmt);
					Conexion.close(conn);
				} catch (SQLException e) {
					e.printStackTrace(System.out);
				}
		}
		return registros;
    }
    
    public int actualizar(Usuario usuario) {
    	Connection conn = null;
    	PreparedStatement stmt = null;
    	int registros = 0;
    	
    	try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_UPDATE);
			stmt.setString(1, usuario.getUsuario());
			stmt.setString(2, usuario.getContrasena());
			stmt.setInt(3, usuario.getIdUsuario());
			registros = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			  try {
					Conexion.close(stmt);
					Conexion.close(conn);
				} catch (SQLException e) {
					e.printStackTrace(System.out);
				}
		}
		return registros;
    }
    
    public int eliminar(Usuario usuario) {
    	Connection conn = null;
    	PreparedStatement stmt = null;
    	int registros = 0;
    	
    	try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_DELETE);
			stmt.setInt(1, usuario.getIdUsuario());
			registros = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			  try {
					Conexion.close(stmt);
					Conexion.close(conn);
				} catch (SQLException e) {
					e.printStackTrace(System.out);
				}
		}
		return registros;
    }
    


	
}
