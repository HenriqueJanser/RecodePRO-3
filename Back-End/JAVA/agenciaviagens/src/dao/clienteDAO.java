package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelo.cliente;

public class clienteDAO {

	public void save(Object cliente) {

		String sql = "INSERT INTO (nome_cliente) VALUES (?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, modelo.cliente.getNome_cliente());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null)
					;
				{
					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static List<cliente> getcliente() {

		String sql = "SELECT * FROM agenciaviagens";

		List<cliente> cliente = new ArrayList<cliente>();

		Connection conn = null;
		PreparedStatement pstm = null;

		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				cliente usuario = new cliente();

				usuario.setId_cliente(rset.getInt("id_cliente"));
				usuario.setNome_cliente(rset.getString("nome_cliente"));
				usuario.setEmail_cliente(rset.getString("email_cliente"));
				usuario.setCpf(rset.getString("cpf"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();

					if (pstm != null) {
						pstm.close();
					}
					if (conn != null)
						;
					{
						conn.close();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();

			}
		}

		return cliente;

	}

	public void deleteById(int id) {

		String sql = "DELETE FROM cliente WHERE id_cliente = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	}
		

	

	public static void update(List<cliente> usuario) {
		
		String sql = "UPDATE cliente " + "SET nome_cliente = ?, email_cliente = ?, cpf = ?" + " WHERE id_cliente = ?";

		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {

			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, cliente.getNome_cliente());
			pstm.setNString(2, cliente.getEmail_cliente());
			pstm.setInt(3, cliente.getCpf());
			pstm.setInt(5, cliente.getId_cliente());

			pstm.execute();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			

					
		}}
}