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
	private HtmlInputText name;
	private HtmlInputText street;
	private HtmlInputText telephone;
	private HtmlInputText zip;
	private HtmlInputText city;

	@ManagedProperty(value = "#{applicationBean}")
	private ApplicationBean appBean;

	public ApplicationBean getAppBean() {
		return appBean;
	}

	public HtmlInputText getCity() {
		return city;
	}

	public HtmlInputText getFirstName() {
		return firstName;
	}

	public HtmlInputText getName() {
		return name;
	}

	public HtmlInputText getStreet() {
		return street;
	}

	public HtmlInputText getTelephone() {
		return telephone;
	}

	public HtmlInputText getZip() {
		return zip;
	}

	public void nextStep() {
		appBean.setSite(Sites.OVERVIEW);
	}

	public void setAppBean(ApplicationBean appBean) {
		this.appBean = appBean;
	}

	public void setCity(HtmlInputText city) {
		this.city = city;
	}

	public void setFirstName(HtmlInputText firstName) {
		this.firstName = firstName;
	}

	public void setName(HtmlInputText name) {
		this.name = name;
	}

	public void setStreet(HtmlInputText street) {
		this.street = street;
	}

	public void setTelephone(HtmlInputText telephone) {
		this.telephone = telephone;
	}

	public void setZip(HtmlInputText zip) {
		this.zip = zip;
	}

}
