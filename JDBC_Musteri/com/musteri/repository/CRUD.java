package com.musteri.repository;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD {

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private final String URL = "jdbc:postgresql://localhost:5432/";
	private final String USERNAME = "postgres";
	private final String PASSWORD = "root";
	private final String dataBase;

	public CRUD(String dataBase) {
		this.dataBase = dataBase;
	}

	private boolean OpenConnection() {
		try {
			Driver.class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(URL + dataBase, USERNAME, PASSWORD);
			return true;
		} catch (Exception e) {
			System.out.println("Connection error" + e.toString());
			return false;
		}
	}

	private void CloseConnection() {
		try {
			if (!conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("Connection closure error." + e.toString());
		}
	}

	public void ExecuteQuerry(String sql) throws SQLException {
		if (OpenConnection()) {
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			CloseConnection();
		} else {
			System.out.println("Query error.");
		}
	}

	public ResultSet FindAll(String sql) throws SQLException {
		if (OpenConnection()) {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			CloseConnection();
			return rs;
		} else {
			System.out.println("Query error2");
			return null;
		}
	}

}
