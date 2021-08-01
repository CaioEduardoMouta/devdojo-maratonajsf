package br.com.devdojo.maratonajsf.bean.comunicacao;



import javax.faces.event.ActionEvent;
import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.model.Estudante;


@Named
@ViewScoped
public class ComunicacaoTeste4Bean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String buttonName = "Nome do bot�o do bean";
	private Estudante estudante = new Estudante();
	public void execute(ActionEvent event) {
		String nome = (String) event.getComponent().getAttributes().get("nome");
		String adjetivo = (String) event.getComponent().getAttributes().get("adjetivo");
		Estudante estudante = (Estudante) event.getComponent().getAttributes().get("estudante");
		String test = (String) event.getComponent().getAttributes().get("test");
		System.out.println(nome);
		System.out.println(adjetivo);
		System.out.println(estudante.getNome());
		System.out.println(test);
	}
	public String getButtonName() {
		return buttonName;
	}
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}
	public Estudante getEstudante() {
		return estudante;
	}
	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
	
	

}
