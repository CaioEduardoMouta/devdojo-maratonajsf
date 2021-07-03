package br.com.devdojo.maratonajsf.bean.estudante;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;

import javax.inject.Named;
import java.util.List;
import java.util.Set;

import br.com.devdojo.maratonajsf.model.Estudante;

import java.io.Serializable;


@Named
public class EstudanteRegistroBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Estudante estudante = new Estudante();
	private String[] nomeArray = {"Caio", "e", "Lindo"};
	private List<String> nomeList = Arrays.asList("Chelsea FC", "Manchester", "Arsenal", "Liverpool");
	private Set<String> nomeSet = new HashSet<>(Arrays.asList("Portugal", "Angola", "Cabo Verde", "Brasil"));

	
	
	
	public Set<String> getNomeSet() {
		return nomeSet;
	}
	public void setNomeSet(Set<String> nomeSet) {
		this.nomeSet = nomeSet;
	}
	public List<String> getNomeList() {
		return nomeList;
	}
	public void setNomeList(List<String> nomeList) {
		this.nomeList = nomeList;
	}
	public String[] getNomeArray() {
		return nomeArray;
	}
	public void setNomeArray(String[] nomeArray) {
		this.nomeArray = nomeArray;
	}
	public Estudante getEstudante() {
		return estudante;
	}
	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
	
	
}
