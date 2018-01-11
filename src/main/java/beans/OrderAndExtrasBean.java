package beans;

import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import constants.Sites;
import data.DAOStaticData;
import pojos.Extra;
import pojos.Pizza;

@ManagedBean
@SessionScoped
public class OrderAndExtrasBean extends AbstractBeanFunctions {
	private List<Extra> extraList;
	private Pizza editPizza;
	@ManagedProperty(value="#{applicationBean}")
	private ApplicationBean appBean;

	public OrderAndExtrasBean(){
		if(extraList == null){
			try{
				extraList = DAOStaticData.getAllExtras();
			}catch(Exception e){
				System.out.println("Error in getExtras DB!");
				e.printStackTrace();
			}
		}
	}
	public void addExtraListener(ActionEvent event) throws CloneNotSupportedException {
		editPizza = (Pizza) event.getComponent().getAttributes().get("pizza");
		if(editPizza != null){
			if( editPizza.getSelectedExtra()!=null){
				editPizza.getExtras().add(editPizza.getSelectedExtra().clone());
			}
		}
	}
	
	public void delExtraDelListener(ActionEvent event){
		Pizza pizza = (Pizza) event.getComponent().getAttributes().get("pizza");
		Extra extra = (Extra) event.getComponent().getAttributes().get("extra");
		Iterator<Extra> it = pizza.getExtras().iterator();
		while(it.hasNext()){
			Extra ex = it.next();
			if(ex.getId() == extra.getId()){
				it.remove();
				break;
			}
		}
	}
	
	public Pizza getEditPizza() {
		return editPizza;
	}
	public void setEditPizza(Pizza editPizza) {
		this.editPizza = editPizza;
	}
	public ApplicationBean getAppBean() {
		return appBean;
	}

	public void setAppBean(ApplicationBean appBean) {
		this.appBean = appBean;
	}	
	
	public void nextStep(){
		appBean.setSite(Sites.PERSONALDATA);
	}

	public List<Extra> getExtraList() {
		return extraList;
	}

	public void setExtraList(List<Extra> extraList) {
		this.extraList = extraList;
	}
	public Object getExtra(Integer id) {
		for(Extra extra : extraList){
			if(extra.getId() == id){
				return extra;
			}
		}
		return null;
	}
	
}
