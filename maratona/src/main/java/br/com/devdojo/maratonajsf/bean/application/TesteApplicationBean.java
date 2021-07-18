package br.com.devdojo.maratonajsf.bean.application;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.bean.dependent.TesteDependentBean;


@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private List<String> categoriaList;
	private final TesteDependentBean dependentBean;
	
	@Inject
	public TesteApplicationBean(TesteDependentBean dependentBean) {
		this.dependentBean = dependentBean;
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do ApplicationScopped");
		categoriaList = Arrays.asList("Far Cry","God of War","Watch Dogs");
		
	}
	
	public void mudarLista() {
		categoriaList = Arrays.asList("Far Cry","God of War","Watch Dogs","Max Payne");
	}

	public List<String> getCategoriaList() {
		return categoriaList;
	}

	public void setCategoriaList(List<String> categoriaList) {
		this.categoriaList = categoriaList;
	}
	
	

}
