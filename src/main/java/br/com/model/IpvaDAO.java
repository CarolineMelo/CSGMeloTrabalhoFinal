//package br.com.model;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//public class IpvaDAO {
//	
//	public IpvaDAO() {
//		super();
	
//	}
//
//
//	public Ipva buscaripva(Integer ano) {
//		Conexao c = Conexao.getInstance();
//		Connection con = c.getConnection();
//		Veiculo u = null;
//		try {
//			PreparedStatement p = con.prepareStatement("select * from Ipva");
//			ResultSet r = p.executeQuery();
//			
//			
//			Integer ano = r.getInt("ano");
//		
//}