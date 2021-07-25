package br.com.devdojo.maratonajsf.bean.comunicacao;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
public class ComunicacaoTeste2Bean implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String sobrenome;
	
	@PostConstruct
	public void init() {
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
