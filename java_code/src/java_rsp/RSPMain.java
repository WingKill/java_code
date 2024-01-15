package java_rsp;

import java.util.Scanner;

public class RSPMain {
	public static void main(String[] args) {
		 
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("가위 바위 보를 입력하세요");
			String rsp = sc.next();
			
			Player user = new Player(rsp);
			Player computer = new Player();
			
			computer.getResult(user);
			
			System.out.println("계속 : Y / 중단 : N");
			
			char ch = sc.next().charAt(0);
			
			if(ch == 'N' || ch == 'n')
				break;
		}	
		System.out.println("게임이 종료되었습니다");
	}
}
