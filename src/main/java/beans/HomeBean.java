package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HomeBean {
	private static final String SITETITLE = "Pizza Bestellservice";
	
	@ManagedProperty(value=SITETITLE)
	private String seitenTitel;

	public String getSeitenTitel() {
		return seitenTitel;
	}

	public void setSeitenTitel(String seitenTitel) {
		this.seitenTitel = seitenTitel;
	}
}
