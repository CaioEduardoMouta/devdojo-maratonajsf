package br.com.devdojo.maratonajsf.validators;

import static java.util.Arrays.asList;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.bean.login.LoginBean;

@Named
@RequestScoped
public class Validators implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> emailsDB = asList("caiomouta@devdojo.com.br",
			"caiomouta@easports.com.br");
	@Inject
	private LoginBean loginBean;
			
	public void validateDuplicatedEmail(FacesContext context, UIComponent component, Object o) 
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
