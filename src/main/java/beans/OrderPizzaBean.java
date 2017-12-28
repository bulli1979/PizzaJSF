package beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import data.DAOStaticData;
import pojos.Pizza;

@ManagedBean
@ViewScoped
public class OrderPizzaBean  extends AbstractBeanFunctions{
	private List<Pizza> pizzaList;
	@ManagedProperty(value="#{applicationBean}")
	private ApplicationBean appBean;
	
	
	
	public List<Pizza> getPizzaList() {
		return pizzaList;
	}



	public void setPizzaList(List<Pizza> pizzaList) {
		this.pizzaList = pizzaList;
	}



	public ApplicationBean getAppBean() {
		return appBean;
	}



	public void setAppBean(ApplicationBean appBean) {
		this.appBean = appBean;
	}



	public OrderPizzaBean(){
		if(pizzaList == null){
			try{
			pizzaList = DAOStaticData.getAll();
			System.out.println(pizzaList.size());
			}catch(Exception e){
				System.out.println("Error in getPizzas DB!");
				e.printStackTrace();
			}
		}
	}
	
}
