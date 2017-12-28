package constants;

public enum Sites {
	HOME(1),ORDERPIZZA(2),OVERVIEW(3),PERSONALDATA(4),THANKYOU(5);
	private final int site;
	
	private Sites(final int step){
		this.site = step;
	}
	public int getSite(){
		return this.site;
	}
}
