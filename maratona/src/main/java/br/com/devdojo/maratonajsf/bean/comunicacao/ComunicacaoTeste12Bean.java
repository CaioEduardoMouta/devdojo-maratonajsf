package br.com.devdojo.maratonajsf.bean.comunicacao;



import java.io.Serializable;


import javax.inject.Named;



import br.com.devdojo.maratonajsf.model.Estudante;
import br.com.devdojo.maratonajsf.util.ApplicationMapUtil;


@Named
@javax.enterprise.context.RequestScoped
public class ComunicacaoTeste12Bean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Estudante estudante;
	private Estudante estudante2 = new Estudante();
	
	public void init() {
		System.out.println("entrou");
		estudante = (Estudante) ApplicationMapUtil.getValueFromApplicationMap("estudante");
	}
	
	public String voltar() {
		System.out.println(estudante2.getNome());
		System.out.println(estudante2.getSobrenome());
		return "comunicacao11?faces-redirect=true";
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public Estudante getEstudante2() {
		return estudante2;
	}

	public void setEstudante2(Estudante estudante2) {
		this.estudante2 = estudante2;
	}

	

	
}
