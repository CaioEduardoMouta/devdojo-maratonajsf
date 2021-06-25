package bean.estudante;



import java.io.Serializable;

import javax.inject.Named;

import bean.estudante.model.Estudante;

@Named
public class EstudanteRegistrarBean implements Serializable {
	private Estudante estudante = new Estudante();

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
	
	

	
}
