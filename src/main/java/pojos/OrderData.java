package pojos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderData {
	private List<Pizza> pizzas;
	private double price = 0;
	private String firstName;
	private String name;
	private String street;
	private String zip;
	private String city;
	private String telephone;
	private String user;
	private Pizza selectExtraPizza;
	private String deliveryTime = "60";

	public OrderData() {
		pizzas = new ArrayList<Pizza>();
	}

	public String getCity() {
		return city;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public String getDeliveryTimeFromNow() {
		long delTime = Integer.parseInt(this.deliveryTime) * (long) 60000;
		Date finalTime = new Date(delTime + (new Date().getTime()));
		SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy HH:mm");
		return formater.format(finalTime);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getName() {
		return name;
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public double getPrice() {
		return price;
	}

	public Pizza getSelectExtraPizza() {
		return selectExtraPizza;
	}

	public String getStreet() {
		return street;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getUser() {
		return user;
	}

	public String getZip() {
		return zip;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public void setDeliveryTimeFromNow() {

	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setSelectExtraPizza(Pizza selectExtraPizza) {
		this.selectExtraPizza = selectExtraPizza;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
}
