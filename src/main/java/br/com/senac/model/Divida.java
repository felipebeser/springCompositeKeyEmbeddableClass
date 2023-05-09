package br.com.senac.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Divida {
	
	private float valorDivida;
	
	@EmbeddedId
	private EmpresaDevedor empresaDevedor;

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}

	public EmpresaDevedor getEmpresaDevedor() {
		return empresaDevedor;
	}

	public void setEmpresaDevedor(EmpresaDevedor empresaDevedor) {
		this.empresaDevedor = empresaDevedor;
	}
	
	
}
