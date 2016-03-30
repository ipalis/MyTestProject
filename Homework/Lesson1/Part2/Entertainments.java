import java.sql.Time;
import java.util.Date;
public class Entertainments {
			private String speciesOfEntertainments;
			private double price;
			private String placeOfEntertainments;
			private Time timeOfEntertainments;
			private int duration;
			private boolean isCollective;
			private boolean isForChildren;
			private int ageLimit;
			private String gender;
			private double weightLimit;
			
			
public Entertainments (String speciesOfEntertainments, double price, String placeOfEntertainments,
		Time timeOfEntertainments, int duration){
		 	this.speciesOfEntertainments = speciesOfEntertainments;
			this.price = price;
			this.placeOfEntertainments = placeOfEntertainments;
			this.timeOfEntertainments =timeOfEntertainments;
			this.duration = duration;
			}


public String getSpeciesOfEntertainments() {
	return speciesOfEntertainments;
}
public void setSpeciesOfEntertainments(String type){
	this.speciesOfEntertainments = speciesOfEntertainments;
}

public double getPrice() {
	return price;
}
public void setPrice(double price){
	this.price = price;
}
public void lowerAgeLimit(int decrement){
	ageLimit -= decrement;
}

public void priceUp(double increment) {
    price += increment;
}
public void allowForChildren() {
	isForChildren = true;	
}
public void setQuantityPerson() {
	isCollective = true;	
}
public double getWeightLimit() {
	return weightLimit;
}
public void setWeightLimit(double weightLimit){
	this.weightLimit = weightLimit;
}
}