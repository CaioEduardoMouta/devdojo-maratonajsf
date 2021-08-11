package br.com.devdojo.maratonajsf.bean.comunicacao;



import java.io.Serializable;



import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.List;


import br.com.devdojo.maratonajsf.model.Estudante;
import br.com.devdojo.maratonajsf.util.ApplicationMapUtil;


@Named
@ViewScoped
public class ComunicacaoTeste11Bean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<Estudante> estudantes = Estudante.estudantes(); 
	
	public String editar(Estudante estudante) {
		ApplicationMapUtil.setValueInApplicationMap("estudante",estudante);
		return "comunicacao12?faces-redirect=true";
	}
	
	

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}

	
}
