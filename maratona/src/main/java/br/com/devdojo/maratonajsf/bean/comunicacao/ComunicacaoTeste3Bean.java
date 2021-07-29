package br.com.devdojo.maratonajsf.bean.comunicacao;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.Param;


@Named
@ViewScoped
public class ComunicacaoTeste3Bean implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String sobrenome;
	private String data;
	
	public void init() {
		if(!FacesContext.getCurrentInstance().isPostback()) {
			System.out.println("Criou comunicação 3");
			System.out.println(nome);
			System.out.println(sobrenome);
			new SimpleDateFormat
		}
	}
	public String save() {
		System.out.println("Salvando");
		return "resultado?faces-redirect=true&amp;includeViewParams=true";
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
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
	
}
