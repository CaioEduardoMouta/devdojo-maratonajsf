package br.com.devdojo.maratonajsf.bean.ajax;

import java.io.Serializable;

import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class AjaxTesteBean implements Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String sobrenome;
	
	public void toUpperCase(AjaxBehaviorEvent e) {
		this.nome = this.nome.toUpperCase();
		this.sobrenome = this.sobrenome.toUpperCase();
		System.out.println(nome);
		System.out.println(sobrenome);
	}
	
	public void toUpperCase2 () {
		this.nome = this.nome.toUpperCase();
		this.sobrenome = this.sobrenome.toUpperCase();
		System.out.println(nome);
		System.out.println(sobrenome);
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
	
	
}
