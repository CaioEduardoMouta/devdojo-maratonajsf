package br.com.devdojo.maratonajsf.bean.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
//import javax.inject.Inject;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.bean.dependent.TesteDependentBean;
import br.com.devdojo.maratonajsf.bean.session.TesteSessionBean;

//N�o funciona o dependent bean aqui o server n�o roda 
//import br.com.devdojo.maratonajsf.bean.dependent.TesteDependentBean;

@Named
@ViewScoped
//As inst�ncias de um Managed Bean anotado com esse escopo
//iniciam quando houver uma requisi��o a determinada p�gina
//e permanecem dispon�veis enquanto houver requisi��es para
//esta mesma p�gina, sendo finalizados quando ocorrer o 
//redirecionamento para outra p�gina;
public class TesteViewBean implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	private List<String> personagens;
	private List<String> personagemSelecionado = new ArrayList<>();
	private final TesteSessionBean sessionBean;
	private final TesteDependentBean dependentBean;
	
	@Inject
	public TesteViewBean(TesteDependentBean dependentBean, TesteSessionBean sessionBean) {
		this.dependentBean = dependentBean;
		this.sessionBean = sessionBean;
}

	
	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do @ViewScopped");
		 personagens = Arrays.asList("Chile","Argentina","Uruguai");
	}
	
	public void selecionaPersonagem() {
		System.out.println(sessionBean.getEstudante().getNome());
		if(sessionBean.getEstudante().getNome().equals("Caio")) {
			int index = ThreadLocalRandom.current().nextInt(3);
			String personagem = personagens.get(index);
			personagemSelecionado.add(personagem);
			dependentBean.getPersonagemSelecionado().add(personagem);
		}
		
	}
	public List<String> getPersonagens() {
		return personagens;
	}
	
    public void setPersonagens(List<String> personagens) {
		this.personagens = personagens;
	}
	
	public TesteDependentBean getDependentBean() {
		return dependentBean;
	}
	

	public List<String> getPersonagemSelecionado() {
		return personagemSelecionado;
	}

	public void setPersonagemSelecionado(List<String> personagemSelecionado) {
		this.personagemSelecionado = personagemSelecionado;
	}

}
