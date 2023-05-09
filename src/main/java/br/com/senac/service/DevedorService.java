package br.com.senac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.model.Devedor;
import br.com.senac.repository.DevedorRepository;

@Service
public class DevedorService {
	
	@Autowired
	private DevedorRepository devedorRepo;
	
	public List<Devedor> getAllDevedores(){
		return devedorRepo.findAll();
	}
	
	public Devedor findById(Integer id) {
		return devedorRepo.findById(id).get();
	}
	
	public Devedor save(Devedor devedor) {
		return devedorRepo.save(devedor);
	}
	
	public Devedor update(Devedor devedor) {
		return devedorRepo.save(devedor);
	}
	
	public void delete(Integer id) {
		devedorRepo.deleteById(id);
	}
	
}
