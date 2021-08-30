package br.com.devdojo.maratonajsf.bean.taglibfunction;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.apache.commons.lang3.text.WordUtils;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class TaglibFunctionTesteBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> names = asList("acer predator","lenovo legion","lenovo starmist");

	
	public List<String> getNames() {
		return names;
	}
	
	public void setNames(List<String> names) {
		this.names = names;
	}

}

