package beans;

import java.text.DecimalFormat;

public abstract class AbstractBeanFunctions {
	private String pattern = "###,##0.00";
	private DecimalFormat decimalFormat = new DecimalFormat(pattern);
	public String format(double price){
		return decimalFormat.format(price);
	}
}
