package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import constants.Sites;
import pojos.OrderData;

@ManagedBean(name="homeBean")
@ViewScoped
public class HomeBean {
	
	@ManagedProperty(value="#{applicationBean}")
	private ApplicationBean appBean;
	
	
	public ApplicationBean getAppBean() {
		return appBean;
	}


	public void setAppBean(ApplicationBean appBean) {
		this.appBean = appBean;
	}


	public void startOrder(){
		if(appBean.getOrderData()==null){
			appBean.setOrderData(new OrderData());
		}
		appBean.setSite(Sites.ORDERPIZZA);
	}
	
}
