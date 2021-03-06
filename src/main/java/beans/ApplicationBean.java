package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import constants.Sites;
import pojos.Extra;
import pojos.OrderData;
import pojos.Pizza;
import pojos.User;

@ManagedBean(name="applicationBean")
@SessionScoped
public class ApplicationBean extends AbstractBeanFunctions{
	private Sites site = Sites.HOME;
	private String siteTitle = "Pizza Bestellservice";
	private OrderData orderData;
	private User currentUser;
	public boolean showNav(){
		if(site.equals(Sites.HOME)||site.equals(Sites.THANKYOU))
			return false;
		return true;
	}

	public void toHome(){
		setSite(Sites.HOME);
	}
	
	public String chkAct(int navSite){
		if(navSite==site.getSite()){
			return " act";
		}
		if(navSite>site.getSite()){
			return " disabled";
		}
		return "";
	}
	
	public void goToPizzaList(){
		this.site=Sites.ORDERPIZZA;
	}
	
	public void goToExtras(){
		this.site=Sites.OVERVIEWEXTRAS;
	}
	
	public boolean showListLink(){
		if(this.site.getSite()>2&& this.site.getSite()<5){
			return true;
		}
		return false;
	}
	
	public boolean showExtraListLink(){
		if(this.site.getSite()==4){
			return true;
		}
		return false;
	}
	
	public String calculatePrice(){
		double price = 0;
		if(orderData!=null){
			for(Pizza pizza : orderData.getPizzas()){
				price+=pizza.getPrice();
				for(Extra extra : pizza.getExtras()){
					price+=extra.getPrice();
				}
			}
		}
		return format(price);
	}
	
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

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
}
