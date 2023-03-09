package com.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CommitRollbackTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexion = null;
		try {
			//Conexión con la Base de Datos
			conexion = 
			DriverManager.getConnection("jdbc:mysql://localhost:3306/banco",
					"banco", "fullstack");
			System.out.println("Conexión correcta");
			// antes de comenzar a utilizar transacciones es fundamental cambiar 			// el valor del autoCommit a false
			conexion.setAutoCommit(false);
			
			// primera sentencia SQL que formará parte de la transacción
			PreparedStatement ps1 = conexion.prepareStatement("INSERT INTO"
					+ " gestor (usuario, password, correo) VALUES (?,?,?) ");
			ps1.setString(1, "gestor11"); 
			ps1.setString(2, "gestoddddr11"); 
			ps1.setString(3, "gestor11@correo.com");
			

			System.out.println("Primer ps1");
			// segunda sentencia SQL que formará parte de la transacción
			PreparedStatement ps2 = conexion.prepareStatement("INSERT INTO"
					+ " gestor(usuario,password, correo) VALUES (?,?,?) ");
			ps2.setString(1, "gestor12"); 
			ps2.setString(2, "gestor12222"); 
			ps2.setString(3, "gestor12@correo.com");
			System.out.println("Primer ps2");
			// tercera sentencia SQL que formará parte de la transacción
			PreparedStatement ps3 = conexion.prepareStatement("INSERT INTO"
					+ " gestor(usuario, password, correo) VALUES (?,?,?) ");
			ps3.setString(1, "gestor13"); 
			ps3.setString(2, "gestor13333"); 
			ps3.setString(3, "gestor13@correo.com");
			System.out.println("Primer ps3");
			// cuarta sentencia SQL que formará parte de la transacción y 			// fallará si existe un registro con id = 4
			PreparedStatement ps4 = conexion.prepareStatement("INSERT INTO"
					+ " gestor( usuario, password, correo) "
					+ "VALUES (?,?,?) ");
//			ps4.setInt(1, 20); 
			ps4.setString(1, "gestor14"); 
			ps4.setString(2, "gestor144444");
			ps4.setString(3, "gestor14@correo.com");
			System.out.println("Primer ps4");
			// se añaden todas las sentencias SQL a la transacción
			ps1.execute();
			System.out.println("Executa 1");
			ps2.execute();
			System.out.println("Executa 2");
			ps3.execute();
			System.out.println("Executa 3");
			ps4.execute();
			System.out.println("Executa 4");
			
			// se ejecutan todas las sentencias SQL de la transacción 
			conexion.commit();
			System.out.println("Programa finalizado");
		}
		catch (SQLException e){
			if (conexion != null) { 
				try {
					// se realiza un rollback de la transacción, liberando el 					//bloqueo de la base de datos 
					conexion.rollback();
					System.out.println("Rollback realizado");
					// el rollback puede arrojar también una excepción de tipo 				//SQLException
				} catch (SQLException ex) { 
					ex.printStackTrace();
				}
				// muestra información si la transacción falló 
					e.printStackTrace();
				}
		}
	}

}
