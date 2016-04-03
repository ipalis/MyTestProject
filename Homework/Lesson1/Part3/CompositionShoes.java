public class CompositionShoes extends ShoesMarket {
        
    
    public int quantityOfPair;
	public boolean isInShop;
	public int quantityOfWorkers;

   
    public CompositionShoes (int quantityOfPair, public boolean isInShop) {
        super(String speciesOfEntertainments, double price, String placeOfEntertainments,
		Time timeOfEntertainments, int duration);
        this.quantityOfPair = quantityOfPair;
		this.isInShop = isInShop;
    }   
        
   
    public void getQuantityOfPair() {
        return quantityOfPair;
    }   
    public void get isInShop() {
        return isInShop;
    }
}i