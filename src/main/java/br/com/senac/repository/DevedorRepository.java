package br.com.senac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.model.Devedor;

@Repository
public interface DevedorRepository extends JpaRepository<Devedor, Integer>{

}
