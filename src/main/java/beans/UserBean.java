package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import pojos.User;

@ManagedBean
@ViewScoped
public class UserBean {
	@ManagedProperty(value="#{applicationBean}")
	private ApplicationBean appBean;
	private String userInput;
	private String passwordInput;
	
	/**Fake we do not build an login
	 * @param userName
	 * @param password
	 */
	public void login(){
		User user = new User();
		user.setFirstName("Mirko");
		user.setName("Eberlein");
		appBean.setCurrentUser(user);
	}
	
	public ApplicationBean getAppBean() {
		return appBean;
	}
	public void setAppBean(ApplicationBean appBean) {
		this.appBean = appBean;
	}

	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	public String getPasswordInput() {
		return passwordInput;
	}

	public void setPasswordInput(String passwordInput) {
		this.passwordInput = passwordInput;
	}
}
