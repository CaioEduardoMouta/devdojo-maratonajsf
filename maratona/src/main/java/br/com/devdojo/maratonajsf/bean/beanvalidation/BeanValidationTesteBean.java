package br.com.devdojo.maratonajsf.bean.beanvalidation;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Named
@ViewScoped
public class BeanValidationTesteBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Size(min = 3, max = 10, message = "O nome tem que ter entre 3 e 10 caracteres")
	@NotNull(message = "O nome é obrigario")
	private String nome;
	@Pattern(regexp = "^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?$/i^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?$/i",
			message = "Digite um email valido" )
	private String email;
	@DecimalMax(value = "30.00", message = "Não pode ser maior que 30")
	@DecimalMin(value = "5", message = "Não pode ser menor que 5")
	private double decimal;
	@Digits(integer = 3, fraction = 2, message="O valor não pode ser maior que 999 e casa decimal maior que 2 digitos")
	private double numero;
	
	public void salvar() {
		System.out.println(nome.isEmpty());
		System.out.println(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getDecimal() {
		return decimal;
	}

	public void setDecimal(double decimal) {
		this.decimal = decimal;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	
	
	
}
