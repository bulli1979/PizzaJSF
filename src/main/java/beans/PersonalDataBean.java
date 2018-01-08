package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PersonalDataBean {
	@ManagedProperty(value="#{applicationBean}")
	private ApplicationBean appBean;

	public ApplicationBean getAppBean() {
		return appBean;
	}

	public string getFirstName()
	{
		return appBean.getOrderData().getFirstName();
	}

	public void nextStep(){
		//appBean.setSite(Sites.OVERVIEW);
		System.out.println(appBean.getOrderData().getFirstName());
	}

	public void setAppBean(ApplicationBean appBean) {
		this.appBean = appBean;
	}	

	public void setFirstName(String firstName)
	{
		appBean.getOrderData().setFirstName(firstName);
	}
}
