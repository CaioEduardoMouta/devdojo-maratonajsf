package br.com.devdojo.maratonajsf.bean.ajax;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import static java.util.Arrays.asList;

@Named
@ViewScoped
public class AjaxTesteBean implements Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String sobrenome;
	private String email;
	private Map<String, List<String>> animePersonagensMap;
	private List<String> personagens;
	private String animeSelecionado;
	private String personagemSelecionado;
	
	
	public void init() {
//		if(FacesContext.getCurrentInstance().isPostback()) {
		System.out.println("entrou");
		animePersonagensMap = new TreeMap<>();
		animePersonagensMap.put("Senhor dos Anéis", asList("Gandalf","Gollum", "Frodo"));
		animePersonagensMap.put("Corrida", asList("Need For Speed","Formula 1", "Gran Turismo"));
		animePersonagensMap.put("Atletas", asList("Michael Phelps","Lebron James", "Mineirinho"));
	
//		}
	}
	
	public void toUpperCase(AjaxBehaviorEvent e) {
		this.nome = this.nome.toUpperCase();
		this.sobrenome = this.sobrenome.toUpperCase();
		System.out.println(nome);
		System.out.println(sobrenome);
	}
	
	public void onSelectAnime() {
		if(animeSelecionado == null) {
			personagens = null;
			return;
		}
		personagens = animePersonagensMap.get(animeSelecionado);
	}

	public void toUpperCaseNome () {
		this.nome = this.nome.toUpperCase();
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Map<String, List<String>> getAnimePersonagensMap() {
		return animePersonagensMap;
	}

	public void setAnimePersonagensMap(Map<String, List<String>> animePersonagensMap) {
		this.animePersonagensMap = animePersonagensMap;
	}

	public List<String> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(List<String> personagens) {
		this.personagens = personagens;
	}

	public String getAnimeSelecionado() {
		return animeSelecionado;
	}

	public void setAnimeSelecionado(String animeSelecionado) {
		this.animeSelecionado = animeSelecionado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPersonagemSelecionado() {
		return personagemSelecionado;
	}

	public void setPersonagemSelecionado(String personagemSelecionado) {
		this.personagemSelecionado = personagemSelecionado;
	}
	
	
}
