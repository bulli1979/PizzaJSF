package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlInputText;

import constants.Sites;

@ManagedBean
@RequestScoped
public class PersonalDataBean {
	private HtmlInputText firstName;
	@ManagedProperty(value="#{applicationBean}")
	private ApplicationBean appBean;

	public ApplicationBean getAppBean() {
		return appBean;
	}

	

	public void nextStep(){
		appBean.setSite(Sites.OVERVIEW);
		System.out.println(this.firstName.getValue());
		System.out.println(appBean.getOrderData().getFirstName());
	}

	public void setAppBean(ApplicationBean appBean) {
		this.appBean = appBean;
	}



	public HtmlInputText getFirstName() {
		return firstName;
	}



	public void setFirstName(HtmlInputText firstName) {
		this.firstName = firstName;
	}	


}
