package br.com.senac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.model.Empresa;
import br.com.senac.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepo;
	
	public List<Empresa> getAllEmpresas(){
		return empresaRepo.findAll();
	}
	
	public Empresa findById(Integer id) {
		return empresaRepo.findById(id).get();
	}
	
	public Empresa save(Empresa empresa) {
		return empresaRepo.save(empresa);
	}
	
	public Empresa update(Empresa empresa) {
		return empresaRepo.save(empresa);
	}
	
	public void delete(Integer id) {
		empresaRepo.deleteById(id);
	}
}
