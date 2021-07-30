package br.com.devdojo.maratonajsf.bean.comunicacao;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ComunicacaoTeste4Bean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String buttonName = "Nome do botão do bean";
	public void execute() {
		
	}
	public String getButtonName() {
		return buttonName;
	}
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}

}
