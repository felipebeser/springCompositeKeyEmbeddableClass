package br.com.senac.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.senac.model.Devedor;
import br.com.senac.model.Divida;
import br.com.senac.model.Empresa;
import br.com.senac.model.EmpresaDevedor;
import br.com.senac.service.DevedorService;
import br.com.senac.service.DividaService;
import br.com.senac.service.EmpresaService;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent>{

	
	@Autowired
	EmpresaService empresaService;
	@Autowired
	DevedorService devedorService;
	@Autowired
	DividaService dividaService;
	
	@Override
	
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Santander");
		empresaService.save(empresa1);
		
		
		Devedor devedor1 = new Devedor();
		devedor1.setNome("Johnny");
		devedorService.save(devedor1);
		
		EmpresaDevedor empresaDevedor1 = new EmpresaDevedor();
		empresaDevedor1.setDevedor(devedor1);
		empresaDevedor1.setEmpresa(empresa1);
		
		Divida divida1 = new Divida();
		divida1.setEmpresaDevedor(empresaDevedor1);
		divida1.setValorDivida(1000);
		dividaService.save(divida1);
		
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Itau");
		empresaService.save(empresa2);
		
		Devedor devedor2 = new Devedor();
		devedor2.setNome("Struc");
		devedorService.save(devedor2);
		
		EmpresaDevedor empresaDevedor2 = new EmpresaDevedor();
		empresaDevedor2.setDevedor(devedor2);
		empresaDevedor2.setEmpresa(empresa2);
		
		Divida divida2 = new Divida();
		divida2.setEmpresaDevedor(empresaDevedor2);
		divida2.setValorDivida(2000);
		dividaService.save(divida2);

	}
	
}
