package com.banco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Conexión con la Base de Datos
			Connection conexion = 
			DriverManager.getConnection("jdbc:mysql://localhost:3306/banco",
					"banco", "fullstack");
			// obtención de un objeto de tipo Statement 
			Statement instruccion = conexion.createStatement();
			// construir sentencia SQL
			String query = "DELETE FROM gestor WHERE id=8";
			// Primera FORMA ejecutar instrucción con el método execute 
			boolean resultado = instruccion.execute(query);
			// si es false, entonces la instrucción no devuelve un objeto de 			
			// tipo ResultSet 
			if (!resultado) {
			// mostrar el número de registros insertados
				System.out.println("Registros eliminados: " +
						instruccion.getUpdateCount());
			}
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}

}
