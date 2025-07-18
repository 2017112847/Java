package sub4;

public class StockAccount extends Account{
	private String stock;
	private int amount;
	private int price;
	
	public StockAccount(String bank, String id, String name, int balance, String stock,
			int amount, int price) {
		super(bank, id, name, balance);
		
		this.stock =stock;
		this.amount = amount;
		this.price = price;
	}
	public void sell(int amount, int price) {
		this.amount -= amount;
		this.balance += amount * price;
		
	} 
	public void buy(int amount, int price) {
		this.amount += amount;
		this.balance -= amount * price;
	}
	public void show() {
		System.out.println("증권사 :"  + this.bank);
		System.out.println("계좌 :"  + this.id);
		System.out.println("입금주 :"  + this.name);
		System.out.println("잔액 :"  + this.balance);
		System.out.println("종목 :"  + this.amount);
		System.out.println("수량 :"  + this.stock);
		System.out.println("가격 :"  + this.price);
	}

}
