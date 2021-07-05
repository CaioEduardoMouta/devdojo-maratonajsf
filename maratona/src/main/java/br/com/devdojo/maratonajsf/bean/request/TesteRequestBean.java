package br.com.devdojo.maratonajsf.bean.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TesteRequestBean implements Serializable{
	private List<String> personagens = Arrays.asList("","","");
	private List<String> personagemSelecionado = new ArrayList<>();
	
	public void selecionaPersonagem() {
		int index = ThreadLocalRandom.current().nextInt(3);
		String personagem = personagens.get(index);
		personagemSelecionado
	}
	
	
}
