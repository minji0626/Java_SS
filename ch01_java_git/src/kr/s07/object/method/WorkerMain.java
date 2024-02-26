package kr.s07.object.method;

class Worker{
	/*
	 [실습]
	 Worker
	 1) 멤버 변수 : 직원 이름(name) , 급여 (money), 계좌 잔고(balance) -> 정의하는 변수들
	 2) 멤버 메서드 : work(실행하면 money 에 1000원이 누적이 된다.)
	 					deposit (실행하면 money의 돈을 balance에 누적시키고, money는 0처리한다.)
	 WorkerMain의 main
	 1) Worker 객체 생성
	 2) 직원의 이름 지정
	 3) 10번 일하는데 번 돈이 3000원일 때마다 계좌에 3000원 저축한다.
	 4) 직원 이름(name), 현재 계좌에 입금되지 않고 남아있는 급여(money), 계좌 잔고(balance)를 출력하라
	 */
	
	String name;
	int money;
	int balance;
	
	public void work(){ //일하는 메소드
		money += 1000;
		
	}
	
	public void deposit(){ //저축하는 메소드
		balance += money; //누적시키고 
		money = 0;			  //0처리
	}

}

public class WorkerMain {
	public static void main(String[] args) {
		Worker w = new Worker();
		
		w.name = "이동욱"; // 직원의 이름을 지정함
		
		//10번 일하는데 번 돈이 3000원이 되면 저축을 실행한다.
		for(int i = 1; i <11; i++) {
			w.work();
			if (w.money >= 3000) { //3000원마다 저축
											// w.money % 3000 == 0 
				w.deposit();
			}
		}
		System.out.println("직원의 이름은 " + w.name + "입니다.");
		System.out.printf("계좌에 입금되지 않고 남아있는 급여는 %,d원입니다.%n" , w.money);
		System.out.printf("계좌 잔고는 %,d원입니다.",w.balance);
	}

}
