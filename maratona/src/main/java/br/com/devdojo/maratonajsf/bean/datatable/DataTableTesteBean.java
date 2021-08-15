package br.com.devdojo.maratonajsf.bean.datatable;

import br.com.devdojo.maratonajsf.model.Estudante;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class DataTableTesteBean implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private List<Estudante> estudantes = Estudante.estudantes();
	private Set<Estudante> estudanteSet = new HashSet<>(Estudante.estudantes());
	private List<Estudante> estudanteLinkedList = new LinkedList<>(Estudante.estudantes());
	private Map<String, Estudante> mapEstudanteList = new HashMap<>();
	
	
	public void init() {
		mapEstudanteList.put("Framework&Biblioteca1", new Estudante(1,"Angular","JS",10));
		mapEstudanteList.put("Framework&Biblioteca2", new Estudante(2,"Vue.js","JS", 2));
		mapEstudanteList.put("Framework&Biblioteca3", new Estudante(3,"React","JS",10));
		mapEstudanteList.put("Framework&Biblioteca4", new Estudante(4,"Laravel","PHP",10));
		
	}
	
	public void orderByNome(String ordem) {
		if(ordem.equals("asc"))
			estudantes.sort(Comparator.comparing(Estudante::getNome));
		else 
			estudantes.sort(Comparator.comparing(Estudante::getNome).reversed());
	}
	
	public void orderBySobrenome(String ordem) {
		if(ordem.equals("asc"))
			estudantes.sort(Comparator.comparing(Estudante::getSobrenome));
		else 
			estudantes.sort(Comparator.comparing(Estudante::getSobrenome).reversed());
	}
	
	public void remove(Estudante estudante) {
		estudantes.remove(estudante);
	}
	
	
	public Map<String, Estudante> getMapEstudanteList() {
		return mapEstudanteList;
	}
	
	public void setMapEstudanteList(Map<String, Estudante> mapEstudanteList) {
		this.mapEstudanteList = mapEstudanteList;
	}
	
	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}
	
	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public Set<Estudante> getEstudanteSet() {
		return estudanteSet;
	}

	public void setEstudanteSet(Set<Estudante> estudanteSet) {
		this.estudanteSet = estudanteSet;
	}

	public List<Estudante> getEstudanteLinkedList() {
		return estudanteLinkedList;
	}

	public void setEstudanteLinkedList(List<Estudante> estudanteLinkedList) {
		this.estudanteLinkedList = estudanteLinkedList;
	}

}
