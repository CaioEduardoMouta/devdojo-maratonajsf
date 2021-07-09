package br.com.devdojo.maratonajsf.bean.conversation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationScoped
public class TesteConversationBean implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> personagens;
	private List<String> personagemSelecionado = new ArrayList<>();
	@Inject
	private Conversation conversation;
	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do ConversationScoped");
		 personagens = Arrays.asList("Inglaterra","França","Holanda");
		 if(conversation.isTransient()) {
			 conversation.begin();
			 System.out.println(" Iniciando Converstion Scopped"+conversation.getId());
		 }
	}
	
	public String endConversation() {
		if(!conversation.isTransient()) {
			conversation.end();
		}
		
		return "conversation?faces-redirect=true";
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

	public Conversation getConversation() {
		return conversation;
	}

	public void setConversation(Conversation conversation) {
		this.conversation = conversation;
	}
}
