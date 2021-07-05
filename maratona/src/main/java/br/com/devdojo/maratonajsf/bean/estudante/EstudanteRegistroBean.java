package br.com.devdojo.maratonajsf.bean.estudante;


import br.com.devdojo.maratonajsf.model.Estudante;

import java.io.Serializable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
public class EstudanteRegistroBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Estudante estudante = new Estudante();
	private String[] nomeArray = {"Caio", "e", "Lindo"};
	private List<String> nomeList = Arrays.asList("Chelsea FC", "Manchester", "Arsenal", "Liverpool");
	private Set<String> nomeSet = new HashSet<>(Arrays.asList("Portugal", "Angola", "Cabo Verde", "Brasil"));
	private Map<String,String> nomeMap = new HashMap<>();
	private boolean mostrarNota;
	private boolean mostrarLink;
	{	
		nomeMap.put("Calistenia", "Barra");
		nomeMap.put("Cross Fit", "Resistencia");
		nomeMap.put("StrongMan", "Força");
//		
//		for (Map.Entry<String, String> entry : nomeMap.entrySet()) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
	}
	
	public void executar() {
		System.out.println("Fazendo uma busca no BD");
		System.out.println("Processando os dados");
		System.out.println("Exibindo os dados");
	}
	
	public void executar(String param) {
		System.out.println("Fazendo uma busca no BD com parametro" + param);
		System.out.println("Processando os dados");
		System.out.println("Exibindo os dados");
	}
	
	public String executarRetorno(String param) {
		return "Quem eh o Lindão? " +param;
	}
	
	public String irParaIndex2() {
		System.out.println(" entrou");
		return "index2?faces-redirect=true";
	}
	
	public void exibirNota() {
		this.mostrarNota = true;
		
	}
	
	public void esconderNota() {
		this.mostrarNota = false;
	}
	
	public void exibirLink() {
		this.mostrarLink = true;
		
	}
	
	public void esconderLink() {
		this.mostrarLink = false;
	}
	


	
	public boolean isMostrarNota() {
		return mostrarNota;
	}

	public void setMostrarNota(boolean mostrarNota) {
		this.mostrarNota = mostrarNota;
	}

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
	public Map<String,String> getNomeMap() {
		return nomeMap;
	}
	public void setNomeMap(Map<String,String> nomeMap) {
		this.nomeMap = nomeMap;
	}

	public boolean isMostrarLink() {
		return mostrarLink;
	}

	public void setMostrarLink(boolean mostrarLink) {
		this.mostrarLink = mostrarLink;
	}
	
	
}
