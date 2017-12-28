package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import constants.Sites;
import pojos.OrderData;

@ManagedBean(name="applicationBean")
@SessionScoped
public class ApplicationBean {
	private Sites site = Sites.HOME;
	private String siteTitle = "Pizza Bestellservice";
	private OrderData orderData;
	

	public String getSiteTitle() {
		return siteTitle;
	}

	public void setSiteTitle(String siteTitle) {
		this.siteTitle = siteTitle;
	}

	public Sites getSite() {
		return site;
	}

	public void setSite(Sites site) {
		this.site = site;
	}

	public OrderData getOrderData() {
		return orderData;
	}

	public void setOrderData(OrderData orderData) {
		this.orderData = orderData;
	}
	
	
	
}
