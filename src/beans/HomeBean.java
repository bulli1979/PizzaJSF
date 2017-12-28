package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HomeBean {
	private int site=2;
	
	@ManagedProperty(value="Pizza Bestellservice")
	private String seitenTitel;

	public String getSeitenTitel() {
		return seitenTitel;
	}

	public void setSeitenTitel(String seitenTitel) {
		this.seitenTitel = seitenTitel;
	}
	
	
	
	
}
