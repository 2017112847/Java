package test4.sub2;

public class Product {
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	 public Product(String productId, String productName, int price, int stockQuantity) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	        this.quantity = stockQuantity;
	    }


	public void updatePrice(int newPrice) {
        this.price = newPrice;
        System.out.println(productName + " 가격 수정 됨");
    }

    public void addStock(int amount) {
        this.quantity += amount;
        System.out.println( productName + " " + amount + "개 재고 추가 됨");
    }
	public void printProductInfo() {
		System.out.println("상품 id :"+ productId);
		System.out.println("상품 이름 :"+ productName);
		System.out.println("상품 가격 :"+ (int)price);
		System.out.println("재고 수량 :"+ quantity);
	}

}
