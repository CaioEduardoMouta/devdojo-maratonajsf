package br.com.devdojo.maratonajsf.bean.login;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.model.Estudante;

@Named
@SessionScoped
public class LoginBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String senha;
	private Estudante estudante;
	
	public String logar() {
		
		if(nome.equals("w") && senha.equals("1")) {
			estudante = new Estudante();
			return "/restricted/iniciosistema.xhtml?faces-redirect=true";
		}
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new
				FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuário ou senha invalidos",""));
		return null;
	}
	
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		estudante = null;
		return "/login?faces-redirect=true";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
	
	
	
	

}
