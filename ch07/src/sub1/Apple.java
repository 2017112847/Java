package sub1;

public class Apple {
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price ;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}

	@Override
	public String toString() {
		//클래스 
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
}
