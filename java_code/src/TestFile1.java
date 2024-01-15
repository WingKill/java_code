
class TestFile1 {

	public static void main(String[] args) {
//		//1. 1~100까지의 합
//		int t = 0;
//		for(int x = 1; x<= 100 ; x++) {
//			t += x;
//		}
//		System.out.println(t);
//
//		//2. 1~100까지의 짝수의 합
//		int t = 0;
//		for(int x = 0; x<= 100 ; x+=2) {
//			t += x;
//		}
//		System.out.println(t);
//
//		//3. 7의 배수이자 11의 배수인 첫 번째 숫자는?
//		int y = 0;
//		for(int x = 1; x <= 100 ; x++) {
//			if((x%7)== 0 && (x%11)== 0) {
//				y = x;
//				System.out.println(y);
//				break;
//			}
//		}
//
//		//4. 구구단 출력
//		for(int i = 1; i <= 9 ; i++) {
//			System.out.println(i+"단");
//			for(int j = 1; j <= 9 ; j++) {
//				System.out.println(i + " * " + j + " = " + (i*j));
//			}
//		}
//
//		//5. 구구단 짝수단만 
//		for(int i = 1; i <= 9 ; i++) {
//			if(i%2 == 0) {
//				System.out.println(i+"단");
//				for(int j = 1; j <= 9 ; j++) {
//					System.out.println(i + " * " + j + " = " + (i*j));
//				}
//			}			
//		}
//
//		//6. 최대값 구하기
//		int num1 = -6;
//		int num2 = 10;
//		int num3 = 1;
//		
//		int x = (num1 > num2) ? (( num1 > num3 )? num1 : num3) : (( num2 > num3 )? num2 : num3);
//		System.out.println(x);
//
//		//7. 왼쪽으로 붙은 12345 별찍기
//		for(int i = 1; i <= 5 ; i++) {
//			for(int j = 1; j <= i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		//8. 왼쪽으로 붙은 54321 별찍기 
//		for(int i = 1; i <= 5 ; i++) {
//			for(int j = 1; j <= (6 - i) ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//9. 오른쪽으로 붙은 12345 
//		for(int i = 1; i <= 5 ; i++) {
//			for(int j = 1; j <= 5 ; j++) {
//				if( j <= (5-i) ) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}				
//			}
//			System.out.println();
//		}
//		
//		//10. 오른쪽으로 붙은 54321
//		for(int i = 1; i <= 5 ; i++) {
//			for(int j = (6-i); j < 5 ; j++) {
//				System.out.print(" ");
//			}
//			for(int j = i; j <= 5 ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		// 내가 원하는 모양
//		for(int i = 1; i <= 5 ; i++) {
//			for(int j = 1 ; j < 4-i ; j++) {
//				System.out.print(" ");
//			}
//			for(int j = i ; j > (6-i) ; j-=2 ) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= ((2*i)-1) ; j++) {
//				if(i>=4)
//					break;
//				System.out.print("*");
//			}
//			
//			for(int j = i ; j <= 10-i ; j++) {
//				if(i<4)
//					break;
//				System.out.print("*");
//			}
//			System.out.println();
//		}		
//		
//		for(int i = 1; i <= 5 ; i++) {
//			for(int j = 1 ; j < 4-i ; j++) {
//				System.out.print(" ");
//			}
//			for(int j = i ; j > (6-i) ; j-=2 ) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= ((2*i)-1) ; j++) {
//				if(i>=4)
//					break;
//				System.out.print("*");
//			}
//			
//			for(int j = i ; j <= 10-i ; j++) {
//				if(i<4)
//					break;
//				System.out.print("*");
//			}
//			System.out.println();
//		}	
		
		char ch = '가';
		System.out.println(ch + "\n");
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j < i;j++) {
//				System.out.print("1");
//			}
//			for(int j = i; j <=5;j++) {
//				System.out.print("*");
//			}			
//			System.out.println();
//		}
	}
}
