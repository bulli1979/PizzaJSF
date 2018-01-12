package constants;

public enum Sites {
	HOME(1),ORDERPIZZA(2),OVERVIEWEXTRAS(3),PERSONALDATA(4),OVERVIEW(5),THANKYOU(6);
	private final int site;
	
	private Sites(final int step){
		this.site = step;
	}
	public int getSite(){
		return this.site;
	}
	public static Sites getSite(int siteIndex) {
		for(Sites s : Sites.values()){
			if(s.getSite()==siteIndex){
				return s;
			}
		}
		return null;
	}
}
