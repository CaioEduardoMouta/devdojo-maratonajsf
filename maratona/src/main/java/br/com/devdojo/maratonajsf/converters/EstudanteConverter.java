package br.com.devdojo.maratonajsf.converters;

import java.util.List;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.devdojo.maratonajsf.model.Estudante;

@FacesConverter(value = "estudanteConverter")
public class EstudanteConverter implements Converter {
	 private List<Estudante> estudantes = Estudante.estudantes();
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value == null || !value.matches("\\d+"))
		return null;
//		Estudante estudante = new Estudante();
//		estudante.setId(Integer.parseInt(value));
//		int index = estudantes.indexOf(estudante);
//		return estudantes.get(index);
		return this.getAtrributesFrom(component).get(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent uiComponent, Object value) {
		if(value != null && !value.equals("")) {
			Estudante estudante = (Estudante) value;
			if(estudante.getId() != null) {
				this.addAtribute(uiComponent, estudante);
				return estudante.getId().toString();
			}
		}
		return null;
	}
	
	private Map<String , Object> getAtrributesFrom(UIComponent component){
		return component.getAttributes();
	}
	
	private void addAtribute(UIComponent component, Estudante estudante) {
		this.getAtrributesFrom(component).put(estudante.getId().toString(),estudante);
	}

}
