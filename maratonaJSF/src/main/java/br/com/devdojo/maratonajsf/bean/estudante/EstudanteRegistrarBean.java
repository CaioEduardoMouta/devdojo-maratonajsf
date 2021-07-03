package br.com.devdojo.maratonajsf.bean.estudante;

import br.com.devdojo.maratonajsf.model.Estudante;
import jakarta.inject.Named;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@javax.inject.Named
@Named
@ManagedBean
public class EstudanteRegistrarBean implements Serializable {


	private static final long serialVersionUID = 1L;
	private Estudante estudante = new Estudante();
	
	public Estudante getEstudante() {
		return estudante;
	}
	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
	
	
	
	
	
}
