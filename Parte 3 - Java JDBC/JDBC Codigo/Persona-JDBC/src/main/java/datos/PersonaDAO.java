package datos;

import java.sql.*;
import java.util.*;
import domain.Persona;

public class PersonaDAO {

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, mail, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona (nombre, apellido, mail, telefono) VALUES (?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, mail = ?, telefono = ? WHERE id_persona =?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";
    // EN INSERT NO AGREGO ID_PERSONA YA Q SE AUTONUMERA
    public List<Persona> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String mail = rs.getString("mail");
                String telefono = rs.getString("telefono");

                persona = new Persona(idPersona, nombre, apellido, mail, telefono);

                personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return personas;
    }
    
    public int insertar(Persona persona) {
    	Connection conn = null;
    	PreparedStatement stmt = null;
    	int registros = 0;
    	try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			stmt.setString(1, persona.getNombre());	
			stmt.setString(2, persona.getApellido());	
			stmt.setString(3, persona.getMail());	
			stmt.setString(4, persona.getTelefono());	
			registros = stmt.executeUpdate();
			//Para q se actualize, no como con select q era executeQuery
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
    	finally {
    		  try {
				Conexion.close(stmt);
				Conexion.close(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(System.out);
			}
    	}
    	//INDICA CUANTOS REGISTROS SE AGREGARON
		return registros;
    }
    
    public int actualizar(Persona persona) {
    	Connection conn = null;
    	PreparedStatement stmt = null;
    	int registros = 0;
    	try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_UPDATE);
			stmt.setString(1, persona.getNombre());	
			stmt.setString(2, persona.getApellido());	
			stmt.setString(3, persona.getMail());	
			stmt.setString(4, persona.getTelefono());
			stmt.setInt(5, persona.getIdPersona());
			registros = stmt.executeUpdate();
			//Para q se actualize, no como con select q era executeQuery
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
    	finally {
    		  try {
				Conexion.close(stmt);
				Conexion.close(conn);
			} catch (SQLException e) {

				e.printStackTrace(System.out);
			}
    	}
    	//INDICA CUANTOS REGISTROS SE ACTUALIZARON
		return registros;
    }
    
    public int eliminar(Persona persona) {
    	Connection conn = null;
    	PreparedStatement stmt = null;
    	int registros = 0;
    	try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_DELETE);
			stmt.setInt(1, persona.getIdPersona());
			registros = stmt.executeUpdate();
			//Para q se actualize, no como con select q era executeQuery
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
    	finally {
    		  try {
				Conexion.close(stmt);
				Conexion.close(conn);
			} catch (SQLException e) {

				e.printStackTrace(System.out);
			}
    	}
    	//INDICA CUANTOS REGISTROS Q SE ELIMINARON
		return registros;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
