package br.com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class VeiculoDAO {

	public VeiculoDAO() {
		super();
		
	}
	
	
	public void addVeiculo(Veiculo veiculo) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("insert into Carro (placa, modelo, marca, ano) values (?, ?,?,?)");
			p.setString(1, veiculo.getPlaca());
			p.setString(2, veiculo.getModelo());
			p.setString(3, veiculo.getMarca());
			p.setInt(4, veiculo.getAno());
			
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Veiculo> getListVeiculo(){
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
		try {
			PreparedStatement p = con.prepareStatement("select * from Carro");
			ResultSet r = p.executeQuery();			
			
			while (r.next()) {
				Integer id = r.getInt("id");
				String placa = r.getString("placa");
				String modelo = r.getString("modelo");
				String marca = r.getString("marca");
				Integer ano = r.getInt("ano");
				
				Veiculo v = new Veiculo(placa, modelo, marca, ano);
				v.setId(id);
				lista.add(v);
			}
			r.close();
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	
	public void removeVeiculo(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("delete from Carro where id = ?");
			p.setInt(1, id);
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//public void updateVeiculo(Integer id, String newName) {
	public void updateVeiculo(Veiculo updateVeiculo) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("update Carro set placa = ?, modelo = ?, marca = ? ano = ? where id = ?");
			p.setString(1, updateVeiculo.getPlaca());
			p.setString(2, updateVeiculo.getModelo());
			p.setString(3, updateVeiculo.getMarca());
			p.setInt(4, updateVeiculo.getAno());
			p.setInt(5, updateVeiculo.getId());
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public Veiculo buscarVeiculo(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		Veiculo u = null;
		try {
			PreparedStatement p = con.prepareStatement("select * from Carro where id = ?");
			p.setInt(1, id);
			ResultSet r = p.executeQuery();			
			
			
			while (r.next()) {
//				Integer id2 = r.getInt("id");
				String placa = r.getString("placa");
				String modelo = r.getString("modelo");
				String marca = r.getString("marca");
				Integer ano = r.getInt("ano");
				
				u = new Veiculo(placa,modelo,marca,ano);
				u.setId(id);
			}
			r.close();
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	
}

	