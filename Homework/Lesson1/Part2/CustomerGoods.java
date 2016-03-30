import java.sql.Time;
import java.util.Date;
public class CustomerGoods {
	            private String name;
				private boolean isFood;
				private boolean boughtInSuperMarkets;
				private double price;
				private boolean delivery;
				private String quality;
				private boolean packaging;
				private double size;
				private String color;
				private String manufacturer;
				private String addressDelivery;
				private Time timeDelivery;	
				
				
				
	public CustomerGoods(String name, Boolean isFood, Double price, Boolean delivery) {
			this.name = name;
			this.isFood = isFood;
			this.price = price;
			this.delivery = delivery;
	}
	
	public CustomerGoods () {
		name = "";
		isFood = true;
		price = 0.0;
		delivery = true;
		quality = "high";
		packaging = true;
	}

public String getName() {
	return name;
}

public void setName(String name){
	this.name = name;		
}

public boolean boughtInWeb(){
	return !boughtInSuperMarkets;
}

private double priceForPackaging(){
	double result = 0;
	if (packaging&boughtInWeb())
		result += size  * 0.02;
	return result;
}

public double totalPrice() {
	return price + priceForPackaging();
}

public void orderDelivery(String address, Time time) {
	delivery = true;
	addressDelivery = address;
	timeDelivery = time;
}

public void orderPackiging(){
	packaging = true;
}

public void cancelDelivery() {
	delivery = false;
    addressDelivery = "";
    timeDelivery.setTime(0);
}

public double getSize(){
	return size;
}

public String toString() {
	return " Name of goods: "  +name+ " Price = " +price+ " Package: " +packaging+ " Delivery: " +delivery;
}
}
