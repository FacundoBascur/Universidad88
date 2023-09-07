package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private String url;
    private String usuario;
    private String password;

    private static Connection conexion = null;

    public Conexion(String url, String usr, String pass) {

        this.url = url;
        usuario = usr;
        password = pass;

    }

        public Connection buscarConexion() {

        if (conexion == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(url, usuario, password);
            } catch (SQLException | ClassNotFoundException ex) {
                
                JOptionPane.showMessageDialog(null, "No se pudo realizar la conexion");
            }

        }

        return conexion;

    }

}
