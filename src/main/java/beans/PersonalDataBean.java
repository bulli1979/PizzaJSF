package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PersonalDataBean {
	@ManagedProperty(value="#{applicationBean}")
	private ApplicationBean appBean;	
}
