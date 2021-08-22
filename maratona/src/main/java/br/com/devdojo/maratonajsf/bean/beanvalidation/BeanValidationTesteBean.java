package br.com.devdojo.maratonajsf.bean.beanvalidation;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.Size;

@Named
@ViewScoped
public class BeanValidationTesteBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Size(min = 3, max = 10, message = "O nome tem que ter entre 3 e 10 caracteres")
	private String nome;
	
	
	public void salvar() {
		System.out.println(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
