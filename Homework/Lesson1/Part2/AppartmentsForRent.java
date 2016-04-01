public class AppartmentsForRent {
         private double price; 
         private int quantityOfRooms; 
         private int floor;
         private int livingSquare;
         private boolean isElevator; 
         private boolean isBath;
         private boolean isInternet;
         private boolean isBalcony;
         private boolean twoLevelApartment;
         private boolean isParking;

public AppartmentsForRent (double price, int quantityOfRooms, int floor, int livingSquare){
      this.price = price;
      this.quantityOfRooms = quantityOfRooms;
      this.floor = floor;
      this.livingSquare = livingSquare;
}
public double getPrice(){
   return price;
}
public void setPrice(double price){
   this.price = price;
}
private void connectInternet() {
	isInternet = false;
}
private void selectQuantityOfRooms() {
	
}
private void selectFloor() {
	
}
private void selectAppartmentWithElevator() {
	
}
private void selectLivingSquare() {
	
}
private void selectAppartmentWithBalcony() {
	
}
private void rentTwoLevelAppartment() {
	
}
private void rentAppartmentWithParking() {
	
}
}