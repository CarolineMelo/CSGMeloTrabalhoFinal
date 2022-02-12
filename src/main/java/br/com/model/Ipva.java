package br.com.model;

public class Ipva {
	
	private Integer ipva;
	private Integer ano;
	
	public Integer getIpva() {
		return ipva;
	}
	public void setIpva(Integer ipva) {
		this.ipva = ipva;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public Ipva(Integer ipva, Integer ano) {
		super();
		this.ipva = ipva;
		this.ano = ano;
	}
	
	
	
}

