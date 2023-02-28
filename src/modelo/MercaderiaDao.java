
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
public class MercaderiaDao implements CRUD{
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Mercaderia> lista = new ArrayList<>();
        String sql = "select * from mercaderia";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
            Mercaderia me = new Mercaderia();
            me.setId(rs.getInt(1));
            me.setValor(rs.getInt(2));
            me.setFecha_ingreso(rs.getString(3));
            me.setRazon_social(rs.getString(4));
            me.setCantidad(rs.getInt(5));
            me.setCategoria(rs.getString(6));
            me.setDetalle(rs.getString(7));
            lista.add(me);
            }
        }catch(Exception e){
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into mercaderia(idmercaderia,Valor,Fecha_Ingreso,Razon_Social,Cantidad,Categoria,Detalle) values(?,?,?,?,?,?,?)";
        try {
            con = cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            r = ps.executeUpdate();
        }catch(Exception e){
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
         int r=0;
        //sentenciamos nuestra sentencia sql para que actualize los datos dentro de nuestra tabla cliente
        String sql="update mercaderia set idmercaderia=?,Valor=?,Fecha_Ingreso=?,Razon_Social=?,Cantidad=?,Categoria=?,Detalle=?";
        //sentenciamos un try - catch 
        try{
            //donde nos permite buscar los datos dentro de nuestra tabla
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            r=ps.executeUpdate();
        }catch(Exception e){
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        //declaramos la sentencia delete para eliminar el id con la informacion dentro de la tabla cliente
        String sql="delete from mercaderia where idmercaderia=?";
        //colocamos un try - catch
        try{
            //donde se conecte con nuestra base y busque la fila cuya cual se desea eliminar
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch (Exception e){
        }
    }
    
}
