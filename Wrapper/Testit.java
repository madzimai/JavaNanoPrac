class Product {
	double price;
}
public  class Testit {
	public void updatePrice (Product product, double price){
	price = price * 2;
	product.price = product.price + price;
	System.out.println("hey this price  ", price);
	

}
public static void main (String[] args) {
	Product prt = new Product();
	prt.price = 200;
	double newPrice = 100;

	Testit t = new Testit();
	t.updatePrice(prt,newPrice);
	System.out.println(prt.price + " : " + newPrice);
}


} 
