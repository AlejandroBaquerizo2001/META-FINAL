
package modelo;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

/**
 *
 * @author aleja
 */
public class UsuarioDao {
    //sentenciamos dos metodos importantes
    PreparedStatement ps;
    ResultSet rs;
    
    //establecemos la conexion con nuestra clase conexion 
    //la cual esta conectada a nuestra base de datos
    Conexion con = new Conexion();
    Connection acceso;
    
    //declaramos una clase para validar el usuario 
    public EntidadUsuario ValidarUsuario(String dni, String user){
        //llamaremos a nuestra clase Entidad Usuario donde estan nuestras variables
        EntidadUsuario us=new EntidadUsuario();
        //definimos nuestra sentencia sql donde debe buscar el dni y el user registrado
        String sql="select * from usuario where Dni=? and User=?";
        //sentenciamos un try - catch
        try{
            //damos conexion a nuestra base de datos
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs=ps.executeQuery();
            //sentenciamos un while donde bsuque los datos de la tabla dentro de nuestra base de datos
             while (rs.next()){
                us.setId(rs.getInt(1));
                us.setDni(rs.getString(2));
                us.setNombre(rs.getString(3));
                us.setApellido(rs.getString(4));
                us.setEdad(rs.getInt(5));
                us.setCedula(rs.getInt(6));
                us.setCelular(rs.getInt(7));
                us.setDireccion(rs.getString(8));
                us.setUser(rs.getString(9));
             }
        }catch (Exception e){
            
           
        }
        
        return us;
    }
}
