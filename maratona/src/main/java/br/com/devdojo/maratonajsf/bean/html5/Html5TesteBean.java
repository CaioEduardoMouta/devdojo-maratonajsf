package br.com.devdojo.maratonajsf.bean.html5;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped 
public class Html5TesteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String url;
	private String nome;
	private int numero;
	private Map<String, String> atributes = new HashMap<>();
	
	public void init() {
		atributes.put("type","email");
		atributes.put("placeholder", "Digite seu email");
	}
	
	public void salvar() {
		System.out.println(email);
		System.out.println(url);
		System.out.println(numero);
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Map<String, String> getAtributes() {
		return atributes;
	}
	public void setAtributes(Map<String, String> atributes) {
		this.atributes = atributes;
	}
	
	
	
}
