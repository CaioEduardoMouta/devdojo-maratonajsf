package br.com.devdojo.maratonajsf.bean.flow;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped(value = "pendencies")
public class TesteFlowNestedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String userSurname;

	public String validarUser() {
		System.out.println("Azul Sky GM");
		System.out.println("Vermlho Lucifer Peugeot");
		System.out.println("QuikSilver Hyundai");
		System.out.println("Azul Sky Hyundai");
		if(true) {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Skylack","Sherwin Williams"));
			return null;
		}
		return "proceedToRegistration3";
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	
}
