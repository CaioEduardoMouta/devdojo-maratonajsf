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
import javax.servlet.http.Part;

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
	public void validateFile(FacesContext context, UIComponent component, Object o) 
			throws ValidatorException {
		Part file = (Part) o;
		try {
			validateFileNameLenght(file);
			validateContentType(file);
			validateFileSize(file);
		}catch(RuntimeException e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
					e.getMessage(),
					"");
			throw new ValidatorException(message);
		}
	}
	private void validateFileNameLenght(Part file) {
		if(file.getSubmittedFileName().length() > 10)
			throw new RuntimeException("O nome + extensão não pode ser maior que 10 caracteres");
	}
	
	private void validateContentType(Part file) {
		String contentType = file.getContentType();
		if(!contentType.equals("image/png") && !contentType.equals("image/jpeg"))
				throw new RuntimeException("Apenas imagens PNG e JPG são permitidas");
	}
	
	private void validateFileSize(Part file) {
		if(file.getSize() > 1048576)
			throw new RuntimeException("O arquivo não pode exceder 1MB");
	}
}

