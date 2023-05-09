package br.com.senac.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Devedor {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idDevedor;
	
	private String nome;

	public Integer getIdDevedor() {
		return idDevedor;
	}

	public void setIdDevedor(Integer idDevedor) {
		this.idDevedor = idDevedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
