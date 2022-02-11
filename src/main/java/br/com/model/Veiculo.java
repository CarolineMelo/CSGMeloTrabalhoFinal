package br.com.model;

public class Veiculo {

	private Integer id ;
	private String placa ;
	private String modelo ;
	private String marca;
	private Integer ano;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Veiculo(String placa, String modelo, String marca, Integer ano) {
		super();
		
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	} 
	
	
	
	
}
