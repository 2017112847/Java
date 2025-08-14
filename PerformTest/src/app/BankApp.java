package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
	private List<Account> accounts = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		BankApp app = new BankApp();
		app.start();
		System.out.println("프로그램 종료");
	}
	private void start() {
		boolean running = true;
		while(running) {
			printMenu();
			System.out.print("선택> ");
			int choice = Integer.parseInt(sc.next());
			switch(choice) {
			case 1 -> createAccount();
			case 2 -> listAccoints();
			case 3 -> depositAccount();
			case 4 -> withdrawAccount();
			case 5 -> {
				running = false;
			}
			default -> System.out.println("올바른 번호를 선택하세요");
			}
		}
				
	}
	public void printMenu() {
		System.out.println("------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("------------------------------------------");
	}
	public void createAccount(){
		System.out.println("-------------------계좌 생성----------------");
		System.out.print("계좌번호: ");
		String accountAno = sc.next();
		System.out.print("계좌주: ");
		String accountOwner = sc.next();
		System.out.print("초기입금액: ");
		int accountBalance = sc.nextInt();
		Account newAccount = new Account(accountAno, accountOwner,accountBalance);
	    accounts.add(newAccount);

		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	
	public void listAccoints(){
		System.out.println("-------------------계좌 목록----------------");
		for(Account acc : accounts) {
			System.out.println(acc.getAno()+" "+acc.getOwner()+" "+acc.getBalance());
		}
	}
	public void depositAccount(){
		System.out.println("------------------- 예 금 -----------------");
		
		String inputAno = sc.next();
		System.out.print("계좌번호: ");
		Account zzz = null;
		
	    for (Account acc : accounts) {
	        if (acc.getAno().equals(sc.next())) {
	        	zzz = acc;
	            break;
	        }
	    }
	    if (zzz == null) {
	        System.out.println("결과: 계좌가 없습니다.");
	        return;
	    }
	    System.out.print("예금액: ");
	    int amount = Integer.parseInt(sc.next());
	    zzz.setBalance(zzz.getBalance() + amount);
	    System.out.println("결과: 예금이 성공되었습니다.");
	    
	}
	public void withdrawAccount(){
		System.out.println("------------------- 출 금 -----------------");
		
		String inputano = sc.next();
		System.out.print("계좌번호: ");
		Account xxx = null;
	    for (Account acc : accounts) {
	        if (acc.getAno().equals(sc.next())) {
	        	xxx = acc;
	            break;
	        }
	    }
	    if (xxx == null) {
	        System.out.println("결과: 계좌가 존재하지 않습니다.");
	        return;
	    }
	    System.out.print("출금액: ");
	    int amount = Integer.parseInt(sc.next());
	    xxx.setBalance(xxx.getBalance() - amount);
	    System.out.println("결과: 출금이 성공되었습니다.");
	    }

	
	public Account findAccount(String ano) {
	    for (Account acc : accounts) {
	        if (acc.getAno().equals(ano)) {
	            return acc;
	        }
	    }
	    return null;
	}

	}
