package br.com.devdojo.maratonajsf.bean.session;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
//Session Scoped vai continuar mostrando at� a janela do navegador n�o ser fechada
public class TesteSessionBean implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	private List<String> personagens;
	private List<String> personagemSelecionado = new ArrayList<>();
	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do SessionScoped");
		 personagens = Arrays.asList("Monster","Red Bull","Reign");
	}
	
	public void selecionaPersonagem() {
		int index = ThreadLocalRandom.current().nextInt(3);
		String personagem = personagens.get(index);
		personagemSelecionado.add(personagem);
	}
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "session?faces-redirect=true";
	}

	public List<String> getPersonagemSelecionado() {
		return personagemSelecionado;
	}

	public void setPersonagemSelecionado(List<String> personagemSelecionado) {
		this.personagemSelecionado = personagemSelecionado;
	}
}
