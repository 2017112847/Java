package sub4;
/**	07.15
 * 	상속(InheriTest)
 */
public class InheriTest {public static void main(String[] args) {
	Sedan genessis = new Sedan("제네시스 g80", "검정색", 0, 3000);
	genessis.speedUp(100);
	genessis.turbo();
	genessis.speedDown(10);
	genessis.show();
	
	Truck bongo = new Truck("봉고", "블루",0,0);
	bongo.load(100);
	bongo.speedUp(40);
	bongo.speedDown(1);
	bongo.show();
	
	//stock account 실습
	StockAccount kb = new StockAccount("kn", "1234", "미미미", 10000, "삼전", 10, 10);
	kb.deposit(1000000);
	kb.withdraw(50000);
	kb.buy(5, 80000);
	kb.show();
	
	kb.sell(5, 90000);
	kb.show();
	
	Doctor doctor = new Doctor("rladbtls",23,"thdkrhk");
	Engineer engineer = new Engineer("rlawnstn",21,"thvmxmdnpdj");
	
	doctor.work();
	engineer.work();
	
	
}

}
