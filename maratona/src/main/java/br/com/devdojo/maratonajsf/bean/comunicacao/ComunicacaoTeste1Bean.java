package br.com.devdojo.maratonajsf.bean.comunicacao;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ComunicacaoTeste1Bean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String sobrenome;
	private Date data = new Date();
	private String dataString;
	
	public void imprimirAtributos() {
		String initParameter = FacesContext.getCurrentInstance()
			.getExternalContext()
			.getInitParameter("images.location");
		System.out.println(initParameter);
	}
	
	@PostConstruct
	public void init() {
		setDataString(new SimpleDateFormat("dd-MM-yyyy").format(data));
	}
	
	public String save() {
		System.out.println(nome);
		System.out.println(sobrenome);
		return "comunicacao2?faces-redirect=true&nome="+nome+"&sobrenome="+sobrenome;
	}
	
	

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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

	public String getDataString() {
		return dataString;
	}

	public void setDataString(String dataString) {
		this.dataString = dataString;
	}
	
	
}
