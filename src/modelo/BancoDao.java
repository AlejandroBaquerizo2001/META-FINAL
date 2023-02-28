
package modelo;

import java.sql.Connection;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aleja
 */
public class BancoDao implements CRUD{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Banco>lista = new ArrayList<>();
        String sql = "select * from entidad_bancaria";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Banco ban = new Banco();
                ban.setId(rs.getInt(1));
                ban.setNombre(rs.getString(2));
                ban.setRazon_social(rs.getString(3));
                ban.setCuenta(rs.getInt(4));
                ban.setFecha_ingreso(rs.getString(5));
                ban.setRuc(rs.getInt(6));
                lista.add(ban);
            }
        }catch(Exception e){
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into entidad_bancaria(identidad_bancaria,Nombre,Razon_Social,Cuenta,Fecha_Ingreso,RUC)values(?,?,?,?,?,?)";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        }catch(Exception e){
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update entidad_bancaria set identidad_bancaria=?,Nombre=?,Razon_Social=?,Cuenta=?,Fecha_Ingreso=?,RUC=?";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        }catch(Exception e){
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from entidad_bancaria where identidad_bancaria=?";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        }catch(Exception e){}
    }
    
}
