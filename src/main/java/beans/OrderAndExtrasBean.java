package beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import constants.Sites;
import pojos.Extra;
import pojos.Pizza;

@ManagedBean
@SessionScoped
public class OrderAndExtrasBean extends AbstractBeanFunctions {
	private List<Extra> pizzaList;
	
	@ManagedProperty(value="#{applicationBean}")
	private ApplicationBean appBean;

	public ApplicationBean getAppBean() {
		return appBean;
	}

	public void setAppBean(ApplicationBean appBean) {
		this.appBean = appBean;
	}	
	
	public void nextStep(){
		appBean.setSite(Sites.PERSONALDATA);
	}
	
}
