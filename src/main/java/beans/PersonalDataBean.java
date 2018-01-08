package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import constants.Sites;

@ManagedBean
@SessionScoped
public class PersonalDataBean {
	@ManagedProperty(value="#{applicationBean}")
	private ApplicationBean appBean;

	public ApplicationBean getAppBean() {
		return appBean;
	}

	public void setAppBean(ApplicationBean appBean) {
		this.appBean = appBean;
	}	
	
	public void nextStep(){
		appBean.setSite(Sites.OVERVIEW);
	}
}
