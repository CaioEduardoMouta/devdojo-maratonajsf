package br.com.devdojo.maratonajsf.bean.application;

import java.io.Serializable;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;


import br.com.devdojo.maratonajsf.bean.dependent.TesteDependentBean;
import br.com.devdojo.maratonajsf.bean.session.TesteSessionBean;


@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private List<String> categoriaList;
	private final TesteDependentBean dependentBean;
	private final TesteSessionBean sessionBean;
//
@Inject
public TesteApplicationBean(TesteDependentBean dependentBean,TesteSessionBean sessionBean) {
		this.dependentBean = dependentBean;	
		this.sessionBean = sessionBean;
	}
	
	
	
	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do ApplicationScopped");
		categoriaList = Arrays.asList("Far Cry","God of War","Watch Dogs");
//		dependentBean.getCategoriasList().addAll(Arrays.asList("Skyrim","Mass Effect","Fallout"));
		sessionBean.selecionaPersonagem();
	}
	
	
	
	public TesteSessionBean getSessionBean() {
		return sessionBean;
	}



	public void mudarLista() {
		categoriaList = Arrays.asList("Far Cry","God of War","Watch Dogs","Max Payne");
	}

//	public TesteDependentBean getDependentBean() {
//		return dependentBean;
//	}
	
	public List<String> getCategoriaList() {
		return categoriaList;
	}

	public void setCategoriaList(List<String> categoriaList) {
		this.categoriaList = categoriaList;
	}
	
	

}
