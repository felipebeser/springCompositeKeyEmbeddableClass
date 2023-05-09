package br.com.senac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.model.Divida;
import br.com.senac.model.EmpresaDevedor;

@Repository
public interface DividaRepository extends JpaRepository<Divida, EmpresaDevedor>{

}
