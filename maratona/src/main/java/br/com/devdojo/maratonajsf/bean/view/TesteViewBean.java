package br.com.devdojo.maratonajsf.bean.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
//As instâncias de um Managed Bean anotado com esse escopo
//iniciam quando houver uma requisição a determinada página
//e permanecem disponíveis enquanto houver requisições para
//esta mesma página, sendo finalizados quando ocorrer o 
//redirecionamento para outra página;
public class TesteViewBean implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	private List<String> personagens;
	private List<String> personagemSelecionado = new ArrayList<>();
	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do ViewScoped");
		 personagens = Arrays.asList("Chile","Argentina","Uruguai");
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
