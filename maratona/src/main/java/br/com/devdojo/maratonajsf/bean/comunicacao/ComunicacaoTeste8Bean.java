package br.com.devdojo.maratonajsf.bean.comunicacao;



import java.io.Serializable;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.omnifaces.util.Faces;




@Named
@ViewScoped
public class ComunicacaoTeste8Bean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String key;
	private String value;
	
	  public void init() {
	        Map<String, Object> requestCookieMap = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
	        System.out.println(Faces.getRequestCookie("nome"));

	        System.out.println(requestCookieMap);
	    }

	    public String salvarCookie() {
	        Faces.addResponseCookie(key,value,-1);
	        return "comunicacao9?faces-redirect=true";
	    }
	

	    
	    
	public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	

}
