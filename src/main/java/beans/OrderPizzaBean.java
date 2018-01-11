package beans;

import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import constants.Sites;
import data.DAOStaticData;
import pojos.Pizza;

@ManagedBean
@SessionScoped
public class OrderPizzaBean extends AbstractBeanFunctions{
	private List<Pizza> pizzaList;
	@ManagedProperty(value="#{applicationBean}")
	private ApplicationBean appBean;	
	
	public OrderPizzaBean(){
		if(pizzaList == null){
			try{
				pizzaList = DAOStaticData.getAll();
			}catch(Exception e){
				System.out.println("Error in getPizzas DB!");
				e.printStackTrace();
			}
		}
	}
	
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

	public void changePizza(int index){
		Pizza pizza = pizzaList.get(index);
		int count = getAmount(pizza);
		while(count>0){
			appBean.getOrderData().getPizzas().add(pizza.clonePizza());
			count--;
		}
	}

	private int getAmount(Pizza pizza) {
		int count = 0;
		Iterator<Pizza> it = appBean.getOrderData().getPizzas().iterator();
		while(it.hasNext()){
			Pizza userPizza = it.next();
			if(userPizza.getId() == pizza.getId()){
				if(count == pizza.getSelectAmount()){
					it.remove();
				}else{
					count++;
				}
			}
		}
		return pizza.getSelectAmount()-count;
	}
	
	public void plus(int index){
		Pizza pizza = pizzaList.get(index);
		pizza.setSelectAmount(pizza.getSelectAmount()+1);
		appBean.getOrderData().getPizzas().add(pizza.clonePizza());
	}
	
	public void minus(int index){
		Pizza pizza = pizzaList.get(index);
		if(pizza.getSelectAmount()>0){
			Iterator<Pizza> it = appBean.getOrderData().getPizzas().iterator();
			pizza.setSelectAmount(pizza.getSelectAmount()-1);
			while(it.hasNext()){
				Pizza userPizza = it.next();
				if(userPizza.getId() == pizza.getId()){
					it.remove();
					break;
				}
			}
		}
	}
	
	public void nextStep(){
		appBean.setSite(Sites.OVERVIEWEXTRAS);
	}
}
