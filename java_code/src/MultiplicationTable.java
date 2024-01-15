
class MultiplicationTable {

	public static void main(String[] args) {
//		// 1. 구구단 출력 
//		for(int i = 1; i < 10; i++) {
//			for(int j = 1; j < 10 ; j++) {
//				System.out.println(i + " * " + j +" = " + (i*j));
//			}
//			System.out.println();
//		}
//		 2. 구구단 중 짝수단 출력 
//		for(int i = 2; i < 10; i += 2 ) {
//			for(int j = 1; j < 10 ; j++) {
//				System.out.println(i + " * " + j +" = " + (i*j));
//			}
//			System.out.println();
//		}
		// 2. 문제 풀이 : 선생님 추천 방식
//		for(int i = 1; i < 10; i++ ) {
//			if(i % 2 == 1)
//				continue;			
//			for(int j = 1; j < 10 ; j++) {
//				System.out.println(i + " * " + j +" = " + (i*j));
//			}
//			System.out.println();
//		}
		// 3. 구구단 중 결과값이 홀수인 것만 나오게 하시오. 
//		for(int i = 1; i < 10; i++) {
//			for(int j = 1; j < 10 ; j++) {
//				int k = i*j; 
//				if(k % 2 == 0)
//					continue;
//				System.out.println(i + " * " + j +" = " + k);
//			}
//			System.out.println();
//		}
		// 코딩 방식은 정답이 정해져 있지 않다. 효율적이냐 비효율적이냐의 차이는 있겠지만.
		// 4. 3의 배수단을 뽑아내시오.(3,6,9)
//		for(int i = 1; i < 10; i++) {
//			if(i % 3 != 0)
//				continue;
//			for(int j = 1; j < 10 ; j++) { 
//				System.out.println(i + " * " + j +" = " + i*j);
//			}
//			System.out.println();
//		}
		int count = 0;
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10 ; j++) {
				int k = i*j; 
				if(k % 2 == 0 && k % 3 == 0)
					count++;
			}
		}
		System.out.println(count);
	}

}
