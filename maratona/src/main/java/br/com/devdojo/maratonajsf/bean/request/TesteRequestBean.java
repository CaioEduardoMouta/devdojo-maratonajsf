package br.com.devdojo.maratonajsf.bean.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
//Nesse escopo, o ciclo de vida come�a quando uma requisi��o
//� iniciada e permanece dispon�vel durante o tempo de execu��o dela;
public class TesteRequestBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> personagens;
	private List<String> personagemSelecionado = new ArrayList<>();
	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do RequestScoped");
		 personagens = Arrays.asList("Marvel","DC","Campcom");
	}
	public void selecionaPersonagem() {
		int index = ThreadLocalRandom.current().nextInt(3);
		String personagem = personagens.get(index);
		personagemSelecionado.add(personagem);
	}

	public List<String> getPersonagemSelecionado() {
		return personagemSelecionado;
	}

	public void setPersonagemSelecionado(List<String> personagemSelecionado) {
		this.personagemSelecionado = personagemSelecionado;
	}
	
	
	
	
	
}
