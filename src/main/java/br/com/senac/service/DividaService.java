package br.com.senac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.model.Divida;
import br.com.senac.model.EmpresaDevedor;
import br.com.senac.repository.DividaRepository;

@Service
public class DividaService {
	@Autowired
	private DividaRepository dividaRepo;
	
	public List<Divida> getAllDividas() {
		return dividaRepo.findAll();
	}
	
	public Divida save(Divida divida) {
		return dividaRepo.save(divida);
	}
	
	public Divida update(Divida divida) {
		return dividaRepo.save(divida);
	}
	
	public void delete(EmpresaDevedor empresaDevedor) {
		dividaRepo.deleteById(empresaDevedor);
	}
	
	
}
