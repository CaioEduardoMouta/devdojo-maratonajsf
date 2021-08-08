package br.com.devdojo.maratonajsf.bean.comunicacao;



import java.io.Serializable;



import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.List;


import br.com.devdojo.maratonajsf.model.Estudante;


@Named
@ViewScoped
public class ComunicacaoTeste10Bean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String password;
	private List<Estudante> estudantes = Estudante.estudantes(); 
	
	public void remover(Estudante estudante) {
		estudantes.remove(estudante);
	}
	
	public void salvar() {
		System.out.println(password);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}

	
}
