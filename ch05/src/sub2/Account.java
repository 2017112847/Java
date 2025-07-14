package sub2;

public class Account {
	
	//속성
	public String bank;
	public String id;
	public String name;
	public int balance;
	
	public Account(String bank, String id, String name, int balance) {
		this.name = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	//기능
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("------------");
		System.out.println("은행명: " +this.bank);
		System.out.println("계좌번호 : "+ this.id);
		System.out.println("입금주 : "+this.name);
		System.out.println("현제 금액 : "+this.balance);
		System.out.println("------------");
	}
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
}
