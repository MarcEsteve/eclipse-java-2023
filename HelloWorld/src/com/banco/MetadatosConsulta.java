package com.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MetadatosConsulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Conexión con la Base de Datos
			Connection conexion = 
			DriverManager.getConnection("jdbc:mysql://localhost:3306/banco",
					"banco", "fullstack");
			Statement instruccion = conexion.createStatement();
			String query = "SELECT * FROM cliente";
			ResultSet resultados = instruccion.executeQuery(query);
			// devuelve el número de columnas 
			System.out.println(resultados.getMetaData().getColumnCount());
			// devuelve el nombre de la primera columna 
			System.out.println(resultados.getMetaData().getColumnName(6));
			// devuelve el tipo de dato de la primera columna (un número entero)
			// https://docs.oracle.com/javase/8/docs/api/constant-values.html#java.sql 
			//Es tipo double por lo tanto nos devuelve un 8
			System.out.println(resultados.getMetaData().getColumnType(6));

		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}

}
