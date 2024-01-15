
class StarMaking {

	public static void main(String[] args) {
		// 별 찍어서 도형을 만들어보기
		int x = 5; // 제한 수 
		
//		// 1. 5*5 개 출력 
//		for(int i = 1;i<=x ;i++) {
//			for(int j = 1; j<=x ; j++) {
//				System.out.print("*");				
//			}
//			System.out.println();
//		}
		// 2. 1, 2, 3, 4, 5 개 출력
//		for(int i = 1 ; i<=x ;i++) {
//			for(int j = 1 ; j<=i ; j++) {
//				System.out.print("*");				
//			}
//			System.out.println();
//		}
		// 3. 5, 4, 3, 2, 1개 출력
//		for(int i = 1 ; i<=x ;i++) {
//			for(int j = i ; j<=x ; j++) {
//				System.out.print("*");				
//			}
//			System.out.println();
//		}
		// 4. 오른쪽으로 붙은 삼각형 모양으로 1,2,3,4,5 개 출력
//		for(int i = 1 ; i <= x ;i++) {
//			for(int j = 1 ; j <= x ; j++) {
//				if((j + i) >=6 )
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		// 5. 내가 원하는 모양
		// 나중으로 미루고, 우선 문제풀이
//		for(int i = 1;i<=x ;i++) {
//			for(int j = 1; j<=x ; j++) {
//				System.out.print(i);				
//			}
//			System.out.println();
//		}
		
//		for(int i = 1;i<=x ;i++) {
//			for(int j = 1; j<=x ; j++) {
//				System.out.print(i+j);				
//			}
//			System.out.println();
//		}
		// 6번 삼각형 만들어보기
		for(int i = 1 ; i <= x ;i++) {
			int k = i - x;
			for(int j = 1 ; j < x+i ; j++) {
				if((Math.abs(k)-j)>= 0)
					System.out.print("0");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
