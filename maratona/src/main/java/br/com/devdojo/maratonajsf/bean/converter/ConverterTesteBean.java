package br.com.devdojo.maratonajsf.bean.converter;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.model.Estudante;

@Named
@ViewScoped
public class ConverterTesteBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Estudante> estudantes = Estudante.estudantes();
	private Estudante estudante;
	
	public void save() {
		System.out.println("Salvando");
		System.out.println(estudante);
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}

}
