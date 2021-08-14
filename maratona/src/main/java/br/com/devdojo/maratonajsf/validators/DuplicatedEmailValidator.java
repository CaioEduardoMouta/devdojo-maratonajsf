package br.com.devdojo.maratonajsf.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;


import br.com.devdojo.maratonajsf.bean.login.LoginBean;

import java.util.List;

//Lembra dessa importação quando for usar o asList
import static java.util.Arrays.asList;

@FacesValidator
public class DuplicatedEmailValidator implements Validator {
	private List<String> emailsDB = asList("caiomouta@devdojo.com.br",
			"caiomouta@easports.com.br");
	@Inject
	private LoginBean loginBean;
	
	
	@Override
	public void validate(FacesContext context, UIComponent component, Object o) 
			throws ValidatorException {
		System.out.println(loginBean.getLanguage());
		String email = (String) o;
		if(emailsDB.contains(email)) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
					"O email já existe cadastrado",
					"");
			throw new ValidatorException(message);
		}
		
	}

}
