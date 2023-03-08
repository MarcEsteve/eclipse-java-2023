package com.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Conexión con la Base de Datos
			Connection conexion = 
			DriverManager.getConnection("jdbc:mysql://localhost:3306/banco",
					"banco", "fullstack");
			// se inicializa la instrucción preparada, marcando los valores a 			// sustituir con el carácter ? 
			PreparedStatement consultaPreparada = conexion
					.prepareStatement("SELECT * from gestor WHERE id IN (?,?)");
			// se sustituye la primera aparición del carácter ? con el valor 1 
			consultaPreparada.setInt(1, 1);
			// se sustituye la segunda aparición del carácter ? con el valor 5 
			consultaPreparada.setInt(2, 5);
			// se ejecuta la instrucción SQL siguiente:
			// SELECT * from gestor WHERE id IN (3,4) 
			ResultSet resultados = consultaPreparada.executeQuery();
			System.out.println("Listado de gestores: "); 
			while (resultados.next()) {
			System.out.println("Gestor " + resultados.getInt("id")); 
			System.out.println("Usuario: " + resultados.getString("usuario")); 
			System.out.println("Password: " + resultados.getString("password")); 
			System.out.println("Correo: " + resultados.getString("correo")); 
			System.out.println("...");
			}

		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}

}
