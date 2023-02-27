
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author aleja
 */
public class Conexion {
    //establecemos los parametros de conexion con nuestra base de datos en mysql
    Connection con;
    String url="jdbc:mysql://localhost:3306/grupof_db";
    String user="root";
    String pass="alegu2001";
    
    //declaramos una clase conexion donde nos permitira conectar con nuestra base
    public Connection Conectar(){
        //definimos un try - catch
        try{
            //donde el usuario y dni registrado en nuestra tabla usuario nos permita entrar al sistema.
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
        
        }
        return con;
    }
}
