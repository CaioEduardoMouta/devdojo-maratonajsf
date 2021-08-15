package br.com.devdojo.maratonajsf.bean.validation;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
public class ValidationTesteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String password;
	
	public void save() {
		System.out.println(password);
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
