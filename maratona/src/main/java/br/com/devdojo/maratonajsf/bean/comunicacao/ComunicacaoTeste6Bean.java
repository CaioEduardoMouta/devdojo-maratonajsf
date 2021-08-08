package br.com.devdojo.maratonajsf.bean.comunicacao;



import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.model.Estudante;





@Named
@ViewScoped
public class ComunicacaoTeste6Bean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Estudante> estudantes = Estudante.estudantes();
	
	public String editar(int index) {
		Estudante estudante = estudantes.get(index);
		Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
		flash.put("estudante", estudante);
		return "comunicacao7?faces-redirect=true";
	}
	 
	public List<Estudante> getEstudanteList() {
		return estudantes;
	}
	public void setEstudanteList(List<Estudante> estudanteList) {
		this.estudantes = estudanteList;
	}
	
	

}
